//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_value_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event fired by the value_service to inform about a value_report sent from a device to the gateway.
 *             
 * 
 * <p>Java-Klasse f�r device_value_reported complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_value_reported">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgtin_device" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="sgtin_gw" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="lsdl" type="{urn:lsbl_common_base_types}lsdl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_value_reported", propOrder = {
    "sgtinDevice",
    "sgtinGw",
    "lsdl"
})
public class DeviceValueReported {

    @XmlElement(name = "sgtin_device", required = true)
    protected String sgtinDevice;
    @XmlElement(name = "sgtin_gw", required = true)
    protected String sgtinGw;
    @XmlElement(required = true)
    protected String lsdl;

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
     * Ruft den Wert der lsdl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsdl() {
        return lsdl;
    }

    /**
     * Legt den Wert der lsdl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsdl(String value) {
        this.lsdl = value;
    }

}
