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
 *                 Definition of the commands of the file_service.
 *             
 * 
 * <p>Java-Klasse f�r file_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="file_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="fileinfo_get" type="{urn:lsbl_file_service}fileinfo_get_request"/>
 *           &lt;element name="filestream_transmit" type="{urn:lsbl_file_service}filestream_transmit_request"/>
 *           &lt;element name="filestream_retransmit" type="{urn:lsbl_file_service}filestream_retransmit_request"/>
 *           &lt;element name="filestream_complete" type="{urn:lsbl_file_service}filestream_complete"/>
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
@XmlType(name = "file_cmd", propOrder = {
    "fileinfoGet",
    "filestreamTransmit",
    "filestreamRetransmit",
    "filestreamComplete"
})
public class FileCmd {

    @XmlElement(name = "fileinfo_get")
    protected FileinfoGetRequest fileinfoGet;
    @XmlElement(name = "filestream_transmit")
    protected FilestreamTransmitRequest filestreamTransmit;
    @XmlElement(name = "filestream_retransmit")
    protected FilestreamRetransmitRequest filestreamRetransmit;
    @XmlElement(name = "filestream_complete")
    protected FilestreamComplete filestreamComplete;

    /**
     * Ruft den Wert der fileinfoGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileinfoGetRequest }
     *     
     */
    public FileinfoGetRequest getFileinfoGet() {
        return fileinfoGet;
    }

    /**
     * Legt den Wert der fileinfoGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileinfoGetRequest }
     *     
     */
    public void setFileinfoGet(FileinfoGetRequest value) {
        this.fileinfoGet = value;
    }

    /**
     * Ruft den Wert der filestreamTransmit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilestreamTransmitRequest }
     *     
     */
    public FilestreamTransmitRequest getFilestreamTransmit() {
        return filestreamTransmit;
    }

    /**
     * Legt den Wert der filestreamTransmit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilestreamTransmitRequest }
     *     
     */
    public void setFilestreamTransmit(FilestreamTransmitRequest value) {
        this.filestreamTransmit = value;
    }

    /**
     * Ruft den Wert der filestreamRetransmit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilestreamRetransmitRequest }
     *     
     */
    public FilestreamRetransmitRequest getFilestreamRetransmit() {
        return filestreamRetransmit;
    }

    /**
     * Legt den Wert der filestreamRetransmit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilestreamRetransmitRequest }
     *     
     */
    public void setFilestreamRetransmit(FilestreamRetransmitRequest value) {
        this.filestreamRetransmit = value;
    }

    /**
     * Ruft den Wert der filestreamComplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilestreamComplete }
     *     
     */
    public FilestreamComplete getFilestreamComplete() {
        return filestreamComplete;
    }

    /**
     * Legt den Wert der filestreamComplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilestreamComplete }
     *     
     */
    public void setFilestreamComplete(FilestreamComplete value) {
        this.filestreamComplete = value;
    }

}
