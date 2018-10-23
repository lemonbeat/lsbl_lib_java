//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_status_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of the events of the status_service.
 *       
 * 
 * <p>Java-Klasse für status_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="status_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="status_reported" type="{urn:lsbl_status_service}status_reported_event"/>
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
@XmlType(name = "status_event", propOrder = {
    "statusReported"
})
public class StatusEvent {

    @XmlElement(name = "status_reported")
    protected StatusReportedEvent statusReported;

    /**
     * Ruft den Wert der statusReported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportedEvent }
     *     
     */
    public StatusReportedEvent getStatusReported() {
        return statusReported;
    }

    /**
     * Legt den Wert der statusReported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportedEvent }
     *     
     */
    public void setStatusReported(StatusReportedEvent value) {
        this.statusReported = value;
    }

}
