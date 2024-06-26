#!/bin/bash
echo "Setting environment variables"
MDM_DIR=/opt/App/IBM/MDM
WAS_DIR=/opt/App/IBM/WebSphere/AppServer/
CBA_DIR=/opt/App/mdmaepoc/artifacts
WAS_ADMIN_USER="wasadmin"
WAS_ADMIN_PASSWORD="wasadmin"

export PATH=$PATH:$WAS_DIR/bin
CURRENT_DIR=$(pwd)

cd $WAS_DIR/bin

echo "Adding CBAs"
for cba_file in $CBA_DIR/*.cba;
do
	./MITDeploy.sh $MDM_DIR $cba_file $WAS_ADMIN_PASSWORD
done

echo "Complete"
