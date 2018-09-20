//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_firmware_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The response of a device_firmware_add request returning created data fields related .
 *             
 * 
 * <p>Java-Klasse für device_firmware_rule_set_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_firmware_rule_set_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firmware_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmware_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmware_uuid" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}uuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_firmware_rule_set_response", propOrder = {
    "firmwareLabel",
    "firmwareUrl",
    "firmwareUuid"
})
public class DeviceFirmwareRuleSetResponse {

    @XmlElement(name = "firmware_label", required = true)
    protected String firmwareLabel;
    @XmlElement(name = "firmware_url", required = true)
    protected String firmwareUrl;
    @XmlElement(name = "firmware_uuid", required = true)
    protected String firmwareUuid;

    /**
     * Ruft den Wert der firmwareLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareLabel() {
        return firmwareLabel;
    }

    /**
     * Legt den Wert der firmwareLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareLabel(String value) {
        this.firmwareLabel = value;
    }

    /**
     * Ruft den Wert der firmwareUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareUrl() {
        return firmwareUrl;
    }

    /**
     * Legt den Wert der firmwareUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareUrl(String value) {
        this.firmwareUrl = value;
    }

    /**
     * Ruft den Wert der firmwareUuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareUuid() {
        return firmwareUuid;
    }

    /**
     * Legt den Wert der firmwareUuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareUuid(String value) {
        this.firmwareUuid = value;
    }

}
