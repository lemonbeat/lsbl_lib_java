//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event raised by the config service when an error occurs during configuration fetch or set.
 *             
 * 
 * <p>Java-Klasse f�r device_config_error_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_config_error_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgtin_device" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="sgtin_gw" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="error_code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_config_error_event", propOrder = {
    "sgtinDevice",
    "sgtinGw",
    "errorCode",
    "action",
    "message"
})
public class DeviceConfigErrorEvent {

    @XmlElement(name = "sgtin_device", required = true)
    protected String sgtinDevice;
    @XmlElement(name = "sgtin_gw", required = true)
    protected String sgtinGw;
    @XmlElement(name = "error_code")
    @XmlSchemaType(name = "unsignedInt")
    protected long errorCode;
    @XmlElement(required = true)
    protected String action;
    @XmlElement(required = true)
    protected String message;

    /**
     * Ruft den Wert der sgtinDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtinDevice() {
        return sgtinDevice;
    }

    /**
     * Legt den Wert der sgtinDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtinDevice(String value) {
        this.sgtinDevice = value;
    }

    /**
     * Ruft den Wert der sgtinGw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtinGw() {
        return sgtinGw;
    }

    /**
     * Legt den Wert der sgtinGw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtinGw(String value) {
        this.sgtinGw = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     */
    public long getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     */
    public void setErrorCode(long value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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

}
