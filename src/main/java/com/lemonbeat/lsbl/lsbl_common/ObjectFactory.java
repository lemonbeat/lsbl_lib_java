//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lsbl_common package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lsbl_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestFromDevice }
     * 
     */
    public RequestFromDevice createRequestFromDevice() {
        return new RequestFromDevice();
    }

    /**
     * Create an instance of {@link CommonResponse }
     * 
     */
    public CommonResponse createCommonResponse() {
        return new CommonResponse();
    }

    /**
     * Create an instance of {@link ForwardToDevice }
     * 
     */
    public ForwardToDevice createForwardToDevice() {
        return new ForwardToDevice();
    }

    /**
     * Create an instance of {@link CommonCmd }
     * 
     */
    public CommonCmd createCommonCmd() {
        return new CommonCmd();
    }

    /**
     * Create an instance of {@link ForwardToService }
     * 
     */
    public ForwardToService createForwardToService() {
        return new ForwardToService();
    }

    /**
     * Create an instance of {@link InitDeviceRequest }
     * 
     */
    public InitDeviceRequest createInitDeviceRequest() {
        return new InitDeviceRequest();
    }

}
