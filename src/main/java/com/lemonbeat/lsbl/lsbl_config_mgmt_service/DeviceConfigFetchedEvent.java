//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event raised by the config service when the configuration is successfully fetched from a device.
 *             
 * 
 * <p>Java-Klasse für device_config_fetched_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_config_fetched_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="gw_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_config_fetched_event", propOrder = {
    "deviceSgtin",
    "gwSgtin"
})
public class DeviceConfigFetchedEvent {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;

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

}
