//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_sys_event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Event fired by the forwarding service when it does not find a key to decrypt or encrypt a client message.
 *                 This happens when a gateway is not registered in the backend system
 *             
 * 
 * <p>Java-Klasse f�r error_client_key_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="error_client_key_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error_code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client_adr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msg_payload" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error_client_key_event", propOrder = {
    "source",
    "errorCode",
    "message",
    "clientAdr",
    "msgPayload"
})
public class ErrorClientKeyEvent {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(name = "error_code")
    @XmlSchemaType(name = "unsignedInt")
    protected long errorCode;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(name = "client_adr", required = true)
    protected String clientAdr;
    @XmlElement(name = "msg_payload", required = true)
    protected String msgPayload;

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     */
    public long getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     */
    public void setErrorCode(long value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der clientAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAdr() {
        return clientAdr;
    }

    /**
     * Legt den Wert der clientAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAdr(String value) {
        this.clientAdr = value;
    }

    /**
     * Ruft den Wert der msgPayload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPayload() {
        return msgPayload;
    }

    /**
     * Legt den Wert der msgPayload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPayload(String value) {
        this.msgPayload = value;
    }

}
