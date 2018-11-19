//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_value_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the value_service.
 *             
 * 
 * <p>Java-Klasse für value_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="value_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="value_description_get" type="{urn:lsbl_value_service}value_description_get_response"/>
 *           &lt;element name="value_get" type="{urn:lsbl_value_service}value_get_response"/>
 *           &lt;element name="value_get_last" type="{urn:lsbl_value_service}value_get_last_response"/>
 *           &lt;element name="value_set" type="{urn:lsbl_value_service}value_set_response"/>
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
@XmlType(name = "value_response", propOrder = {
    "valueDescriptionGet",
    "valueGet",
    "valueGetLast",
    "valueSet"
})
public class ValueResponse {

    @XmlElement(name = "value_description_get")
    protected ValueDescriptionGetResponse valueDescriptionGet;
    @XmlElement(name = "value_get")
    protected ValueGetResponse valueGet;
    @XmlElement(name = "value_get_last")
    protected ValueGetLastResponse valueGetLast;
    @XmlElement(name = "value_set")
    protected ValueSetResponse valueSet;

    /**
     * Ruft den Wert der valueDescriptionGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueDescriptionGetResponse }
     *     
     */
    public ValueDescriptionGetResponse getValueDescriptionGet() {
        return valueDescriptionGet;
    }

    /**
     * Legt den Wert der valueDescriptionGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDescriptionGetResponse }
     *     
     */
    public void setValueDescriptionGet(ValueDescriptionGetResponse value) {
        this.valueDescriptionGet = value;
    }

    /**
     * Ruft den Wert der valueGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueGetResponse }
     *     
     */
    public ValueGetResponse getValueGet() {
        return valueGet;
    }

    /**
     * Legt den Wert der valueGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueGetResponse }
     *     
     */
    public void setValueGet(ValueGetResponse value) {
        this.valueGet = value;
    }

    /**
     * Ruft den Wert der valueGetLast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueGetLastResponse }
     *     
     */
    public ValueGetLastResponse getValueGetLast() {
        return valueGetLast;
    }

    /**
     * Legt den Wert der valueGetLast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueGetLastResponse }
     *     
     */
    public void setValueGetLast(ValueGetLastResponse value) {
        this.valueGetLast = value;
    }

    /**
     * Ruft den Wert der valueSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetResponse }
     *     
     */
    public ValueSetResponse getValueSet() {
        return valueSet;
    }

    /**
     * Legt den Wert der valueSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetResponse }
     *     
     */
    public void setValueSet(ValueSetResponse value) {
        this.valueSet = value;
    }

}
