# lsbl_lib

Java library for writing and reading LsBL XMLs using Java.

Current Version: 1.4.0

## Getting started

### Create a device_description_get command

```
ObjectFactory factory = new ObjectFactory();
Lsbl lsbl = LsBL.create("SERVICE.DEMOCLIENT", "SERVICE.TOPOSERVICE", 42);
Lsbl.Cmd cmd = factory.createLsblCmd();
TopoCmd topoCmd = new TopoCmd();
DeviceDescriptionGetRequest deviceDescriptionGetRequest = new DeviceDescriptionGetRequest();
deviceDescriptionGetRequest.setSgtin("SGTIN");
topoCmd.setDeviceDescriptionGet(deviceDescriptionGetRequest);
cmd.setTopoCmd(topoCmd);
lsbl.setCmd(cmd);
System.out.println(LsBL.write(lsbl));
```

### Parsing a device_description_get LsBL from string

```
Lsbl lsbl = LsBL.parse(lsblXML)
```

## Regenerate classes using JAXB

```bash
# Delete everything in com.lemonbeat.lsbl except for LsBL.java

rm -Rf lsbl_xsd
git clone git@gitlab.lemonbeat.com:sw/mgmt/common/lsbl_xsd.git
cd lsbl_xsd
git checkout tags/1.4.0

# On windows
xjc.exe -d ..\src\main\java xsd\lsbl.xsd
# On linux
xjc -d ../src/main/java xsd/lsbl.xsd
```

Move all generated classes to com.lemonbeat.lsbl package using IntelliJs refactoring feature.

Mark all generated files, and choose "Refactor" -> "Move" -> "Move XX Packages to another package"
