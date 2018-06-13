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
 *                 Definition of the events of the topo_service.
 *             
 * 
 * <p>Java-Klasse f�r topo_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="topo_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_included" type="{urn:lsbl_topo_service}device_included_event"/>
 *           &lt;element name="device_discovered" type="{urn:lsbl_topo_service}device_discovered_event"/>
 *           &lt;element name="device_excluded" type="{urn:lsbl_topo_service}device_discovered_event"/>
 *           &lt;element name="gateway_included" type="{urn:lsbl_topo_service}gateway_included_event"/>
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
@XmlType(name = "topo_event", propOrder = {
    "deviceIncluded",
    "deviceDiscovered",
    "deviceExcluded",
    "gatewayIncluded"
})
public class TopoEvent {

    @XmlElement(name = "device_included")
    protected DeviceIncludedEvent deviceIncluded;
    @XmlElement(name = "device_discovered")
    protected DeviceDiscoveredEvent deviceDiscovered;
    @XmlElement(name = "device_excluded")
    protected DeviceDiscoveredEvent deviceExcluded;
    @XmlElement(name = "gateway_included")
    protected GatewayIncludedEvent gatewayIncluded;

    /**
     * Ruft den Wert der deviceIncluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIncludedEvent }
     *     
     */
    public DeviceIncludedEvent getDeviceIncluded() {
        return deviceIncluded;
    }

    /**
     * Legt den Wert der deviceIncluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIncludedEvent }
     *     
     */
    public void setDeviceIncluded(DeviceIncludedEvent value) {
        this.deviceIncluded = value;
    }

    /**
     * Ruft den Wert der deviceDiscovered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDiscoveredEvent }
     *     
     */
    public DeviceDiscoveredEvent getDeviceDiscovered() {
        return deviceDiscovered;
    }

    /**
     * Legt den Wert der deviceDiscovered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiscoveredEvent }
     *     
     */
    public void setDeviceDiscovered(DeviceDiscoveredEvent value) {
        this.deviceDiscovered = value;
    }

    /**
     * Ruft den Wert der deviceExcluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDiscoveredEvent }
     *     
     */
    public DeviceDiscoveredEvent getDeviceExcluded() {
        return deviceExcluded;
    }

    /**
     * Legt den Wert der deviceExcluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDiscoveredEvent }
     *     
     */
    public void setDeviceExcluded(DeviceDiscoveredEvent value) {
        this.deviceExcluded = value;
    }

    /**
     * Ruft den Wert der gatewayIncluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayIncludedEvent }
     *     
     */
    public GatewayIncludedEvent getGatewayIncluded() {
        return gatewayIncluded;
    }

    /**
     * Legt den Wert der gatewayIncluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayIncludedEvent }
     *     
     */
    public void setGatewayIncluded(GatewayIncludedEvent value) {
        this.gatewayIncluded = value;
    }

}
