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
 *                 Definition of the events of the config_mgmt_service.
 *             
 * 
 * <p>Java-Klasse für config_mgmt_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="config_mgmt_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_config_fetched" type="{urn:com.lemonbeat.lsbl.lsbl_config_mgmt_service}device_config_fetched_event"/>
 *           &lt;element name="device_config_written" type="{urn:com.lemonbeat.lsbl.lsbl_config_mgmt_service}device_config_written_event"/>
 *           &lt;element name="device_config_error" type="{urn:com.lemonbeat.lsbl.lsbl_config_mgmt_service}device_config_error_event"/>
 *           &lt;element name="default_device_config_written" type="{urn:com.lemonbeat.lsbl.lsbl_config_mgmt_service}default_device_config_written_event"/>
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
@XmlType(name = "config_mgmt_event", propOrder = {
    "deviceConfigFetched",
    "deviceConfigWritten",
    "deviceConfigError",
    "defaultDeviceConfigWritten"
})
public class ConfigMgmtEvent {

    @XmlElement(name = "device_config_fetched")
    protected DeviceConfigFetchedEvent deviceConfigFetched;
    @XmlElement(name = "device_config_written")
    protected DeviceConfigWrittenEvent deviceConfigWritten;
    @XmlElement(name = "device_config_error")
    protected DeviceConfigErrorEvent deviceConfigError;
    @XmlElement(name = "default_device_config_written")
    protected DefaultDeviceConfigWrittenEvent defaultDeviceConfigWritten;

    /**
     * Ruft den Wert der deviceConfigFetched-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigFetchedEvent }
     *     
     */
    public DeviceConfigFetchedEvent getDeviceConfigFetched() {
        return deviceConfigFetched;
    }

    /**
     * Legt den Wert der deviceConfigFetched-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigFetchedEvent }
     *     
     */
    public void setDeviceConfigFetched(DeviceConfigFetchedEvent value) {
        this.deviceConfigFetched = value;
    }

    /**
     * Ruft den Wert der deviceConfigWritten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigWrittenEvent }
     *     
     */
    public DeviceConfigWrittenEvent getDeviceConfigWritten() {
        return deviceConfigWritten;
    }

    /**
     * Legt den Wert der deviceConfigWritten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigWrittenEvent }
     *     
     */
    public void setDeviceConfigWritten(DeviceConfigWrittenEvent value) {
        this.deviceConfigWritten = value;
    }

    /**
     * Ruft den Wert der deviceConfigError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigErrorEvent }
     *     
     */
    public DeviceConfigErrorEvent getDeviceConfigError() {
        return deviceConfigError;
    }

    /**
     * Legt den Wert der deviceConfigError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigErrorEvent }
     *     
     */
    public void setDeviceConfigError(DeviceConfigErrorEvent value) {
        this.deviceConfigError = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigWritten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigWrittenEvent }
     *     
     */
    public DefaultDeviceConfigWrittenEvent getDefaultDeviceConfigWritten() {
        return defaultDeviceConfigWritten;
    }

    /**
     * Legt den Wert der defaultDeviceConfigWritten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigWrittenEvent }
     *     
     */
    public void setDefaultDeviceConfigWritten(DefaultDeviceConfigWrittenEvent value) {
        this.defaultDeviceConfigWritten = value;
    }

}
