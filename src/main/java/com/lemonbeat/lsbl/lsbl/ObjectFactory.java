//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsbl.lsbl package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsbl.lsbl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Lsbl }
     * 
     */
    public Lsbl createLsbl() {
        return new Lsbl();
    }

    /**
     * Create an instance of {@link Lsbl.Adr }
     * 
     */
    public Lsbl.Adr createLsblAdr() {
        return new Lsbl.Adr();
    }

    /**
     * Create an instance of {@link Lsbl.Cmd }
     * 
     */
    public Lsbl.Cmd createLsblCmd() {
        return new Lsbl.Cmd();
    }

    /**
     * Create an instance of {@link Lsbl.Response }
     * 
     */
    public Lsbl.Response createLsblResponse() {
        return new Lsbl.Response();
    }

    /**
     * Create an instance of {@link Lsbl.Event }
     * 
     */
    public Lsbl.Event createLsblEvent() {
        return new Lsbl.Event();
    }

}
