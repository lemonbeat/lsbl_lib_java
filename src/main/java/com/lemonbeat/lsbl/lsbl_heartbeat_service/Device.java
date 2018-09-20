//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The device sgtin - mac pair.
 *       
 * 
 * <p>Java-Klasse für device complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sgtin" use="required" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96" />
 *       &lt;attribute name="mac" use="required" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}mac" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="ping_timed_out" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device")
public class Device {

    @XmlAttribute(name = "sgtin", required = true)
    protected String sgtin;
    @XmlAttribute(name = "mac", required = true)
    protected String mac;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timestamp;
    @XmlAttribute(name = "ping_timed_out")
    protected Boolean pingTimedOut;

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
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimestamp(BigInteger value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der pingTimedOut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPingTimedOut() {
        return pingTimedOut;
    }

    /**
     * Legt den Wert der pingTimedOut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPingTimedOut(Boolean value) {
        this.pingTimedOut = value;
    }

}
