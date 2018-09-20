//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_status_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of the responses of the status_service.
 *       
 * 
 * <p>Java-Klasse für status_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="status_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="status_report_list" type="{urn:com.lemonbeat.lsbl.lsbl_status_service}status_report_list"/>
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
@XmlType(name = "status_response", propOrder = {
    "statusReportList"
})
public class StatusResponse {

    @XmlElement(name = "status_report_list")
    protected StatusReportList statusReportList;

    /**
     * Ruft den Wert der statusReportList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportList }
     *     
     */
    public StatusReportList getStatusReportList() {
        return statusReportList;
    }

    /**
     * Legt den Wert der statusReportList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportList }
     *     
     */
    public void setStatusReportList(StatusReportList value) {
        this.statusReportList = value;
    }

}
