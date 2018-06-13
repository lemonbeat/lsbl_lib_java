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
 *                 The filestream_transmit_request results in multiple responses, the response count is specified by the parameter window_size, containing chunks of a file in hexadecimal string notation.
 *             
 * 
 * <p>Java-Klasse f�r filestream_transmit_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="filestream_transmit_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chunk_index" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="chunk_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filestream_transmit_response", propOrder = {
    "name",
    "path",
    "chunkIndex",
    "chunkData"
})
public class FilestreamTransmitResponse {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String path;
    @XmlElement(name = "chunk_index")
    @XmlSchemaType(name = "unsignedInt")
    protected long chunkIndex;
    @XmlElement(name = "chunk_data", required = true)
    protected String chunkData;

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
     * Ruft den Wert der chunkIndex-Eigenschaft ab.
     * 
     */
    public long getChunkIndex() {
        return chunkIndex;
    }

    /**
     * Legt den Wert der chunkIndex-Eigenschaft fest.
     * 
     */
    public void setChunkIndex(long value) {
        this.chunkIndex = value;
    }

    /**
     * Ruft den Wert der chunkData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChunkData() {
        return chunkData;
    }

    /**
     * Legt den Wert der chunkData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChunkData(String value) {
        this.chunkData = value;
    }

}
