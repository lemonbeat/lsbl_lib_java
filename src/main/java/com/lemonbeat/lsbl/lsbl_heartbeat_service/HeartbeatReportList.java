//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_heartbeat_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         List of heartbeat_reports
 *       
 * 
 * <p>Java-Klasse für heartbeat_report_list complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heartbeat_report_list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heartbeat_report" type="{urn:lsbl_heartbeat_service}heartbeat_report" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heartbeat_report_list", propOrder = {
    "heartbeatReport"
})
public class HeartbeatReportList {

    @XmlElement(name = "heartbeat_report")
    protected List<HeartbeatReport> heartbeatReport;

    /**
     * Gets the value of the heartbeatReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heartbeatReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeartbeatReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeartbeatReport }
     * 
     * 
     */
    public List<HeartbeatReport> getHeartbeatReport() {
        if (heartbeatReport == null) {
            heartbeatReport = new ArrayList<HeartbeatReport>();
        }
        return this.heartbeatReport;
    }

}
