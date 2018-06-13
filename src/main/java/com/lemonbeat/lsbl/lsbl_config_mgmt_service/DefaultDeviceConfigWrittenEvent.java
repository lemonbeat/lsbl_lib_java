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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event raised by the config service when the configuration is successfully written to a device.
 *             
 * 
 * <p>Java-Klasse f�r default_device_config_written_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="default_device_config_written_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgtin_device" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="sgtin_gw" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default_device_config_written_event", propOrder = {
    "sgtinDevice",
    "sgtinGw",
    "label"
})
public class DefaultDeviceConfigWrittenEvent {

    @XmlElement(name = "sgtin_device", required = true)
    protected String sgtinDevice;
    @XmlElement(name = "sgtin_gw", required = true)
    protected String sgtinGw;
    @XmlElement(required = true)
    protected String label;

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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
