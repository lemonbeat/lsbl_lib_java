//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Event fired by the topo_service to inform about a started replacement process.
 *       
 * 
 * <p>Java-Klasse für gateway_replacement_initialized_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gateway_replacement_initialized_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="new_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="old_sgtin" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gateway_replacement_initialized_event", propOrder = {
    "newSgtin",
    "oldSgtin"
})
public class GatewayReplacementInitializedEvent {

    @XmlElement(name = "new_sgtin", required = true)
    protected String newSgtin;
    @XmlElement(name = "old_sgtin", required = true)
    protected String oldSgtin;

    /**
     * Ruft den Wert der newSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSgtin() {
        return newSgtin;
    }

    /**
     * Legt den Wert der newSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSgtin(String value) {
        this.newSgtin = value;
    }

    /**
     * Ruft den Wert der oldSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSgtin() {
        return oldSgtin;
    }

    /**
     * Legt den Wert der oldSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSgtin(String value) {
        this.oldSgtin = value;
    }

}
