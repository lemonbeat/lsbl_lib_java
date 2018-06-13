//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_value_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lsbl_value_service package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lsbl_value_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValueGetLastRequest }
     * 
     */
    public ValueGetLastRequest createValueGetLastRequest() {
        return new ValueGetLastRequest();
    }

    /**
     * Create an instance of {@link ValueSetRequest }
     * 
     */
    public ValueSetRequest createValueSetRequest() {
        return new ValueSetRequest();
    }

    /**
     * Create an instance of {@link ValueResponse }
     * 
     */
    public ValueResponse createValueResponse() {
        return new ValueResponse();
    }

    /**
     * Create an instance of {@link ValueEvent }
     * 
     */
    public ValueEvent createValueEvent() {
        return new ValueEvent();
    }

    /**
     * Create an instance of {@link ValueGetRequest }
     * 
     */
    public ValueGetRequest createValueGetRequest() {
        return new ValueGetRequest();
    }

    /**
     * Create an instance of {@link ValueGetLastResponse }
     * 
     */
    public ValueGetLastResponse createValueGetLastResponse() {
        return new ValueGetLastResponse();
    }

    /**
     * Create an instance of {@link ValueIdList }
     * 
     */
    public ValueIdList createValueIdList() {
        return new ValueIdList();
    }

    /**
     * Create an instance of {@link ValueSetResponse }
     * 
     */
    public ValueSetResponse createValueSetResponse() {
        return new ValueSetResponse();
    }

    /**
     * Create an instance of {@link ValueGetResponse }
     * 
     */
    public ValueGetResponse createValueGetResponse() {
        return new ValueGetResponse();
    }

    /**
     * Create an instance of {@link ValueCmd }
     * 
     */
    public ValueCmd createValueCmd() {
        return new ValueCmd();
    }

    /**
     * Create an instance of {@link DeviceValueReported }
     * 
     */
    public DeviceValueReported createDeviceValueReported() {
        return new DeviceValueReported();
    }

}
