import sys

if len(sys.argv) != 3:
    print("Usage: python MITRemove.py <varInstanceId> <varBN> <varBV>")
    sys.exit(1)

def syncAllNodes():
   for node in AdminConfig.list('Node').splitlines():
        nodeName = AdminConfig.showAttribute(node, 'name')
        nodeSync = AdminControl.completeObjectName('type=NodeSync,node=' + nodeName + ',*')
        try:
                AdminControl.invoke(nodeSync, 'sync')
        except:
                pass

varInstanceId = sys.argv[0]
varBN = sys.argv[1]
varBV = sys.argv[2]

AdminTask.removeOSGiExtension('-cuName com.ibm.mdm.hub.server.app-' + varInstanceId + '_0001.eba -symbolicName ' + varBN + ' -version ' + varBV)
syncAllNodes()
AdminConfig.save()
AdminTask.editCompUnit('[-blaID WebSphere:blaname=MDM-operational-server-EBA-' + varInstanceId + ' -cuID WebSphere:cuname=com.ibm.mdm.hub.server.app-' + varInstanceId + '_0001.eba -CompUnitStatusStep [[com.ibm.mdm.hub.server.app-' + varInstanceId + '.eba true]]]')
syncAllNodes()
AdminConfig.save() 
AdminTask.removeLocalRepositoryBundle('-symbolicName ' + varBN + ' -version ' + varBV)
syncAllNodes()
AdminConfig.save()
