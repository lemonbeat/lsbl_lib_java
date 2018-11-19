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
 *         Definition of the responses of the heartbeat_service.
 *       
 * 
 * <p>Java-Klasse für heartbeat_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="heartbeat_report" type="{urn:lsbl_heartbeat_service}heartbeat_report"/>
 *           &lt;element name="heartbeat_report_last" type="{urn:lsbl_heartbeat_service}heartbeat_report_get_last_response"/>
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
@XmlType(name = "heartbeat_response", propOrder = {
    "heartbeatReport",
    "heartbeatReportLast"
})
public class HeartbeatResponse {

    @XmlElement(name = "heartbeat_report")
    protected HeartbeatReport heartbeatReport;
    @XmlElement(name = "heartbeat_report_last")
    protected HeartbeatReportGetLastResponse heartbeatReportLast;

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

    /**
     * Ruft den Wert der heartbeatReportLast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportGetLastResponse }
     *     
     */
    public HeartbeatReportGetLastResponse getHeartbeatReportLast() {
        return heartbeatReportLast;
    }

    /**
     * Legt den Wert der heartbeatReportLast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportGetLastResponse }
     *     
     */
    public void setHeartbeatReportLast(HeartbeatReportGetLastResponse value) {
        this.heartbeatReportLast = value;
    }

}
