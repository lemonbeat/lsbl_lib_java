//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_status_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lemonbeat.lsbl.lsbl_status_service package.
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lemonbeat.lsbl.lsbl_status_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusCmd }
     * 
     */
    public StatusCmd createStatusCmd() {
        return new StatusCmd();
    }

    /**
     * Create an instance of {@link StatusEvent }
     * 
     */
    public StatusEvent createStatusEvent() {
        return new StatusEvent();
    }

    /**
     * Create an instance of {@link StatusReportItem }
     * 
     */
    public StatusReportItem createStatusReportItem() {
        return new StatusReportItem();
    }

    /**
     * Create an instance of {@link StatusReportGetRequest }
     * 
     */
    public StatusReportGetRequest createStatusReportGetRequest() {
        return new StatusReportGetRequest();
    }

    /**
     * Create an instance of {@link StatusReportDeleteRequest }
     * 
     */
    public StatusReportDeleteRequest createStatusReportDeleteRequest() {
        return new StatusReportDeleteRequest();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link StatusReportedEvent }
     * 
     */
    public StatusReportedEvent createStatusReportedEvent() {
        return new StatusReportedEvent();
    }

    /**
     * Create an instance of {@link StatusReportList }
     * 
     */
    public StatusReportList createStatusReportList() {
        return new StatusReportList();
    }

}
