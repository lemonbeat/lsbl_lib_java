#!/usr/bin/env bash
set -e

chmod +x gradlew

TAG=${1:-""}

rm -Rf src/main/java/com/lemonbeat/lsbl/lsbl*
rm -Rf lsbl_xsd
git clone git@gitlab.lemonbeat.com:sw/mgmt/common/lsbl_xsd.git
cd lsbl_xsd

if [ "$TAG" != "" ]; then
    git checkout tags/$TAG
    sed -i "s/VERSION = \"master\";/VERSION = \"$TAG\";/" ../src/main/java/com/lemonbeat/lsbl/LsBL.java
else
    VERSION=`cat VERSION`
    sed -i "s/VERSION = \"master\";/VERSION = \"$VERSION\";/" ../src/main/java/com/lemonbeat/lsbl/LsBL.java
fi

xjc -no-header -b bindings.xml -d ../src/main/java xsd/lsbl.xsd
cd ..
./gradlew test
./gradlew build
