#!/bin/sh
MDM_DIR=/opt/App/IBM/MDM
INSTANCE_ID=E001
CBA_PATH=/opt/App/mdmaepoc/artifacts/*.cba
if [ ! -d "opt/oldcba" ]; then
    mkdir -p opt/oldcba
fi
cp $CBA_PATH opt/oldcba
cd opt/oldcba
for file in *.cba; do
    unzip -o -q "$file" -d .
done
BUNDLE_VERSION=`sed -n '/^Bundle-Version/s/^Bundle-Version: *//p' META-INF/COMPOSITEBUNDLE.MF`
BUNDLE_NAME=`sed -n '/^Bundle-Name/s/^Bundle-Name: *//p' META-INF/COMPOSITEBUNDLE.MF`
cd ../..
rm -Rf opt/oldcba
./wsadmin.sh -lang jython -username wasadmin -password wasadmin -f MITRemove.py $INSTANCE_ID $BUNDLE_NAME $BUNDLE_VERSION
