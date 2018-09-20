//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_inclusion_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the events of the inclusion_service.
 *             
 * 
 * <p>Java-Klasse für inclusion_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="inclusion_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="http_unauthorized" type="{urn:com.lemonbeat.lsbl.lsbl_inclusion_service}http_unauthorized_event"/>
 *           &lt;element name="http_format_error" type="{urn:com.lemonbeat.lsbl.lsbl_inclusion_service}http_format_error_event"/>
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
@XmlType(name = "inclusion_event", propOrder = {
    "httpUnauthorized",
    "httpFormatError"
})
public class InclusionEvent {

    @XmlElement(name = "http_unauthorized")
    protected HttpUnauthorizedEvent httpUnauthorized;
    @XmlElement(name = "http_format_error")
    protected HttpFormatErrorEvent httpFormatError;

    /**
     * Ruft den Wert der httpUnauthorized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpUnauthorizedEvent }
     *     
     */
    public HttpUnauthorizedEvent getHttpUnauthorized() {
        return httpUnauthorized;
    }

    /**
     * Legt den Wert der httpUnauthorized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpUnauthorizedEvent }
     *     
     */
    public void setHttpUnauthorized(HttpUnauthorizedEvent value) {
        this.httpUnauthorized = value;
    }

    /**
     * Ruft den Wert der httpFormatError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpFormatErrorEvent }
     *     
     */
    public HttpFormatErrorEvent getHttpFormatError() {
        return httpFormatError;
    }

    /**
     * Legt den Wert der httpFormatError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpFormatErrorEvent }
     *     
     */
    public void setHttpFormatError(HttpFormatErrorEvent value) {
        this.httpFormatError = value;
    }

}
