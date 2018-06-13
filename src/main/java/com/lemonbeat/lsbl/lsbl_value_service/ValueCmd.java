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
 *                 Definition of the commands of the value_service.
 *             
 * 
 * <p>Java-Klasse f�r value_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="value_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="value_get" type="{urn:lsbl_value_service}value_get_request"/>
 *           &lt;element name="value_get_last" type="{urn:lsbl_value_service}value_get_last_request"/>
 *           &lt;element name="value_set" type="{urn:lsbl_value_service}value_set_request"/>
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
@XmlType(name = "value_cmd", propOrder = {
    "valueGet",
    "valueGetLast",
    "valueSet"
})
public class ValueCmd {

    @XmlElement(name = "value_get")
    protected ValueGetRequest valueGet;
    @XmlElement(name = "value_get_last")
    protected ValueGetLastRequest valueGetLast;
    @XmlElement(name = "value_set")
    protected ValueSetRequest valueSet;

    /**
     * Ruft den Wert der valueGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueGetRequest }
     *     
     */
    public ValueGetRequest getValueGet() {
        return valueGet;
    }

    /**
     * Legt den Wert der valueGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueGetRequest }
     *     
     */
    public void setValueGet(ValueGetRequest value) {
        this.valueGet = value;
    }

    /**
     * Ruft den Wert der valueGetLast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueGetLastRequest }
     *     
     */
    public ValueGetLastRequest getValueGetLast() {
        return valueGetLast;
    }

    /**
     * Legt den Wert der valueGetLast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueGetLastRequest }
     *     
     */
    public void setValueGetLast(ValueGetLastRequest value) {
        this.valueGetLast = value;
    }

    /**
     * Ruft den Wert der valueSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetRequest }
     *     
     */
    public ValueSetRequest getValueSet() {
        return valueSet;
    }

    /**
     * Legt den Wert der valueSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetRequest }
     *     
     */
    public void setValueSet(ValueSetRequest value) {
        this.valueSet = value;
    }

}
