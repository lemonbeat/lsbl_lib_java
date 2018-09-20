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
 * 				The request is usually used by the backend to send LsDL messages to a device. 
 * 				The forwarding is handled by the gateway, so the backend just sends it to the gateway. 
 * 				The targeted device is specified by the mac address and the service_id which will be a compressed representation of the real port number specified by the lemonbeat protocol.
 * 			
 * 
 * <p>Java-Klasse für forward_to_device complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="forward_to_device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mac" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}mac"/>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="radio_mode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
@XmlType(name = "forward_to_device", propOrder = {
    "mac",
    "serviceId",
    "format",
    "radioMode",
    "lsdl"
})
public class ForwardToDevice {

    @XmlElement(required = true)
    protected String mac;
    @XmlElement(name = "service_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long serviceId;
    @XmlElement(required = true)
    protected String format;
    @XmlElement(name = "radio_mode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long radioMode;
    @XmlElement(required = true)
    protected String lsdl;

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
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der radioMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRadioMode() {
        return radioMode;
    }

    /**
     * Legt den Wert der radioMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRadioMode(Long value) {
        this.radioMode = value;
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
