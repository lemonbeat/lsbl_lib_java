//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response with to heartbeat_report_get_last, contains all heartbeat reports for the gateways
 *       
 * 
 * <p>Java-Klasse für heartbeat_report_get_last_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_report_get_last_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heartbeat_report_list" type="{urn:lsbl_heartbeat_service}heartbeat_report_list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_report_get_last_response", propOrder = {
    "heartbeatReportList"
})
public class HeartbeatReportGetLastResponse {

    @XmlElement(name = "heartbeat_report_list", required = true)
    protected HeartbeatReportList heartbeatReportList;

    /**
     * Ruft den Wert der heartbeatReportList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportList }
     *     
     */
    public HeartbeatReportList getHeartbeatReportList() {
        return heartbeatReportList;
    }

    /**
     * Legt den Wert der heartbeatReportList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportList }
     *     
     */
    public void setHeartbeatReportList(HeartbeatReportList value) {
        this.heartbeatReportList = value;
    }

}
