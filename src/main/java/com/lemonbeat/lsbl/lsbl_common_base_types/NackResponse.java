//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_common_base_types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The application error response indicating that an error occurs during the request
 *             
 * 
 * <p>Java-Klasse f�r nack-response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nack-response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="request" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="service_id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="service_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="error_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="error_code_int" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="severity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="function" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nack-response")
public class NackResponse {

    @XmlAttribute(name = "request", required = true)
    protected String request;
    @XmlAttribute(name = "service_id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long serviceId;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "service_code")
    protected String serviceCode;
    @XmlAttribute(name = "msg", required = true)
    protected String msg;
    @XmlAttribute(name = "error_code")
    protected String errorCode;
    @XmlAttribute(name = "error_code_int", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long errorCodeInt;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timestamp;
    @XmlAttribute(name = "severity", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long severity;
    @XmlAttribute(name = "function")
    protected String function;
    @XmlAttribute(name = "module")
    protected String module;
    @XmlAttribute(name = "data")
    protected String data;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

    /**
     * Ruft den Wert der serviceId-Eigenschaft ab.
     * 
     */
    public long getServiceId() {
        return serviceId;
    }

    /**
     * Legt den Wert der serviceId-Eigenschaft fest.
     * 
     */
    public void setServiceId(long value) {
        this.serviceId = value;
    }

    /**
     * Ruft den Wert der domain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Legt den Wert der domain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Ruft den Wert der serviceCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Legt den Wert der serviceCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Ruft den Wert der msg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Legt den Wert der msg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorCodeInt-Eigenschaft ab.
     * 
     */
    public long getErrorCodeInt() {
        return errorCodeInt;
    }

    /**
     * Legt den Wert der errorCodeInt-Eigenschaft fest.
     * 
     */
    public void setErrorCodeInt(long value) {
        this.errorCodeInt = value;
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
     * Ruft den Wert der severity-Eigenschaft ab.
     * 
     */
    public long getSeverity() {
        return severity;
    }

    /**
     * Legt den Wert der severity-Eigenschaft fest.
     * 
     */
    public void setSeverity(long value) {
        this.severity = value;
    }

    /**
     * Ruft den Wert der function-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Legt den Wert der function-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Ruft den Wert der module-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Legt den Wert der module-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
