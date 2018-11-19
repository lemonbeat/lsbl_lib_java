//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Event fired by the heartbeat service when a new heartbeat_report is sent to the backend
 *       
 * 
 * <p>Java-Klasse für heartbeat_reported_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_reported_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heartbeat_report" type="{urn:lsbl_heartbeat_service}heartbeat_report"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_reported_event", propOrder = {
    "heartbeatReport"
})
public class HeartbeatReportedEvent {

    @XmlElement(name = "heartbeat_report", required = true)
    protected HeartbeatReport heartbeatReport;

    /**
     * Ruft den Wert der heartbeatReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReport }
     *     
     */
    public HeartbeatReport getHeartbeatReport() {
        return heartbeatReport;
    }

    /**
     * Legt den Wert der heartbeatReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReport }
     *     
     */
    public void setHeartbeatReport(HeartbeatReport value) {
        this.heartbeatReport = value;
    }

}
