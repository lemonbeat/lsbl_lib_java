//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The heartbeat report for the gateway specified by gw_sgtin
 *       
 * 
 * <p>Java-Klasse für heartbeat_report complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
@XmlType(name = "heartbeat_report", propOrder = {
    "gwSgtin",
    "timestamp",
    "deviceList"
})
public class HeartbeatReport {

    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timestamp;
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
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimestamp(BigInteger value) {
        this.timestamp = value;
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
