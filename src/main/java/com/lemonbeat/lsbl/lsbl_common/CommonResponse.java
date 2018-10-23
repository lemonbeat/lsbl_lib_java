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
import javax.xml.bind.annotation.XmlType;
import com.lemonbeat.lsbl.lsbl_common_base_types.AckResponse;
import com.lemonbeat.lsbl.lsbl_common_base_types.NackResponse;
import com.lemonbeat.lsbl.lsbl_common_base_types.PendingResponse;


/**
 * 
 * 				Definition of the responses.
 * 			
 * 
 * <p>Java-Klasse für common_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="common_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="request_from_device" type="{urn:lsbl_common}request_from_device"/>
 *           &lt;element name="ack" type="{urn:lsbl_common_base_types}ack-response"/>
 *           &lt;element name="nack" type="{urn:lsbl_common_base_types}nack-response"/>
 *           &lt;element name="pending" type="{urn:lsbl_common_base_types}pending-response"/>
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
@XmlType(name = "common_response", propOrder = {
    "requestFromDevice",
    "ack",
    "nack",
    "pending"
})
public class CommonResponse {

    @XmlElement(name = "request_from_device")
    protected RequestFromDevice requestFromDevice;
    protected AckResponse ack;
    protected NackResponse nack;
    protected PendingResponse pending;

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
     * Ruft den Wert der ack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AckResponse }
     *     
     */
    public AckResponse getAck() {
        return ack;
    }

    /**
     * Legt den Wert der ack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AckResponse }
     *     
     */
    public void setAck(AckResponse value) {
        this.ack = value;
    }

    /**
     * Ruft den Wert der nack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NackResponse }
     *     
     */
    public NackResponse getNack() {
        return nack;
    }

    /**
     * Legt den Wert der nack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NackResponse }
     *     
     */
    public void setNack(NackResponse value) {
        this.nack = value;
    }

    /**
     * Ruft den Wert der pending-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PendingResponse }
     *     
     */
    public PendingResponse getPending() {
        return pending;
    }

    /**
     * Legt den Wert der pending-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingResponse }
     *     
     */
    public void setPending(PendingResponse value) {
        this.pending = value;
    }

}
