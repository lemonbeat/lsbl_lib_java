//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event fired by the topo_service to inform about a successfull device inclusion.
 *             
 * 
 * <p>Java-Klasse f�r device_included_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_included_event">
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
@XmlType(name = "device_included_event", propOrder = {
    "sgtinDevice",
    "sgtinGw",
    "lsdl"
})
public class DeviceIncludedEvent {

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
