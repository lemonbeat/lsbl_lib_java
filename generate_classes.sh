#!/usr/bin/env bash
set -e
pushd .
cd lsbl_xsd
xjc -no-header -b bindings.xml -d ../src/main/java xsd/lsbl.xsd
popd