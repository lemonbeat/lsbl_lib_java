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
 *                 Requests the firmware service to respond with all stored metadata of a requested firmware label.
 *             
 * 
 * <p>Java-Klasse für gw_update_device_firmware_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gw_update_device_firmware_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_data_list" type="{urn:lsbl_firmware_service}device_data_list"/>
 *         &lt;element name="firmware_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firmware_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aws_access_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aws_secret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gw_update_device_firmware_request", propOrder = {
    "deviceDataList",
    "firmwareLabel",
    "firmware",
    "checksum",
    "firmwareUrl",
    "awsAccessKey",
    "awsSecret"
})
public class GwUpdateDeviceFirmwareRequest {

    @XmlElement(name = "device_data_list", required = true)
    protected DeviceDataList deviceDataList;
    @XmlElement(name = "firmware_label", required = true)
    protected String firmwareLabel;
    @XmlElement(required = true)
    protected String firmware;
    @XmlElement(required = true)
    protected String checksum;
    @XmlElement(name = "firmware_url", required = true)
    protected String firmwareUrl;
    @XmlElement(name = "aws_access_key", required = true)
    protected String awsAccessKey;
    @XmlElement(name = "aws_secret", required = true)
    protected String awsSecret;

    /**
     * Ruft den Wert der deviceDataList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDataList }
     *     
     */
    public DeviceDataList getDeviceDataList() {
        return deviceDataList;
    }

    /**
     * Legt den Wert der deviceDataList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDataList }
     *     
     */
    public void setDeviceDataList(DeviceDataList value) {
        this.deviceDataList = value;
    }

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
     * Ruft den Wert der awsAccessKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwsAccessKey() {
        return awsAccessKey;
    }

    /**
     * Legt den Wert der awsAccessKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwsAccessKey(String value) {
        this.awsAccessKey = value;
    }

    /**
     * Ruft den Wert der awsSecret-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwsSecret() {
        return awsSecret;
    }

    /**
     * Legt den Wert der awsSecret-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwsSecret(String value) {
        this.awsSecret = value;
    }

}
