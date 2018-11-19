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
 *                 Definition of the commands of the config_mgmt_service.
 *             
 * 
 * <p>Java-Klasse für config_mgmt_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="config_mgmt_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_configuration_fetch" type="{urn:lsbl_config_mgmt_service}device_configuration_fetch_request"/>
 *           &lt;element name="device_configuration_get" type="{urn:lsbl_config_mgmt_service}device_configuration_get_request"/>
 *           &lt;element name="device_configuration_set" type="{urn:lsbl_config_mgmt_service}device_configuration_set_request"/>
 *           &lt;element name="default_device_configuration_set" type="{urn:lsbl_config_mgmt_service}default_device_configuration_set_request"/>
 *           &lt;element name="default_device_configuration_get" type="{urn:lsbl_config_mgmt_service}default_device_configuration_get_request"/>
 *           &lt;element name="default_device_configuration_delete" type="{urn:lsbl_config_mgmt_service}default_device_configuration_delete_request"/>
 *           &lt;element name="default_device_configuration_apply" type="{urn:lsbl_config_mgmt_service}default_device_configuration_apply_request"/>
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
@XmlType(name = "config_mgmt_cmd", propOrder = {
    "deviceConfigurationFetch",
    "deviceConfigurationGet",
    "deviceConfigurationSet",
    "defaultDeviceConfigurationSet",
    "defaultDeviceConfigurationGet",
    "defaultDeviceConfigurationDelete",
    "defaultDeviceConfigurationApply"
})
public class ConfigMgmtCmd {

    @XmlElement(name = "device_configuration_fetch")
    protected DeviceConfigurationFetchRequest deviceConfigurationFetch;
    @XmlElement(name = "device_configuration_get")
    protected DeviceConfigurationGetRequest deviceConfigurationGet;
    @XmlElement(name = "device_configuration_set")
    protected DeviceConfigurationSetRequest deviceConfigurationSet;
    @XmlElement(name = "default_device_configuration_set")
    protected DefaultDeviceConfigurationSetRequest defaultDeviceConfigurationSet;
    @XmlElement(name = "default_device_configuration_get")
    protected DefaultDeviceConfigurationGetRequest defaultDeviceConfigurationGet;
    @XmlElement(name = "default_device_configuration_delete")
    protected DefaultDeviceConfigurationDeleteRequest defaultDeviceConfigurationDelete;
    @XmlElement(name = "default_device_configuration_apply")
    protected DefaultDeviceConfigurationApplyRequest defaultDeviceConfigurationApply;

    /**
     * Ruft den Wert der deviceConfigurationFetch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationFetchRequest }
     *     
     */
    public DeviceConfigurationFetchRequest getDeviceConfigurationFetch() {
        return deviceConfigurationFetch;
    }

    /**
     * Legt den Wert der deviceConfigurationFetch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationFetchRequest }
     *     
     */
    public void setDeviceConfigurationFetch(DeviceConfigurationFetchRequest value) {
        this.deviceConfigurationFetch = value;
    }

    /**
     * Ruft den Wert der deviceConfigurationGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationGetRequest }
     *     
     */
    public DeviceConfigurationGetRequest getDeviceConfigurationGet() {
        return deviceConfigurationGet;
    }

    /**
     * Legt den Wert der deviceConfigurationGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationGetRequest }
     *     
     */
    public void setDeviceConfigurationGet(DeviceConfigurationGetRequest value) {
        this.deviceConfigurationGet = value;
    }

    /**
     * Ruft den Wert der deviceConfigurationSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceConfigurationSetRequest }
     *     
     */
    public DeviceConfigurationSetRequest getDeviceConfigurationSet() {
        return deviceConfigurationSet;
    }

    /**
     * Legt den Wert der deviceConfigurationSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceConfigurationSetRequest }
     *     
     */
    public void setDeviceConfigurationSet(DeviceConfigurationSetRequest value) {
        this.deviceConfigurationSet = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigurationSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigurationSetRequest }
     *     
     */
    public DefaultDeviceConfigurationSetRequest getDefaultDeviceConfigurationSet() {
        return defaultDeviceConfigurationSet;
    }

    /**
     * Legt den Wert der defaultDeviceConfigurationSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigurationSetRequest }
     *     
     */
    public void setDefaultDeviceConfigurationSet(DefaultDeviceConfigurationSetRequest value) {
        this.defaultDeviceConfigurationSet = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigurationGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigurationGetRequest }
     *     
     */
    public DefaultDeviceConfigurationGetRequest getDefaultDeviceConfigurationGet() {
        return defaultDeviceConfigurationGet;
    }

    /**
     * Legt den Wert der defaultDeviceConfigurationGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigurationGetRequest }
     *     
     */
    public void setDefaultDeviceConfigurationGet(DefaultDeviceConfigurationGetRequest value) {
        this.defaultDeviceConfigurationGet = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigurationDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigurationDeleteRequest }
     *     
     */
    public DefaultDeviceConfigurationDeleteRequest getDefaultDeviceConfigurationDelete() {
        return defaultDeviceConfigurationDelete;
    }

    /**
     * Legt den Wert der defaultDeviceConfigurationDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigurationDeleteRequest }
     *     
     */
    public void setDefaultDeviceConfigurationDelete(DefaultDeviceConfigurationDeleteRequest value) {
        this.defaultDeviceConfigurationDelete = value;
    }

    /**
     * Ruft den Wert der defaultDeviceConfigurationApply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDeviceConfigurationApplyRequest }
     *     
     */
    public DefaultDeviceConfigurationApplyRequest getDefaultDeviceConfigurationApply() {
        return defaultDeviceConfigurationApply;
    }

    /**
     * Legt den Wert der defaultDeviceConfigurationApply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDeviceConfigurationApplyRequest }
     *     
     */
    public void setDefaultDeviceConfigurationApply(DefaultDeviceConfigurationApplyRequest value) {
        this.defaultDeviceConfigurationApply = value;
    }

}
