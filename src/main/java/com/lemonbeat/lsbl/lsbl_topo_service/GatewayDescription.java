//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of a gateway description report.
 *       
 * 
 * <p>Java-Klasse für gateway_description complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gateway_description">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="lsdl" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}lsdl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gateway_description", propOrder = {
    "sgtin",
    "lsdl"
})
public class GatewayDescription {

    @XmlElement(required = true)
    protected String sgtin;
    @XmlElement(required = true)
    protected String lsdl;

    /**
     * Ruft den Wert der sgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtin() {
        return sgtin;
    }

    /**
     * Legt den Wert der sgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtin(String value) {
        this.sgtin = value;
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
