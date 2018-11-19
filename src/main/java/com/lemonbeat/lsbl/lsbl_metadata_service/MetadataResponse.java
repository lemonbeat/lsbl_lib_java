//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_metadata_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the responses of the metadata service.
 *             
 * 
 * <p>Java-Klasse für metadata_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="metadata_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="metadata_report" type="{urn:lsbl_metadata_service}metadata_report"/>
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
@XmlType(name = "metadata_response", propOrder = {
    "metadataReport"
})
public class MetadataResponse {

    @XmlElement(name = "metadata_report")
    protected MetadataReport metadataReport;

    /**
     * Ruft den Wert der metadataReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataReport }
     *     
     */
    public MetadataReport getMetadataReport() {
        return metadataReport;
    }

    /**
     * Legt den Wert der metadataReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataReport }
     *     
     */
    public void setMetadataReport(MetadataReport value) {
        this.metadataReport = value;
    }

}
