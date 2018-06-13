//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_global_key_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lsbl_global_key_service package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lsbl_global_key_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PublickeyDeviceGetRequest }
     * 
     */
    public PublickeyDeviceGetRequest createPublickeyDeviceGetRequest() {
        return new PublickeyDeviceGetRequest();
    }

    /**
     * Create an instance of {@link GlobalKeyResponse }
     * 
     */
    public GlobalKeyResponse createGlobalKeyResponse() {
        return new GlobalKeyResponse();
    }

    /**
     * Create an instance of {@link KeyErrorEvent }
     * 
     */
    public KeyErrorEvent createKeyErrorEvent() {
        return new KeyErrorEvent();
    }

    /**
     * Create an instance of {@link KeyExchangedEvent }
     * 
     */
    public KeyExchangedEvent createKeyExchangedEvent() {
        return new KeyExchangedEvent();
    }

    /**
     * Create an instance of {@link GlobalKeyEvent }
     * 
     */
    public GlobalKeyEvent createGlobalKeyEvent() {
        return new GlobalKeyEvent();
    }

    /**
     * Create an instance of {@link GlobalKeyCmd }
     * 
     */
    public GlobalKeyCmd createGlobalKeyCmd() {
        return new GlobalKeyCmd();
    }

    /**
     * Create an instance of {@link PublickeyDeviceGetResponse }
     * 
     */
    public PublickeyDeviceGetResponse createPublickeyDeviceGetResponse() {
        return new PublickeyDeviceGetResponse();
    }

}
