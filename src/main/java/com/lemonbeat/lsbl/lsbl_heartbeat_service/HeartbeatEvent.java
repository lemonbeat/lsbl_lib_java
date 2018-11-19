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
 *         Definition of the events of the heartbeat_service.
 *       
 * 
 * <p>Java-Klasse für heartbeat_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="heartbeat_reported" type="{urn:lsbl_heartbeat_service}heartbeat_reported_event"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_event", propOrder = {
    "heartbeatReported"
})
public class HeartbeatEvent {

    @XmlElement(name = "heartbeat_reported")
    protected HeartbeatReportedEvent heartbeatReported;

    /**
     * Ruft den Wert der heartbeatReported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportedEvent }
     *     
     */
    public HeartbeatReportedEvent getHeartbeatReported() {
        return heartbeatReported;
    }

    /**
     * Legt den Wert der heartbeatReported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportedEvent }
     *     
     */
    public void setHeartbeatReported(HeartbeatReportedEvent value) {
        this.heartbeatReported = value;
    }

}
