//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_inclusion_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event raised by the gateway inclusion service when a unauthorized HTTP request is received.
 *                 This could indicate a hacking Attempt.
 *             
 * 
 * <p>Java-Klasse für http_unauthorized_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="http_unauthorized_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="http_header" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="http_payload" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http_unauthorized_event", propOrder = {
    "source",
    "httpHeader",
    "httpPayload"
})
public class HttpUnauthorizedEvent {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(name = "http_header", required = true)
    protected String httpHeader;
    @XmlElement(name = "http_payload", required = true)
    protected String httpPayload;

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der httpHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpHeader() {
        return httpHeader;
    }

    /**
     * Legt den Wert der httpHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpHeader(String value) {
        this.httpHeader = value;
    }

    /**
     * Ruft den Wert der httpPayload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpPayload() {
        return httpPayload;
    }

    /**
     * Legt den Wert der httpPayload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpPayload(String value) {
        this.httpPayload = value;
    }

}
