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
 *                 Definition of the events of the file_service.
 *             
 * 
 * <p>Java-Klasse f�r file_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="file_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="file_unknown" type="{urn:lsbl_file_service}file_unknown_event"/>
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
@XmlType(name = "file_event", propOrder = {
    "fileUnknown"
})
public class FileEvent {

    @XmlElement(name = "file_unknown")
    protected FileUnknownEvent fileUnknown;

    /**
     * Ruft den Wert der fileUnknown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileUnknownEvent }
     *     
     */
    public FileUnknownEvent getFileUnknown() {
        return fileUnknown;
    }

    /**
     * Legt den Wert der fileUnknown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileUnknownEvent }
     *     
     */
    public void setFileUnknown(FileUnknownEvent value) {
        this.fileUnknown = value;
    }

}
