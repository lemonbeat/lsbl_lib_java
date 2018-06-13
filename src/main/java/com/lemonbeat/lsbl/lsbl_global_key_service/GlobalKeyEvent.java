//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_global_key_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the events of the global_key_service.
 *             
 * 
 * <p>Java-Klasse f�r global_key_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="global_key_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="key_exchanged" type="{urn:lsbl_global_key_service}key_exchanged_event"/>
 *           &lt;element name="key_error" type="{urn:lsbl_global_key_service}key_error_event"/>
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
@XmlType(name = "global_key_event", propOrder = {
    "keyExchanged",
    "keyError"
})
public class GlobalKeyEvent {

    @XmlElement(name = "key_exchanged")
    protected KeyExchangedEvent keyExchanged;
    @XmlElement(name = "key_error")
    protected KeyErrorEvent keyError;

    /**
     * Ruft den Wert der keyExchanged-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangedEvent }
     *     
     */
    public KeyExchangedEvent getKeyExchanged() {
        return keyExchanged;
    }

    /**
     * Legt den Wert der keyExchanged-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangedEvent }
     *     
     */
    public void setKeyExchanged(KeyExchangedEvent value) {
        this.keyExchanged = value;
    }

    /**
     * Ruft den Wert der keyError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyErrorEvent }
     *     
     */
    public KeyErrorEvent getKeyError() {
        return keyError;
    }

    /**
     * Legt den Wert der keyError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyErrorEvent }
     *     
     */
    public void setKeyError(KeyErrorEvent value) {
        this.keyError = value;
    }

}
