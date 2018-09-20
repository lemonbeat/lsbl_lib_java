//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of the commands of the heartbeat_service.
 *       
 * 
 * <p>Java-Klasse für heartbeat_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="heartbeat_report_publish" type="{urn:com.lemonbeat.lsbl.lsbl_heartbeat_service}heartbeat_report_publish"/>
 *           &lt;element name="heartbeat_report_get" type="{urn:com.lemonbeat.lsbl.lsbl_heartbeat_service}heartbeat_report_get_request"/>
 *           &lt;element name="heartbeat_report_get_last" type="{urn:com.lemonbeat.lsbl.lsbl_heartbeat_service}heartbeat_report_get_last_request"/>
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
@XmlType(name = "heartbeat_cmd", propOrder = {
    "heartbeatReportPublish",
    "heartbeatReportGet",
    "heartbeatReportGetLast"
})
public class HeartbeatCmd {

    @XmlElement(name = "heartbeat_report_publish")
    protected HeartbeatReportPublish heartbeatReportPublish;
    @XmlElement(name = "heartbeat_report_get")
    protected HeartbeatReportGetRequest heartbeatReportGet;
    @XmlElement(name = "heartbeat_report_get_last")
    protected HeartbeatReportGetLastRequest heartbeatReportGetLast;

    /**
     * Ruft den Wert der heartbeatReportPublish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportPublish }
     *     
     */
    public HeartbeatReportPublish getHeartbeatReportPublish() {
        return heartbeatReportPublish;
    }

    /**
     * Legt den Wert der heartbeatReportPublish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportPublish }
     *     
     */
    public void setHeartbeatReportPublish(HeartbeatReportPublish value) {
        this.heartbeatReportPublish = value;
    }

    /**
     * Ruft den Wert der heartbeatReportGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportGetRequest }
     *     
     */
    public HeartbeatReportGetRequest getHeartbeatReportGet() {
        return heartbeatReportGet;
    }

    /**
     * Legt den Wert der heartbeatReportGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportGetRequest }
     *     
     */
    public void setHeartbeatReportGet(HeartbeatReportGetRequest value) {
        this.heartbeatReportGet = value;
    }

    /**
     * Ruft den Wert der heartbeatReportGetLast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatReportGetLastRequest }
     *     
     */
    public HeartbeatReportGetLastRequest getHeartbeatReportGetLast() {
        return heartbeatReportGetLast;
    }

    /**
     * Legt den Wert der heartbeatReportGetLast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatReportGetLastRequest }
     *     
     */
    public void setHeartbeatReportGetLast(HeartbeatReportGetLastRequest value) {
        this.heartbeatReportGetLast = value;
    }

}
