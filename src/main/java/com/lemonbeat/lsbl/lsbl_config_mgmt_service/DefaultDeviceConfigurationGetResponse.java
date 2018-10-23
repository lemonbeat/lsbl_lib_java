//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Response for the request device_find responses with the topology informations known by the backend.
 *             
 * 
 * <p>Java-Klasse für default_device_configuration_get_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="default_device_configuration_get_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default_device_configuration" type="{urn:lsbl_config_mgmt_service}default_device_configuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default_device_configuration_get_response", propOrder = {
    "defaultDeviceConfiguration"
})
public class DefaultDeviceConfigurationGetResponse {

    @XmlElement(name = "default_device_configuration", required = true)
    protected DefaultDeviceConfiguration defaultDeviceConfiguration;

    /**
     * Ruft den Wert der defaultDeviceConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfiguration }
     *     
     */
    public DefaultDeviceConfiguration getDefaultDeviceConfiguration() {
        return defaultDeviceConfiguration;
    }

    /**
     * Legt den Wert der defaultDeviceConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfiguration }
     *     
     */
    public void setDefaultDeviceConfiguration(DefaultDeviceConfiguration value) {
        this.defaultDeviceConfiguration = value;
    }

}
