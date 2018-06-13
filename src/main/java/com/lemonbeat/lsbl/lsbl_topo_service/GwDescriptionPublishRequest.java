//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A fire and forget message from the gateway to store in the topo service datastore.
 *             
 * 
 * <p>Java-Klasse f�r gw_description_publish_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gw_description_publish_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gateway_description_report" type="{urn:lsbl_topo_service}gateway_description"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gw_description_publish_request", propOrder = {
    "gatewayDescriptionReport"
})
public class GwDescriptionPublishRequest {

    @XmlElement(name = "gateway_description_report", required = true)
    protected GatewayDescription gatewayDescriptionReport;

    /**
     * Ruft den Wert der gatewayDescriptionReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayDescription }
     *     
     */
    public GatewayDescription getGatewayDescriptionReport() {
        return gatewayDescriptionReport;
    }

    /**
     * Legt den Wert der gatewayDescriptionReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayDescription }
     *     
     */
    public void setGatewayDescriptionReport(GatewayDescription value) {
        this.gatewayDescriptionReport = value;
    }

}
