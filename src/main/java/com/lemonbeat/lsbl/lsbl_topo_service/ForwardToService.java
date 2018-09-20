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
 *         A LsDL frame in this case a device_description_report send by the device to the gateway.
 *       
 * 
 * <p>Java-Klasse für forward_to_service complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="forward_to_service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_description_report" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}lsdl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forward_to_service", propOrder = {
    "deviceDescriptionReport"
})
public class ForwardToService {

    @XmlElement(name = "device_description_report", required = true)
    protected String deviceDescriptionReport;

    /**
     * Ruft den Wert der deviceDescriptionReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescriptionReport() {
        return deviceDescriptionReport;
    }

    /**
     * Legt den Wert der deviceDescriptionReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescriptionReport(String value) {
        this.deviceDescriptionReport = value;
    }

}
