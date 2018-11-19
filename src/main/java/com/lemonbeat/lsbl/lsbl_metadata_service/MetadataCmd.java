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
 *                 Definition of the commands of the metadata service.
 *             
 * 
 * <p>Java-Klasse für metadata_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="metadata_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="metadata_get" type="{urn:lsbl_metadata_service}metadata_get_request"/>
 *           &lt;element name="metadata_set" type="{urn:lsbl_metadata_service}metadata_set_request"/>
 *           &lt;element name="metadata_delete" type="{urn:lsbl_metadata_service}metadata_delete_request"/>
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
@XmlType(name = "metadata_cmd", propOrder = {
    "metadataGet",
    "metadataSet",
    "metadataDelete"
})
public class MetadataCmd {

    @XmlElement(name = "metadata_get")
    protected MetadataGetRequest metadataGet;
    @XmlElement(name = "metadata_set")
    protected MetadataSetRequest metadataSet;
    @XmlElement(name = "metadata_delete")
    protected MetadataDeleteRequest metadataDelete;

    /**
     * Ruft den Wert der metadataGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataGetRequest }
     *     
     */
    public MetadataGetRequest getMetadataGet() {
        return metadataGet;
    }

    /**
     * Legt den Wert der metadataGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataGetRequest }
     *     
     */
    public void setMetadataGet(MetadataGetRequest value) {
        this.metadataGet = value;
    }

    /**
     * Ruft den Wert der metadataSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataSetRequest }
     *     
     */
    public MetadataSetRequest getMetadataSet() {
        return metadataSet;
    }

    /**
     * Legt den Wert der metadataSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataSetRequest }
     *     
     */
    public void setMetadataSet(MetadataSetRequest value) {
        this.metadataSet = value;
    }

    /**
     * Ruft den Wert der metadataDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeleteRequest }
     *     
     */
    public MetadataDeleteRequest getMetadataDelete() {
        return metadataDelete;
    }

    /**
     * Legt den Wert der metadataDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeleteRequest }
     *     
     */
    public void setMetadataDelete(MetadataDeleteRequest value) {
        this.metadataDelete = value;
    }

}
