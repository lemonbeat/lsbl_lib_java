//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The request from the backend can target a specific device and a specific operation to be executed. 
 * 				This information can be supplied by the request parameters.
 *             
 * 
 * <p>Java-Klasse für init_device_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="init_device_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mac" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}mac"/>
 *         &lt;element name="operation_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "init_device_request", propOrder = {
    "mac",
    "operationId"
})
public class InitDeviceRequest {

    @XmlElement(required = true)
    protected String mac;
    @XmlElement(name = "operation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long operationId;

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
     * Ruft den Wert der operationId-Eigenschaft ab.
     * 
     */
    public long getOperationId() {
        return operationId;
    }

    /**
     * Legt den Wert der operationId-Eigenschaft fest.
     * 
     */
    public void setOperationId(long value) {
        this.operationId = value;
    }

}
