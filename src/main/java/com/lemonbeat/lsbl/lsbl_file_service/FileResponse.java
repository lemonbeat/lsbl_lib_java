//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_file_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the file_service.
 *             
 * 
 * <p>Java-Klasse f�r file_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="file_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="fileinfo_get" type="{urn:lsbl_file_service}fileinfo_get_response"/>
 *           &lt;element name="filestream_transmit" type="{urn:lsbl_file_service}filestream_transmit_response"/>
 *           &lt;element name="filestream_retransmit" type="{urn:lsbl_file_service}filestream_transmit_response"/>
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
@XmlType(name = "file_response", propOrder = {
    "fileinfoGet",
    "filestreamTransmit",
    "filestreamRetransmit"
})
public class FileResponse {

    @XmlElement(name = "fileinfo_get")
    protected FileinfoGetResponse fileinfoGet;
    @XmlElement(name = "filestream_transmit")
    protected FilestreamTransmitResponse filestreamTransmit;
    @XmlElement(name = "filestream_retransmit")
    protected FilestreamTransmitResponse filestreamRetransmit;

    /**
     * Ruft den Wert der fileinfoGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileinfoGetResponse }
     *     
     */
    public FileinfoGetResponse getFileinfoGet() {
        return fileinfoGet;
    }

    /**
     * Legt den Wert der fileinfoGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileinfoGetResponse }
     *     
     */
    public void setFileinfoGet(FileinfoGetResponse value) {
        this.fileinfoGet = value;
    }

    /**
     * Ruft den Wert der filestreamTransmit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilestreamTransmitResponse }
     *     
     */
    public FilestreamTransmitResponse getFilestreamTransmit() {
        return filestreamTransmit;
    }

    /**
     * Legt den Wert der filestreamTransmit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilestreamTransmitResponse }
     *     
     */
    public void setFilestreamTransmit(FilestreamTransmitResponse value) {
        this.filestreamTransmit = value;
    }

    /**
     * Ruft den Wert der filestreamRetransmit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilestreamTransmitResponse }
     *     
     */
    public FilestreamTransmitResponse getFilestreamRetransmit() {
        return filestreamRetransmit;
    }

    /**
     * Legt den Wert der filestreamRetransmit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilestreamTransmitResponse }
     *     
     */
    public void setFilestreamRetransmit(FilestreamTransmitResponse value) {
        this.filestreamRetransmit = value;
    }

}
