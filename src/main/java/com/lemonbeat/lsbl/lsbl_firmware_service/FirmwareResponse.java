//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_firmware_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the firmware_service.
 *             
 * 
 * <p>Java-Klasse für firmware_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="firmware_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_firmware_rule_get" type="{urn:lsbl_firmware_service}device_firmware_rule_get_response"/>
 *           &lt;element name="device_firmware_rule_set" type="{urn:lsbl_firmware_service}device_firmware_rule_set_response"/>
 *           &lt;element name="device_firmware_update_status_get" type="{urn:lsbl_firmware_service}device_firmware_update_status_get_response"/>
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
@XmlType(name = "firmware_response", propOrder = {
    "deviceFirmwareRuleGet",
    "deviceFirmwareRuleSet",
    "deviceFirmwareUpdateStatusGet"
})
public class FirmwareResponse {

    @XmlElement(name = "device_firmware_rule_get")
    protected DeviceFirmwareRuleGetResponse deviceFirmwareRuleGet;
    @XmlElement(name = "device_firmware_rule_set")
    protected DeviceFirmwareRuleSetResponse deviceFirmwareRuleSet;
    @XmlElement(name = "device_firmware_update_status_get")
    protected DeviceFirmwareUpdateStatusGetResponse deviceFirmwareUpdateStatusGet;

    /**
     * Ruft den Wert der deviceFirmwareRuleGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareRuleGetResponse }
     *     
     */
    public DeviceFirmwareRuleGetResponse getDeviceFirmwareRuleGet() {
        return deviceFirmwareRuleGet;
    }

    /**
     * Legt den Wert der deviceFirmwareRuleGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareRuleGetResponse }
     *     
     */
    public void setDeviceFirmwareRuleGet(DeviceFirmwareRuleGetResponse value) {
        this.deviceFirmwareRuleGet = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareRuleSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareRuleSetResponse }
     *     
     */
    public DeviceFirmwareRuleSetResponse getDeviceFirmwareRuleSet() {
        return deviceFirmwareRuleSet;
    }

    /**
     * Legt den Wert der deviceFirmwareRuleSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareRuleSetResponse }
     *     
     */
    public void setDeviceFirmwareRuleSet(DeviceFirmwareRuleSetResponse value) {
        this.deviceFirmwareRuleSet = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareUpdateStatusGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareUpdateStatusGetResponse }
     *     
     */
    public DeviceFirmwareUpdateStatusGetResponse getDeviceFirmwareUpdateStatusGet() {
        return deviceFirmwareUpdateStatusGet;
    }

    /**
     * Legt den Wert der deviceFirmwareUpdateStatusGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareUpdateStatusGetResponse }
     *     
     */
    public void setDeviceFirmwareUpdateStatusGet(DeviceFirmwareUpdateStatusGetResponse value) {
        this.deviceFirmwareUpdateStatusGet = value;
    }

}
