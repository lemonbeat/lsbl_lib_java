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
 *         Definition of the commands of the status_service.
 *       
 * 
 * <p>Java-Klasse für status_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="status_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="status_report_get" type="{urn:com.lemonbeat.lsbl.lsbl_status_service}status_report_get_request"/>
 *           &lt;element name="status_report_delete" type="{urn:com.lemonbeat.lsbl.lsbl_status_service}status_report_delete_request"/>
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
@XmlType(name = "status_cmd", propOrder = {
    "statusReportGet",
    "statusReportDelete"
})
public class StatusCmd {

    @XmlElement(name = "status_report_get")
    protected StatusReportGetRequest statusReportGet;
    @XmlElement(name = "status_report_delete")
    protected StatusReportDeleteRequest statusReportDelete;

    /**
     * Ruft den Wert der statusReportGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportGetRequest }
     *     
     */
    public StatusReportGetRequest getStatusReportGet() {
        return statusReportGet;
    }

    /**
     * Legt den Wert der statusReportGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportGetRequest }
     *     
     */
    public void setStatusReportGet(StatusReportGetRequest value) {
        this.statusReportGet = value;
    }

    /**
     * Ruft den Wert der statusReportDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportDeleteRequest }
     *     
     */
    public StatusReportDeleteRequest getStatusReportDelete() {
        return statusReportDelete;
    }

    /**
     * Legt den Wert der statusReportDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportDeleteRequest }
     *     
     */
    public void setStatusReportDelete(StatusReportDeleteRequest value) {
        this.statusReportDelete = value;
    }

}
