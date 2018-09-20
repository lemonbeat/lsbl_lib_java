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
 *                 Response for the request device_find responses with the topology informations known by the Backend
 *             
 * 
 * <p>Java-Klasse für device_configuration_fetch_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_configuration_fetch_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="device_configuration" type="{urn:com.lemonbeat.lsbl.lsbl_config_mgmt_service}device_configuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_configuration_fetch_response", propOrder = {
    "deviceSgtin",
    "deviceConfiguration"
})
public class DeviceConfigurationFetchResponse {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "device_configuration", required = true)
    protected DeviceConfiguration deviceConfiguration;

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
     * Ruft den Wert der deviceConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfiguration }
     *     
     */
    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * Legt den Wert der deviceConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfiguration }
     *     
     */
    public void setDeviceConfiguration(DeviceConfiguration value) {
        this.deviceConfiguration = value;
    }

}
