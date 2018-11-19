//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Requests heartbeat report for the gateway specified by gw_sgtin
 *       
 * 
 * <p>Java-Klasse für heartbeat_report_get_last_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_report_get_last_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gw_list" type="{urn:lsbl_heartbeat_service}gw_list" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_report_get_last_request", propOrder = {
    "gwList"
})
public class HeartbeatReportGetLastRequest {

    @XmlElement(name = "gw_list")
    protected GwList gwList;

    /**
     * Ruft den Wert der gwList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwList }
     *     
     */
    public GwList getGwList() {
        return gwList;
    }

    /**
     * Legt den Wert der gwList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwList }
     *     
     */
    public void setGwList(GwList value) {
        this.gwList = value;
    }

}
