#!/bin/bash

MDM_DIR=/opt/App/IBM/MDM
WAS_DIR=/opt/App/IBM/WebSphere/AppServer/
CBA_DIR=/opt/App/mdmaepoc/artifacts
MDM_ADMIN_PASSWORD="wasadmin"

CURRENT_DIR=$(pwd)

cd $WAS_DIR/bin

echo "Removing CBAs"
for cba_file in $CBA_DIR/*.cba;
do
	./MITRemove.sh $MDM_DIR $cba_file $MDM_ADMIN_PASSWORD
done

echo "Complete"
