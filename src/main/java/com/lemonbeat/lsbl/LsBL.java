package com.lemonbeat.lsbl;

import com.lemonbeat.lsbl.lsbl.Hdr;
import com.lemonbeat.lsbl.lsbl.Lsbl;
import com.lemonbeat.lsbl.lsbl.MessageType;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;

public class LsBL {

    public static final String VERSION = "master";

    private static JAXBContext jaxbContext;

    public static Lsbl create(String src, String target, long seq){
        return create(src, target, seq, MessageType.LSBL_REQUEST);
    }

    public static Lsbl create(String src, String target, long seq, MessageType type){
        Lsbl lsbl = new Lsbl();
        Lsbl.Adr adr = new Lsbl.Adr();
        adr.setSrc(src);
        adr.setTarget(target);
        adr.setSeq(seq);
        adr.setType(type);
        lsbl.setAdr(adr);
        lsbl.setVersion(VERSION);
        return lsbl;
    }

    public static Lsbl createCmd(Lsbl.Cmd cmd, String target, String token) {
        Lsbl lsbl = new Lsbl();
        Lsbl.Adr adr = new Lsbl.Adr();
        adr.setTarget(target);
        adr.setType(MessageType.LSBL_REQUEST);
        Hdr hdr = new Hdr();
        hdr.setToken(token);
        lsbl.setVersion(VERSION);
        lsbl.setAdr(adr);
        lsbl.setHdr(hdr);
        lsbl.setCmd(cmd);
        return lsbl;
    }

    public static Lsbl parse(String xml) throws JAXBException {
        ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(xml.getBytes());
        if(jaxbContext == null){
            jaxbContext = JAXBContext.newInstance(Lsbl.class);
        }
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return Lsbl.class.cast(unmarshaller.unmarshal(xmlContentBytes));
    }

    public static String write(Lsbl lsbl) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(lsbl, sw);
        return sw.toString();
    }

    public static boolean isNack(Lsbl lsbl) {
        return lsbl.getAdr().getType() == MessageType.LSBL_APP_NACK;
    }

    public static boolean isAck(Lsbl lsbl) {
        return lsbl.getAdr().getType() == MessageType.LSBL_APP_ACK;
    }

    public static boolean isResponse(Lsbl lsbl){
        return lsbl.getAdr().getType() == MessageType.LSBL_RESPONSE;
    }

}
