#############################################################################################################################
#																															#
#			Instruction:																									#
#			1. Copy Config.properties file in /webAS/<MDM>/deployments/Config.properties								#
#			2. Copy CAMDeploy.py file in /webAS/<MDM>/deployments/MITDeploy.py										#
#			3. Copy CAMDeploy.sh file in /webAS/<MDM>/deployments/MITDeploy.sh										#
#			4. Goto this path: /webAS/<MDM>/deployments/																#
#			5. Execute below command.																						#
#				./MITDeploy.sh addVersion																					#
#																															#
#############################################################################################################################

import sys
import ConfigParser
import time
import os

#------------------------------------------------------------------------------
# Get a tuple containing the cell, node, server name, and type
#------------------------------------------------------------------------------
def getCellNodeServer():
	servers = AdminConfig.list("Server").splitlines()
	for serverId in servers:
		serverName = serverId.split("(")[0]
		server = serverId.split("(")[1]  #remove name( from id
		server = server.split("/")
		cell = server[1]
		node = server[3]
		cellId = AdminConfig.getid("/Cell:" + cell + "/")
		cellType = AdminConfig.showAttribute(cellId, "cellType")
		if cellType == "DISTRIBUTED":
			if AdminConfig.showAttribute(serverId, "serverType") == "DEPLOYMENT_MANAGER":
				return (cell, node, serverName, "DEPLOYMENT_MANAGER") 
		elif cellType == "STANDALONE":
			if AdminConfig.showAttribute(serverId, "serverType") == "APPLICATION_SERVER":
				return (cell, node, serverName, "APPLICATION_SERVER") 
	return None	

def setValuesToArguments(headerName):
	try:
		config = ConfigParser.ConfigParser()
		config.read('Config.properties')
		print headerName
		symbolicName = config.get(headerName, 'symbolicName')
		cuName = config.get(headerName, 'cuName')
		blaID = config.get(headerName, 'blaID')
		cuID = config.get(headerName, 'cuID')
		compUnitStatusStep = config.get(headerName, 'compUnitStatusStep')
		fileLocation = config.get(headerName, 'fileLocation').replace("'","")
		cbaFileLocation = "'"+fileLocation+symbolicName.replace("'","")+"_"+addVersion+".cba'"
		clusterName = config.get(headerName, 'clusterName')
		return (symbolicName, cuName, blaID, cuID, compUnitStatusStep, cbaFileLocation, clusterName)
	except:
		print "Error occurred while assigning values to arguments.. ", sys.exc_info()
		return None
		
def doStopCluster(clusterName):
	topology = getCellNodeServer()
	if topology == None:
		sys.stderr.write("Could not find suitable server\n")
		if failOnError == "true":
			sys.exit(105)
	else:
		cell = topology[0]
		node = topology[1]
		server = topology[2]
		type = topology[3]
		clusterName = clusterName.replace("'","")
		cluster = AdminControl.completeObjectName('cell='+cell+',type=Cluster,name='+clusterName+',*')
		state = AdminControl.getAttribute(cluster, 'state')
		print "Stop State : " + state
		AdminControl.invoke(cluster, 'stopImmediate')
		state = AdminControl.getAttribute(cluster, 'state')
		print "Stop State : " + state
		print "Cluster Stopped."


def addLocalRepositoryBundle(cbaFileLocation):
	try:
		print 'Adding the CBA to internal repository bundle..'
		AdminTask.addLocalRepositoryBundle('-file '+cbaFileLocation)
		print 'Saving the configuration'
		AdminConfig.save()
		print 'CBA successfully added to internal repository bundle and saved.'
		return 1
	except:
		print 'Adding the CBA to internal repository bundle failed..', sys.exc_info()
		return 0

def addOSGiExtension(cuName, symbolicName, addVersion):
	try:
		print 'Adding new CBA to OSGi Extension..'
		AdminTask.addOSGiExtension('-cuName '+ cuName +' -symbolicName '+symbolicName +' -version ' + addVersion)
		print 'Saving the configuration'
		AdminConfig.save()
		print 'New CBA successfully added to OSGi Extension and saved.'
		return 1
	except:
		print 'Adding new CBA to OSGi Extension failed..', sys.exc_info()
		return 0

def removeOSGiExtension(cuName, symbolicName, removeVersion):
	try:
		print 'Removing old CBA from OSGi Extension..'
		AdminTask.removeOSGiExtension('-cuName '+ cuName +' -symbolicName ' +symbolicName +' -version '+removeVersion)
		print 'Saving the configuration'
		AdminConfig.save()
		print 'Old CBA successfully removed to OSGi Extension and saved the changes.'
		return 1
	except:
		print 'Removing old CBA to OSGi Extension failed..', sys.exc_info()
		return 0
		
def updateToLatestDeployment(blaID, cuID, compUnitStatusStep):
	try:
		print 'Starting update to latest deployment..'
		AdminTask.editCompUnit('[-blaID '+blaID +' -cuID '+ cuID +' -CompUnitStatusStep [['+compUnitStatusStep +' true]]]')
		print 'Saving the configuration'
		AdminConfig.save()
		print 'Update the latest deployment successded and saved the configuration.'
		return 1
	except:
		print 'Update the latest deployment failed..', sys.exc_info()
		return 0

#------------------------------------------------------------------------------
# Starting cluster
#------------------------------------------------------------------------------
def doStartCluster(clusterName):
	topology = getCellNodeServer()
	if topology == None:
		sys.stderr.write("Could not find suitable server\n")
		return 0
	else:
		try:
			cell = topology[0]
			node = topology[1]
			server = topology[2]
			type = topology[3]
			clusterName = clusterName.replace("'","")
			cluster = AdminControl.completeObjectName('cell='+cell+',type=Cluster,name='+clusterName+',*')
			AdminControl.invoke(cluster, 'start')
			print "Starting cluster.."
			state = AdminControl.getAttribute(cluster, 'state')
			while (1):
				if state == 'websphere.cluster.running' :
					print "Cluster Started Successfully.."
					break
				else:
					time.sleep(30)
					print "Cluster start is in progress.."
					state = AdminControl.getAttribute(cluster, 'state')
			return 1
		except:
			print 'Cluster start failed..', sys.exc_info()
			return 0

#------------------------------------------------------------------------------
# Get remove CBA version
#------------------------------------------------------------------------------

def getRemoveCBAVersion(cuName):
	try:
		removeVersion = None
		listExtensions = AdminTask.listOSGiExtensions('-cuName '+ cuName).splitlines()
		
		for extensionId in listExtensions:
			if extensionId.find("MITBusinessComponents.cba") != -1:
				extensionName = extensionId.split()
				extName =  extensionName[0].split(";")
				removeVersion = extName[1]
				break
		print "removeVersion : ", removeVersion
		return removeVersion
	except:
		print 'Remove CBA version not found..', sys.exc_info()
		return None


#------------------------------------------------------------------------------
#Main entry point for execution
#------------------------------------------------------------------------------

if len(sys.argv) != 2:
	print "Invalid number of arguments.."
	sys.exit(101)
else:
	env = sys.argv[0]
	addVersion = sys.argv[1]
	
	if env == "chn-mit-rbspocibmmdm01":
		headerName = 'MITSection'
	elif env == "ausilvmcamapp01":
		headerName = 'DITSection'
	elif env == "ausulvmcamapp01":
		headerName = 'GE1Section'
	elif env == "ausulvmcamapp02":
		headerName = 'GE2Section'
	elif env == "ausulvmcamapp03":
		headerName = 'GE3Section'
	else:
		print "Invalid hostname : ", env
		sys.exit(101)
	
	cbaFileLocation = ""
	cuName = ""
	symbolicName = ""
	blaID = ""
	cuID = ""
	compUnitStatusStep = ""
	clusterName = ""
	variableValues = setValuesToArguments(headerName)
	print variableValues
	
	cbaFileExist = 0
	removeVersionExist = 0

	#retVal = variableValues[0]
	if variableValues != None:
		symbolicName = variableValues[0]
		cuName = variableValues[1]
		blaID = variableValues[2]
		cuID = variableValues[3]
		compUnitStatusStep = variableValues[4]
		cbaFileLocation = variableValues[5]
		clusterName = variableValues[6]
		
		#Checking if CBA to be added is present at specified location.
		filePath = cbaFileLocation.replace("'","")
		isfile = os.path.exists(filePath)
		print isfile
		if isfile:
			print "CBA to be added is present."
			cbaFileExist = 1
		else:
			print "CBA is not present.. Check the CBA filename or CBA add version.."
		
		removeVersion = getRemoveCBAVersion(cuName)
		
		if removeVersion != None:
			removeVersionExist = 1
		
		if cbaFileExist and removeVersionExist:
			doStopCluster(clusterName)
			retVal = addLocalRepositoryBundle(cbaFileLocation)
			if retVal == 1:
				retVal = removeOSGiExtension(cuName, symbolicName, removeVersion)
			if retVal == 1:
				retVal = addOSGiExtension(cuName, symbolicName, addVersion)
			if retVal == 1:
				retVal = updateToLatestDeployment(blaID, cuID, compUnitStatusStep)
			if retVal == 1:
				retVal = doStartCluster(clusterName)
			if retVal == 1:
				print "Deployment completed successfully."
			else:
				print "Error occurred.."
	
