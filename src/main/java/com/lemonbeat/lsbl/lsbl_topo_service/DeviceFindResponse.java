//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response for the request device_find responses with the topology informations known by the backend.
 *       
 * 
 * <p>Java-Klasse für device_find_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_find_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="device_mac" type="{urn:lsbl_common_base_types}mac"/>
 *         &lt;element name="radio_mode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="lsdl" type="{urn:lsbl_common_base_types}lsdl"/>
 *         &lt;element name="gateways" type="{urn:lsbl_topo_service}gateway_list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_find_response", propOrder = {
    "deviceSgtin",
    "deviceMac",
    "radioMode",
    "included",
    "lsdl",
    "gateways"
})
public class DeviceFindResponse {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "device_mac", required = true)
    protected String deviceMac;
    @XmlElement(name = "radio_mode")
    @XmlSchemaType(name = "unsignedInt")
    protected long radioMode;
    @XmlSchemaType(name = "unsignedInt")
    protected long included;
    @XmlElement(required = true)
    protected String lsdl;
    @XmlElement(required = true)
    protected GatewayList gateways;

    /**
     * Ruft den Wert der deviceSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSgtin() {
        return deviceSgtin;
    }

    /**
     * Legt den Wert der deviceSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSgtin(String value) {
        this.deviceSgtin = value;
    }

    /**
     * Ruft den Wert der deviceMac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMac() {
        return deviceMac;
    }

    /**
     * Legt den Wert der deviceMac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMac(String value) {
        this.deviceMac = value;
    }

    /**
     * Ruft den Wert der radioMode-Eigenschaft ab.
     * 
     */
    public long getRadioMode() {
        return radioMode;
    }

    /**
     * Legt den Wert der radioMode-Eigenschaft fest.
     * 
     */
    public void setRadioMode(long value) {
        this.radioMode = value;
    }

    /**
     * Ruft den Wert der included-Eigenschaft ab.
     * 
     */
    public long getIncluded() {
        return included;
    }

    /**
     * Legt den Wert der included-Eigenschaft fest.
     * 
     */
    public void setIncluded(long value) {
        this.included = value;
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

    /**
     * Ruft den Wert der gateways-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayList }
     *     
     */
    public GatewayList getGateways() {
        return gateways;
    }

    /**
     * Legt den Wert der gateways-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayList }
     *     
     */
    public void setGateways(GatewayList value) {
        this.gateways = value;
    }

}
