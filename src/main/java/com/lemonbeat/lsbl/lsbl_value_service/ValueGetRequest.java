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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The command to request values from a device.
 *             
 * 
 * <p>Java-Klasse f�r value_get_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="value_get_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="mac" type="{urn:lsbl_common_base_types}mac"/>
 *         &lt;element name="radio_mode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="value_ids" type="{urn:lsbl_value_service}value_id_list" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value_get_request", propOrder = {
    "deviceSgtin",
    "gwSgtin",
    "mac",
    "radioMode",
    "valueIds"
})
public class ValueGetRequest {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;
    @XmlElement(required = true)
    protected String mac;
    @XmlElement(name = "radio_mode")
    @XmlSchemaType(name = "unsignedInt")
    protected long radioMode;
    @XmlElement(name = "value_ids")
    protected ValueIdList valueIds;

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
     * Ruft den Wert der mac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Legt den Wert der mac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
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
     * Ruft den Wert der valueIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueIdList }
     *     
     */
    public ValueIdList getValueIds() {
        return valueIds;
    }

    /**
     * Legt den Wert der valueIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueIdList }
     *     
     */
    public void setValueIds(ValueIdList value) {
        this.valueIds = value;
    }

}
