#!/bin/ksh
#############################################################################################################################
#																															#
#			Instruction:																									#
#			1. Copy Config.properties file in /webAS/<MDM>/deployments/Config.properties								#
#			2. Copy MITDeploy.py file in /webAS/<MDM>/deployments/MITDeploy.py										#
#			3. Copy MITDeploy.sh file in /webAS/<MDM>/deployments/MITDeploy.sh										#
#			4. Goto this path: /webAS/<MDM>/deployments/																#
#			5. Execute below command.																						#
#				./MITDeploy.sh addVersion																					#
#																															#
#############################################################################################################################
AE_HOME=/opt/webAS/deployments
cd $AE_HOME
echo "Start Time for Deployment : `date`"
hostname=`hostname`
OIFS=$IFS
IFS='.'
hostname=($hostname)
IFS=$OIFS
ENV_HOSTNAME=${hostname[0]}
addVersion=$(cut -c 27-44 <<< $(ls $AE_HOME/artifacts))
echo $addVersion
WSADMINPATH='/opt/webSpshere/AppServer/bin'
$WSADMINPATH/wsadmin.sh -lang jython -user mdmadmin -password Mdm@dm1n -f MITDeploy.py $ENV_HOSTNAME $addVersion
echo "End Time for Deployment : `date`"
