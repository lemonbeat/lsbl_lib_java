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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Definition of common commands used internally or by the gateway.
 * 			
 * 
 * <p>Java-Klasse für common_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="common_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="request_from_device" type="{urn:com.lemonbeat.lsbl.lsbl_common}request_from_device"/>
 *           &lt;element name="forward_to_device" type="{urn:com.lemonbeat.lsbl.lsbl_common}forward_to_device"/>
 *           &lt;element name="forward_to_service" type="{urn:com.lemonbeat.lsbl.lsbl_common}forward_to_service"/>
 *           &lt;element name="init_device_request" type="{urn:com.lemonbeat.lsbl.lsbl_common}init_device_request"/>
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
@XmlType(name = "common_cmd", propOrder = {
    "requestFromDevice",
    "forwardToDevice",
    "forwardToService",
    "initDeviceRequest"
})
public class CommonCmd {

    @XmlElement(name = "request_from_device")
    protected RequestFromDevice requestFromDevice;
    @XmlElement(name = "forward_to_device")
    protected ForwardToDevice forwardToDevice;
    @XmlElement(name = "forward_to_service")
    protected ForwardToService forwardToService;
    @XmlElement(name = "init_device_request")
    protected InitDeviceRequest initDeviceRequest;

    /**
     * Ruft den Wert der requestFromDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestFromDevice }
     *     
     */
    public RequestFromDevice getRequestFromDevice() {
        return requestFromDevice;
    }

    /**
     * Legt den Wert der requestFromDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFromDevice }
     *     
     */
    public void setRequestFromDevice(RequestFromDevice value) {
        this.requestFromDevice = value;
    }

    /**
     * Ruft den Wert der forwardToDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ForwardToDevice }
     *     
     */
    public ForwardToDevice getForwardToDevice() {
        return forwardToDevice;
    }

    /**
     * Legt den Wert der forwardToDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardToDevice }
     *     
     */
    public void setForwardToDevice(ForwardToDevice value) {
        this.forwardToDevice = value;
    }

    /**
     * Ruft den Wert der forwardToService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ForwardToService }
     *     
     */
    public ForwardToService getForwardToService() {
        return forwardToService;
    }

    /**
     * Legt den Wert der forwardToService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardToService }
     *     
     */
    public void setForwardToService(ForwardToService value) {
        this.forwardToService = value;
    }

    /**
     * Ruft den Wert der initDeviceRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InitDeviceRequest }
     *     
     */
    public InitDeviceRequest getInitDeviceRequest() {
        return initDeviceRequest;
    }

    /**
     * Legt den Wert der initDeviceRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InitDeviceRequest }
     *     
     */
    public void setInitDeviceRequest(InitDeviceRequest value) {
        this.initDeviceRequest = value;
    }

}
