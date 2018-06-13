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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Requests a window of chunks from the serving endpoint. As part of the file streaming operation this frame is used to request a window of binary chunks from the Server. Server in this case can be any endpoint offering a file for download.
 *             
 * 
 * <p>Java-Klasse f�r filestream_transmit_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="filestream_transmit_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="window_size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="chunk_size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="first_chunk" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filestream_transmit_request", propOrder = {
    "name",
    "path",
    "windowSize",
    "chunkSize",
    "firstChunk"
})
public class FilestreamTransmitRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String path;
    @XmlElement(name = "window_size")
    @XmlSchemaType(name = "unsignedInt")
    protected long windowSize;
    @XmlElement(name = "chunk_size", defaultValue = "256")
    @XmlSchemaType(name = "unsignedInt")
    protected long chunkSize;
    @XmlElement(name = "first_chunk")
    @XmlSchemaType(name = "unsignedInt")
    protected long firstChunk;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der path-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Legt den Wert der path-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Ruft den Wert der windowSize-Eigenschaft ab.
     * 
     */
    public long getWindowSize() {
        return windowSize;
    }

    /**
     * Legt den Wert der windowSize-Eigenschaft fest.
     * 
     */
    public void setWindowSize(long value) {
        this.windowSize = value;
    }

    /**
     * Ruft den Wert der chunkSize-Eigenschaft ab.
     * 
     */
    public long getChunkSize() {
        return chunkSize;
    }

    /**
     * Legt den Wert der chunkSize-Eigenschaft fest.
     * 
     */
    public void setChunkSize(long value) {
        this.chunkSize = value;
    }

    /**
     * Ruft den Wert der firstChunk-Eigenschaft ab.
     * 
     */
    public long getFirstChunk() {
        return firstChunk;
    }

    /**
     * Legt den Wert der firstChunk-Eigenschaft fest.
     * 
     */
    public void setFirstChunk(long value) {
        this.firstChunk = value;
    }

}
