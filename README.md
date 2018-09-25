# lsbl_lib

Java library for writing and reading LsBL XMLs using Java.

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
cd lsbl_lib
git clone git@gitlab.lemonbeat.com:sw/mgmt/common/lsbl_xsd.git

# On windows
xjc.exe -d src\main\java lsbl_xsd\xsd\lsbl.xsd
# On linux
xjc -d src/main/java lsbl_xsd/xsd/lsbl.xsd

Move all generated classes to com.lemonbeat.lsbl package using IntelliJ
```