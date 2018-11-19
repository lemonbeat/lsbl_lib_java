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
 *                 Event fired by the global key service to inform about a successfull key exchange.
 *             
 * 
 * <p>Java-Klasse für device_firmware_update_report_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_firmware_update_report_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="device_data_list" type="{urn:lsbl_firmware_service}device_data_list"/>
 *         &lt;element name="firmware_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_firmware_update_report_event", propOrder = {
    "gwSgtin",
    "deviceDataList",
    "firmwareLabel",
    "message",
    "success"
})
public class DeviceFirmwareUpdateReportEvent {

    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;
    @XmlElement(name = "device_data_list", required = true)
    protected DeviceDataList deviceDataList;
    @XmlElement(name = "firmware_label", required = true)
    protected String firmwareLabel;
    @XmlElement(required = true)
    protected String message;
    protected boolean success;

    /**
     * Ruft den Wert der gwSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwSgtin() {
        return gwSgtin;
    }

    /**
     * Legt den Wert der gwSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwSgtin(String value) {
        this.gwSgtin = value;
    }

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
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der success-Eigenschaft ab.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Legt den Wert der success-Eigenschaft fest.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
