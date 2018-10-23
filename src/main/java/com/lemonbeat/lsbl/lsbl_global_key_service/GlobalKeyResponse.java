//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_global_key_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the global_key_service.
 *             
 * 
 * <p>Java-Klasse für global_key_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="global_key_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="publickey_device_get" type="{urn:lsbl_global_key_service}publickey_device_get_response"/>
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
@XmlType(name = "global_key_response", propOrder = {
    "publickeyDeviceGet"
})
public class GlobalKeyResponse {

    @XmlElement(name = "publickey_device_get")
    protected PublickeyDeviceGetResponse publickeyDeviceGet;

    /**
     * Ruft den Wert der publickeyDeviceGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublickeyDeviceGetResponse }
     *     
     */
    public PublickeyDeviceGetResponse getPublickeyDeviceGet() {
        return publickeyDeviceGet;
    }

    /**
     * Legt den Wert der publickeyDeviceGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublickeyDeviceGetResponse }
     *     
     */
    public void setPublickeyDeviceGet(PublickeyDeviceGetResponse value) {
        this.publickeyDeviceGet = value;
    }

}
