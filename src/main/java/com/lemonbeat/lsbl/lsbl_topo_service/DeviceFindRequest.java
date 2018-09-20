//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Requests the TopoService to respond with all stored device information for the given SGTIN or MAC address.
 *       
 * 
 * <p>Java-Klasse für device_find_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_find_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96" minOccurs="0"/>
 *         &lt;element name="device_mac" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}mac" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_find_request", propOrder = {
    "deviceSgtin",
    "deviceMac"
})
public class DeviceFindRequest {

    @XmlElement(name = "device_sgtin")
    protected String deviceSgtin;
    @XmlElement(name = "device_mac")
    protected String deviceMac;

    /**
     * Ruft den Wert der deviceSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSgtin() {
        return deviceSgtin;
    }

    /**
     * Legt den Wert der deviceSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSgtin(String value) {
        this.deviceSgtin = value;
    }

    /**
     * Ruft den Wert der deviceMac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMac() {
        return deviceMac;
    }

    /**
     * Legt den Wert der deviceMac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMac(String value) {
        this.deviceMac = value;
    }

}
