package com.lemonbeat.lsbl;

import com.lemonbeat.lsbl.lsbl.Lsbl;
import com.lemonbeat.lsbl.lsbl.MessageType;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;

public class LsBL {

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
        return lsbl;
    }

    public static Lsbl parse(String xml) throws JAXBException {
        ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(xml.getBytes());
        JAXBContext context = JAXBContext.newInstance(Lsbl.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return Lsbl.class.cast(unmarshaller.unmarshal(xmlContentBytes));
    }

    public static String write(Lsbl lsbl) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(lsbl, sw);
        return sw.toString();
    }

}
