//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_status_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Event fired by the status service to inform about a new status_report
 *       
 * 
 * <p>Java-Klasse für status_reported_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="status_reported_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="status_report_list" type="{urn:lsbl_status_service}status_report_list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "status_reported_event", propOrder = {
    "deviceSgtin",
    "gwSgtin",
    "statusReportList"
})
public class StatusReportedEvent {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "gw_sgtin", required = true)
    protected String gwSgtin;
    @XmlElement(name = "status_report_list", required = true)
    protected StatusReportList statusReportList;

    /**
     * Ruft den Wert der deviceSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSgtin() {
        return deviceSgtin;
    }

    /**
     * Legt den Wert der deviceSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSgtin(String value) {
        this.deviceSgtin = value;
    }

    /**
     * Ruft den Wert der gwSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwSgtin() {
        return gwSgtin;
    }

    /**
     * Legt den Wert der gwSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwSgtin(String value) {
        this.gwSgtin = value;
    }

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
