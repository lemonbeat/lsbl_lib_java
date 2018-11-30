# lsbl_lib

Java library for writing and reading LsBL XMLs using Java.

## Getting started

To generate a jar file from a tagged lsbl_xsd version you need to run the build script.

```bash
# Build the latest master
./build.sh
# Build a tagged version
./build.sh 1.4.0
``` 

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


