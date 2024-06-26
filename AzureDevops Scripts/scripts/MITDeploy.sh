#!/bin/sh
if [[ $# -lt 3 || $# -gt 3 ]]; then
        echo "Provide three arguments <MDM_DIR> <CBA_PATH> <WAS_ADMIN_PASSWORD>
        echo "Example: ./MITDeploy.sh /opt/App/IBM/MDM /opt/App/mdmaepoc/artifacts/*.cba wasadmin
        exit
fi

MDM_DIR=$1
CBA_PATH=$2
INSTANCE_ID=E001
hostname=`hostname`
OIFS=$IFS
IFS='.'
hostname=($hostname)
IFS=$OIFS
ENV_HOSTNAME=${hostname[0]}
mkdir -p tmp/cba
cp $CBA_PATH tmp/cba
cd tmp/cba
unzip -o -q *.cba
BUNDLE_VERSION=`sed -n '/^Bundle-Version/s/^Bundle-Version: *//p' META-INF/COMPOSITEBUNDLE.MF`
BUNDLE_NAME=`sed -n '/^Bundle-Name/s/^Bundle-Name: *//p' META-INF/COMPOSITEBUNDLE.MF`
cd ../..
rm -Rf tmp/cba
./wsadmin.sh -lang jython -username wasadmin -password wasadmin -f MITDeploy.py $CBA_PATH $INSTANCE_ID $BUNDLE_NAME $BUNDLE_VERSION
