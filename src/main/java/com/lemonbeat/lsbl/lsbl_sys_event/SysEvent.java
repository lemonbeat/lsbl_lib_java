//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_sys_event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the system events.
 *             
 * 
 * <p>Java-Klasse für sys_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sys_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="error_request_format" type="{urn:lsbl_sys_event}error_request_format_event"/>
 *           &lt;element name="error_client_key" type="{urn:lsbl_sys_event}error_client_key_event"/>
 *           &lt;element name="error_payload_crypt" type="{urn:lsbl_sys_event}error_payload_crypt_event"/>
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
@XmlType(name = "sys_event", propOrder = {
    "errorRequestFormat",
    "errorClientKey",
    "errorPayloadCrypt"
})
public class SysEvent {

    @XmlElement(name = "error_request_format")
    protected ErrorRequestFormatEvent errorRequestFormat;
    @XmlElement(name = "error_client_key")
    protected ErrorClientKeyEvent errorClientKey;
    @XmlElement(name = "error_payload_crypt")
    protected ErrorPayloadCryptEvent errorPayloadCrypt;

    /**
     * Ruft den Wert der errorRequestFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorRequestFormatEvent }
     *     
     */
    public ErrorRequestFormatEvent getErrorRequestFormat() {
        return errorRequestFormat;
    }

    /**
     * Legt den Wert der errorRequestFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorRequestFormatEvent }
     *     
     */
    public void setErrorRequestFormat(ErrorRequestFormatEvent value) {
        this.errorRequestFormat = value;
    }

    /**
     * Ruft den Wert der errorClientKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorClientKeyEvent }
     *     
     */
    public ErrorClientKeyEvent getErrorClientKey() {
        return errorClientKey;
    }

    /**
     * Legt den Wert der errorClientKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorClientKeyEvent }
     *     
     */
    public void setErrorClientKey(ErrorClientKeyEvent value) {
        this.errorClientKey = value;
    }

    /**
     * Ruft den Wert der errorPayloadCrypt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorPayloadCryptEvent }
     *     
     */
    public ErrorPayloadCryptEvent getErrorPayloadCrypt() {
        return errorPayloadCrypt;
    }

    /**
     * Legt den Wert der errorPayloadCrypt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorPayloadCryptEvent }
     *     
     */
    public void setErrorPayloadCrypt(ErrorPayloadCryptEvent value) {
        this.errorPayloadCrypt = value;
    }

}
