import sys

if len(sys.argv) != 4:
    print("Usage: python MITDeploy.py <varCBAPath> <varInstanceId> <varBName> <varBVersion>")
    sys.exit(1)

def syncAllNodes():
   for node in AdminConfig.list('Node').splitlines():
	nodeName = AdminConfig.showAttribute(node, 'name')   
	nodeSync = AdminControl.completeObjectName('type=NodeSync,node=' + nodeName + ',*')
	try:
		AdminControl.invoke(nodeSync, 'sync')
	except:
		pass

varCBAPath = sys.argv[0]
varInstanceId = sys.argv[1]
varBName = sys.argv[2]
varBVersion = sys.argv[3]

AdminTask.addLocalRepositoryBundle('-file ' + varCBAPath)
syncAllNodes()
AdminConfig.save()
print 'CBA successfully added to internal repository bundle and saved.'
AdminTask.addOSGiExtension('-cuName com.ibm.mdm.hub.server.app-' + varInstanceId + '_0001.eba -symbolicName ' + varBName + ' -version ' + varBVersion)
syncAllNodes()
AdminConfig.save()
print 'New CBA successfully added to OSGi Extension and saved.'
AdminTask.editCompUnit('[-blaID WebSphere:blaname=MDM-operational-server-EBA-' + varInstanceId + ' -cuID WebSphere:cuname=com.ibm.mdm.hub.server.app-' + varInstanceId + '_0001.eba -CompUnitStatusStep [[com.ibm.mdm.hub.server.app-' + varInstanceId + '.eba true]]]')
syncAllNodes()
AdminConfig.save()
print 'Update the latest deployment successded and saved the configuration.'
