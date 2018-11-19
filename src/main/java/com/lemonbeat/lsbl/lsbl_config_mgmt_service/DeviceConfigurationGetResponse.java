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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Response for the request device_find responses with the topology informations known by the backend.
 *             
 * 
 * <p>Java-Klasse für device_configuration_get_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_configuration_get_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="config_status" type="{urn:lsbl_config_mgmt_service}config_status"/>
 *         &lt;element name="inserted_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="device_configuration" type="{urn:lsbl_config_mgmt_service}device_configuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_configuration_get_response", propOrder = {
    "deviceSgtin",
    "configStatus",
    "insertedAt",
    "updatedAt",
    "deviceConfiguration"
})
public class DeviceConfigurationGetResponse {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "config_status", required = true)
    @XmlSchemaType(name = "string")
    protected ConfigStatus configStatus;
    @XmlElement(name = "inserted_at")
    protected String insertedAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
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
     * Ruft den Wert der configStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfigStatus }
     *     
     */
    public ConfigStatus getConfigStatus() {
        return configStatus;
    }

    /**
     * Legt den Wert der configStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigStatus }
     *     
     */
    public void setConfigStatus(ConfigStatus value) {
        this.configStatus = value;
    }

    /**
     * Ruft den Wert der insertedAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertedAt() {
        return insertedAt;
    }

    /**
     * Legt den Wert der insertedAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertedAt(String value) {
        this.insertedAt = value;
    }

    /**
     * Ruft den Wert der updatedAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Legt den Wert der updatedAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
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
