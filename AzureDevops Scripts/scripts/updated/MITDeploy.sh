#!/bin/sh

MDM_DIR=/opt/App/IBM/MDM
CBA_PATH=/opt/App/mdmaepoc/artifacts/*.cba
INSTANCE_ID=E001
#hostname=`hostname`
#OIFS=$IFS
#IFS='.'
#hostname=($hostname)
#IFS=$OIFS
#ENV_HOSTNAME=${hostname[0]}
if [ ! -d "opt/cba" ]; then
    mkdir -p opt/cba
fi
cp $CBA_PATH opt/cba
cd opt/cba
for file in *.cba; do
    unzip -o -q "$file" -d .
done
BUNDLE_VERSION=`sed -n '/^Bundle-Version/s/^Bundle-Version: *//p' META-INF/COMPOSITEBUNDLE.MF`
BUNDLE_NAME=`sed -n '/^Bundle-Name/s/^Bundle-Name: *//p' META-INF/COMPOSITEBUNDLE.MF`
cd ../..
rm -Rf opt/cba
./wsadmin.sh -lang jython -username wasadmin -password wasadmin -f MITDeploy.py $CBA_PATH $INSTANCE_ID $BUNDLE_NAME $BUNDLE_VERSION
