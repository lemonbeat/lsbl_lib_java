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
 *                 Definition of the commands of the firmware_service.
 *             
 * 
 * <p>Java-Klasse für firmware_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="firmware_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_firmware_update_image" type="{urn:lsbl_firmware_service}device_firmware_update_image_request"/>
 *           &lt;element name="device_firmware_rule_set" type="{urn:lsbl_firmware_service}device_firmware_rule_set_request"/>
 *           &lt;element name="device_firmware_rule_get" type="{urn:lsbl_firmware_service}device_firmware_rule_get_request"/>
 *           &lt;element name="device_firmware_rule_delete" type="{urn:lsbl_firmware_service}device_firmware_rule_delete_request"/>
 *           &lt;element name="device_firmware_update_status_get" type="{urn:lsbl_firmware_service}device_firmware_update_status_get_request"/>
 *           &lt;element name="device_firmware_update_image_report" type="{urn:lsbl_firmware_service}device_firmware_update_image_report_request"/>
 *           &lt;element name="gw_update_device_firmware" type="{urn:lsbl_firmware_service}gw_update_device_firmware_request"/>
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
@XmlType(name = "firmware_cmd", propOrder = {
    "deviceFirmwareUpdateImage",
    "deviceFirmwareRuleSet",
    "deviceFirmwareRuleGet",
    "deviceFirmwareRuleDelete",
    "deviceFirmwareUpdateStatusGet",
    "deviceFirmwareUpdateImageReport",
    "gwUpdateDeviceFirmware"
})
public class FirmwareCmd {

    @XmlElement(name = "device_firmware_update_image")
    protected DeviceFirmwareUpdateImageRequest deviceFirmwareUpdateImage;
    @XmlElement(name = "device_firmware_rule_set")
    protected DeviceFirmwareRuleSetRequest deviceFirmwareRuleSet;
    @XmlElement(name = "device_firmware_rule_get")
    protected DeviceFirmwareRuleGetRequest deviceFirmwareRuleGet;
    @XmlElement(name = "device_firmware_rule_delete")
    protected DeviceFirmwareRuleDeleteRequest deviceFirmwareRuleDelete;
    @XmlElement(name = "device_firmware_update_status_get")
    protected DeviceFirmwareUpdateStatusGetRequest deviceFirmwareUpdateStatusGet;
    @XmlElement(name = "device_firmware_update_image_report")
    protected DeviceFirmwareUpdateImageReportRequest deviceFirmwareUpdateImageReport;
    @XmlElement(name = "gw_update_device_firmware")
    protected GwUpdateDeviceFirmwareRequest gwUpdateDeviceFirmware;

    /**
     * Ruft den Wert der deviceFirmwareUpdateImage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareUpdateImageRequest }
     *     
     */
    public DeviceFirmwareUpdateImageRequest getDeviceFirmwareUpdateImage() {
        return deviceFirmwareUpdateImage;
    }

    /**
     * Legt den Wert der deviceFirmwareUpdateImage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareUpdateImageRequest }
     *     
     */
    public void setDeviceFirmwareUpdateImage(DeviceFirmwareUpdateImageRequest value) {
        this.deviceFirmwareUpdateImage = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareRuleSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareRuleSetRequest }
     *     
     */
    public DeviceFirmwareRuleSetRequest getDeviceFirmwareRuleSet() {
        return deviceFirmwareRuleSet;
    }

    /**
     * Legt den Wert der deviceFirmwareRuleSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareRuleSetRequest }
     *     
     */
    public void setDeviceFirmwareRuleSet(DeviceFirmwareRuleSetRequest value) {
        this.deviceFirmwareRuleSet = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareRuleGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareRuleGetRequest }
     *     
     */
    public DeviceFirmwareRuleGetRequest getDeviceFirmwareRuleGet() {
        return deviceFirmwareRuleGet;
    }

    /**
     * Legt den Wert der deviceFirmwareRuleGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareRuleGetRequest }
     *     
     */
    public void setDeviceFirmwareRuleGet(DeviceFirmwareRuleGetRequest value) {
        this.deviceFirmwareRuleGet = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareRuleDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareRuleDeleteRequest }
     *     
     */
    public DeviceFirmwareRuleDeleteRequest getDeviceFirmwareRuleDelete() {
        return deviceFirmwareRuleDelete;
    }

    /**
     * Legt den Wert der deviceFirmwareRuleDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareRuleDeleteRequest }
     *     
     */
    public void setDeviceFirmwareRuleDelete(DeviceFirmwareRuleDeleteRequest value) {
        this.deviceFirmwareRuleDelete = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareUpdateStatusGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareUpdateStatusGetRequest }
     *     
     */
    public DeviceFirmwareUpdateStatusGetRequest getDeviceFirmwareUpdateStatusGet() {
        return deviceFirmwareUpdateStatusGet;
    }

    /**
     * Legt den Wert der deviceFirmwareUpdateStatusGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareUpdateStatusGetRequest }
     *     
     */
    public void setDeviceFirmwareUpdateStatusGet(DeviceFirmwareUpdateStatusGetRequest value) {
        this.deviceFirmwareUpdateStatusGet = value;
    }

    /**
     * Ruft den Wert der deviceFirmwareUpdateImageReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareUpdateImageReportRequest }
     *     
     */
    public DeviceFirmwareUpdateImageReportRequest getDeviceFirmwareUpdateImageReport() {
        return deviceFirmwareUpdateImageReport;
    }

    /**
     * Legt den Wert der deviceFirmwareUpdateImageReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareUpdateImageReportRequest }
     *     
     */
    public void setDeviceFirmwareUpdateImageReport(DeviceFirmwareUpdateImageReportRequest value) {
        this.deviceFirmwareUpdateImageReport = value;
    }

    /**
     * Ruft den Wert der gwUpdateDeviceFirmware-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwUpdateDeviceFirmwareRequest }
     *     
     */
    public GwUpdateDeviceFirmwareRequest getGwUpdateDeviceFirmware() {
        return gwUpdateDeviceFirmware;
    }

    /**
     * Legt den Wert der gwUpdateDeviceFirmware-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwUpdateDeviceFirmwareRequest }
     *     
     */
    public void setGwUpdateDeviceFirmware(GwUpdateDeviceFirmwareRequest value) {
        this.gwUpdateDeviceFirmware = value;
    }

}
