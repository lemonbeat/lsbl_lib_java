//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_firmware_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Requests the firmware service to add a firmware version to the datastore and to the S3 bucket.
 *                 This command can be called multiple times for adding the different types of firmware images.
 *             
 * 
 * <p>Java-Klasse für device_firmware_rule_set_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_firmware_rule_set_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firmware_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="application_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="os_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bootloader_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmware_type" type="{urn:lsbl_firmware_service}firmware_type"/>
 *         &lt;element name="firmware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_firmware_rule_set_request", propOrder = {
    "firmwareLabel",
    "expression",
    "applicationVersion",
    "osVersion",
    "bootloaderVersion",
    "firmwareType",
    "firmware",
    "checksum"
})
public class DeviceFirmwareRuleSetRequest {

    @XmlElement(name = "firmware_label", required = true)
    protected String firmwareLabel;
    @XmlElement(required = true)
    protected String expression;
    @XmlElement(name = "application_version", required = true)
    protected String applicationVersion;
    @XmlElement(name = "os_version", required = true)
    protected String osVersion;
    @XmlElement(name = "bootloader_version", required = true)
    protected String bootloaderVersion;
    @XmlElement(name = "firmware_type", required = true)
    @XmlSchemaType(name = "string")
    protected FirmwareType firmwareType;
    @XmlElement(required = true)
    protected String firmware;
    @XmlElement(required = true)
    protected String checksum;

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
     * Ruft den Wert der expression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Legt den Wert der expression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Ruft den Wert der applicationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Legt den Wert der applicationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    /**
     * Ruft den Wert der osVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Legt den Wert der osVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Ruft den Wert der bootloaderVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootloaderVersion() {
        return bootloaderVersion;
    }

    /**
     * Legt den Wert der bootloaderVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootloaderVersion(String value) {
        this.bootloaderVersion = value;
    }

    /**
     * Ruft den Wert der firmwareType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FirmwareType }
     *     
     */
    public FirmwareType getFirmwareType() {
        return firmwareType;
    }

    /**
     * Legt den Wert der firmwareType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmwareType }
     *     
     */
    public void setFirmwareType(FirmwareType value) {
        this.firmwareType = value;
    }

    /**
     * Ruft den Wert der firmware-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Legt den Wert der firmware-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmware(String value) {
        this.firmware = value;
    }

    /**
     * Ruft den Wert der checksum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Legt den Wert der checksum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

}
