//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the config_mgmt_service.
 *             
 * 
 * <p>Java-Klasse für config_mgmt_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="config_mgmt_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_configuration_fetch" type="{urn:lsbl_config_mgmt_service}device_configuration_fetch_response"/>
 *           &lt;element name="device_configuration_get" type="{urn:lsbl_config_mgmt_service}device_configuration_get_response"/>
 *           &lt;element name="default_device_configuration_get" type="{urn:lsbl_config_mgmt_service}default_device_configuration_get_response"/>
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
@XmlType(name = "config_mgmt_response", propOrder = {
    "deviceConfigurationFetch",
    "deviceConfigurationGet",
    "defaultDeviceConfigurationGet"
})
public class ConfigMgmtResponse {

    @XmlElement(name = "device_configuration_fetch")
    protected DeviceConfigurationFetchResponse deviceConfigurationFetch;
    @XmlElement(name = "device_configuration_get")
    protected DeviceConfigurationGetResponse deviceConfigurationGet;
    @XmlElement(name = "default_device_configuration_get")
    protected DefaultDeviceConfigurationGetResponse defaultDeviceConfigurationGet;

    /**
     * Ruft den Wert der deviceConfigurationFetch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationFetchResponse }
     *     
     */
    public DeviceConfigurationFetchResponse getDeviceConfigurationFetch() {
        return deviceConfigurationFetch;
    }

    /**
     * Legt den Wert der deviceConfigurationFetch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationFetchResponse }
     *     
     */
    public void setDeviceConfigurationFetch(DeviceConfigurationFetchResponse value) {
        this.deviceConfigurationFetch = value;
    }

    /**
     * Ruft den Wert der deviceConfigurationGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationGetResponse }
     *     
     */
    public DeviceConfigurationGetResponse getDeviceConfigurationGet() {
        return deviceConfigurationGet;
    }

    /**
     * Legt den Wert der deviceConfigurationGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationGetResponse }
     *     
     */
    public void setDeviceConfigurationGet(DeviceConfigurationGetResponse value) {
        this.deviceConfigurationGet = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigurationGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigurationGetResponse }
     *     
     */
    public DefaultDeviceConfigurationGetResponse getDefaultDeviceConfigurationGet() {
        return defaultDeviceConfigurationGet;
    }

    /**
     * Legt den Wert der defaultDeviceConfigurationGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigurationGetResponse }
     *     
     */
    public void setDefaultDeviceConfigurationGet(DefaultDeviceConfigurationGetResponse value) {
        this.defaultDeviceConfigurationGet = value;
    }

}
