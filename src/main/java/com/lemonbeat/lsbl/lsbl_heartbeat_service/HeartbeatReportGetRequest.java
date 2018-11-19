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
 *         Requests heartbeat report for the gateway specified by gw_sgtin
 *       
 * 
 * <p>Java-Klasse für heartbeat_report_get_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_report_get_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="force_ping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="device_list" type="{urn:lsbl_heartbeat_service}device_list" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_report_get_request", propOrder = {
    "gwSgtin",
    "forcePing",
    "deviceList"
})
public class HeartbeatReportGetRequest {

    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;
    @XmlElement(name = "force_ping")
    protected Boolean forcePing;
    @XmlElement(name = "device_list")
    protected DeviceList deviceList;

    /**
     * Ruft den Wert der gwSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwSgtin() {
        return gwSgtin;
    }

    /**
     * Legt den Wert der gwSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwSgtin(String value) {
        this.gwSgtin = value;
    }

    /**
     * Ruft den Wert der forcePing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcePing() {
        return forcePing;
    }

    /**
     * Legt den Wert der forcePing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePing(Boolean value) {
        this.forcePing = value;
    }

    /**
     * Ruft den Wert der deviceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Legt den Wert der deviceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

}
