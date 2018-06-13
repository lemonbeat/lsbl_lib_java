package com.lemonbeat.lsbl;

import com.lemonbeat.lsbl.lsbl.Lsbl;
import com.lemonbeat.lsbl.lsbl.ObjectFactory;
import com.lemonbeat.lsbl.lsbl_topo_service.DeviceDescriptionGetRequest;
import com.lemonbeat.lsbl.lsbl_topo_service.TopoCmd;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LsBLTest {

    @Test
    public void testLsblCreation(){
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
    }


    @Test
    public void testCommon() {
        testLsblServiceSampleParsing("common");
    }

    @Test
    public void testConfigMgmtService() {
        testLsblServiceSampleParsing("config_mgmt_service");
    }

    @Test
    public void testDeviceInclusion() {
        testLsblServiceSampleParsing("device_inclusion");
    }

    @Test
    public void testEvents() {
        testLsblServiceSampleParsing("events");
    }

    @Test
    public void testFileService() {
        testLsblServiceSampleParsing("file_service");
    }

    @Test
    public void testGes() {
        testLsblServiceSampleParsing("ges");
    }

    @Test
    public void testGlobalKeyService() {
        testLsblServiceSampleParsing("global_key_service");
    }

    @Test
    public void testMetadataService() {
        testLsblServiceSampleParsing("metadata_service");
    }

    @Test
    public void testMessage() {
        testLsblServiceSampleParsing("test");
    }

    @Test
    public void testTopoService() {
        testLsblServiceSampleParsing("topo_service");
    }

    @Test
    public void testUserService() {
        testLsblServiceSampleParsing("user_service");
    }

    @Test
    public void testValueService() {
        testLsblServiceSampleParsing("value_service");
    }

    private void testLsblServiceSampleParsing(String lsblServiceName) {
        List<File> samples = listSampleFiles(lsblServiceName);
        for(File f: samples){
            String lsblXml = readFile(f);
            System.out.println(f);
            System.out.println(lsblXml);
            try {
                Lsbl lsblObj = LsBL.parse(lsblXml);
                assertNotNull(lsblObj);
                assertTrue(lsblObj instanceof Lsbl);
                System.out.println(LsBL.write(lsblObj));
            } catch(JAXBException ex){
                ex.printStackTrace();
            }
        }
    }

    private String readFile(File file) {
        try {
            byte[] encoded = Files.readAllBytes(file.toPath());
            return new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private List<File> listSampleFiles(String lsdlService) {
        ArrayList<File> sampleFileList = new ArrayList<>();
        File folder = new File("lsbl_xsd/samples/" + lsdlService);
        if(folder.isDirectory() && folder.canRead()){
            for(File sampleFile : folder.listFiles()){
                if(sampleFile.getName().endsWith(".xml")){
                    sampleFileList.add(sampleFile);
                }
            }
        }
        return sampleFileList;
    }


}