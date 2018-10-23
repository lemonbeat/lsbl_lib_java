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
 * 				The RequestFromDevice payload is used to request data from the device. 
 * 				The backend can specify a device via mac address and includes a LsDL command with the corresponding service_id. 
 * 				The answer of the LsDL command will be send back to the backend. 
 * 				This payload basically has no difference between the request and the response regarding the structure. 
 * 				The only thing that changes content wise is the inner xml of the LsDL element. 
 * 				In the request this contains the LsDL command for the device and in the response this contains the answer from the device.
 * 			
 * 
 * <p>Java-Klasse für request_from_device complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="request_from_device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_mac" type="{urn:lsbl_common_base_types}mac"/>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="lsdl" type="{urn:lsbl_common_base_types}lsdl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request_from_device", propOrder = {
    "deviceMac",
    "serviceId",
    "lsdl"
})
public class RequestFromDevice {

    @XmlElement(name = "device_mac", required = true)
    protected String deviceMac;
    @XmlElement(name = "service_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long serviceId;
    @XmlElement(required = true)
    protected String lsdl;

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
