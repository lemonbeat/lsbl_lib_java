//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
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
 *         &lt;element name="device_mac" type="{urn:lsbl_common_base_types}mac"/>
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
    "deviceMac",
    "operationId"
})
public class InitDeviceRequest {

    @XmlElement(name = "device_mac", required = true)
    protected String deviceMac;
    @XmlElement(name = "operation_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long operationId;

    /**
     * Ruft den Wert der deviceMac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMac() {
        return deviceMac;
    }

    /**
     * Legt den Wert der deviceMac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMac(String value) {
        this.deviceMac = value;
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
