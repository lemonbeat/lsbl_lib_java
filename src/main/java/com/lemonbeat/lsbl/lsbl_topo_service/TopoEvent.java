//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of the events of the topo_service.
 *       
 * 
 * <p>Java-Klasse für topo_event complex type.
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
 *           &lt;element name="device_excluded" type="{urn:lsbl_topo_service}device_excluded_event"/>
 *           &lt;element name="device_replacement_initialized" type="{urn:lsbl_topo_service}device_replacement_initialized_event"/>
 *           &lt;element name="device_removed" type="{urn:lsbl_topo_service}device_removed_event"/>
 *           &lt;element name="gateway_included" type="{urn:lsbl_topo_service}gateway_included_event"/>
 *           &lt;element name="gateway_replacement_initialized" type="{urn:lsbl_topo_service}gateway_replacement_initialized_event"/>
 *           &lt;element name="gateway_replacement_executed" type="{urn:lsbl_topo_service}gateway_replacement_executed_event"/>
 *           &lt;element name="gateway_removed" type="{urn:lsbl_topo_service}gateway_removed_event"/>
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
    "deviceReplacementInitialized",
    "deviceRemoved",
    "gatewayIncluded",
    "gatewayReplacementInitialized",
    "gatewayReplacementExecuted",
    "gatewayRemoved"
})
public class TopoEvent {

    @XmlElement(name = "device_included")
    protected DeviceIncludedEvent deviceIncluded;
    @XmlElement(name = "device_discovered")
    protected DeviceDiscoveredEvent deviceDiscovered;
    @XmlElement(name = "device_excluded")
    protected DeviceExcludedEvent deviceExcluded;
    @XmlElement(name = "device_replacement_initialized")
    protected DeviceReplacementInitializedEvent deviceReplacementInitialized;
    @XmlElement(name = "device_removed")
    protected DeviceRemovedEvent deviceRemoved;
    @XmlElement(name = "gateway_included")
    protected GatewayIncludedEvent gatewayIncluded;
    @XmlElement(name = "gateway_replacement_initialized")
    protected GatewayReplacementInitializedEvent gatewayReplacementInitialized;
    @XmlElement(name = "gateway_replacement_executed")
    protected GatewayReplacementExecutedEvent gatewayReplacementExecuted;
    @XmlElement(name = "gateway_removed")
    protected GatewayRemovedEvent gatewayRemoved;

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
     *     {@link DeviceExcludedEvent }
     *     
     */
    public DeviceExcludedEvent getDeviceExcluded() {
        return deviceExcluded;
    }

    /**
     * Legt den Wert der deviceExcluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceExcludedEvent }
     *     
     */
    public void setDeviceExcluded(DeviceExcludedEvent value) {
        this.deviceExcluded = value;
    }

    /**
     * Ruft den Wert der deviceReplacementInitialized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceReplacementInitializedEvent }
     *     
     */
    public DeviceReplacementInitializedEvent getDeviceReplacementInitialized() {
        return deviceReplacementInitialized;
    }

    /**
     * Legt den Wert der deviceReplacementInitialized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceReplacementInitializedEvent }
     *     
     */
    public void setDeviceReplacementInitialized(DeviceReplacementInitializedEvent value) {
        this.deviceReplacementInitialized = value;
    }

    /**
     * Ruft den Wert der deviceRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRemovedEvent }
     *     
     */
    public DeviceRemovedEvent getDeviceRemoved() {
        return deviceRemoved;
    }

    /**
     * Legt den Wert der deviceRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRemovedEvent }
     *     
     */
    public void setDeviceRemoved(DeviceRemovedEvent value) {
        this.deviceRemoved = value;
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

    /**
     * Ruft den Wert der gatewayReplacementInitialized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayReplacementInitializedEvent }
     *     
     */
    public GatewayReplacementInitializedEvent getGatewayReplacementInitialized() {
        return gatewayReplacementInitialized;
    }

    /**
     * Legt den Wert der gatewayReplacementInitialized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayReplacementInitializedEvent }
     *     
     */
    public void setGatewayReplacementInitialized(GatewayReplacementInitializedEvent value) {
        this.gatewayReplacementInitialized = value;
    }

    /**
     * Ruft den Wert der gatewayReplacementExecuted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayReplacementExecutedEvent }
     *     
     */
    public GatewayReplacementExecutedEvent getGatewayReplacementExecuted() {
        return gatewayReplacementExecuted;
    }

    /**
     * Legt den Wert der gatewayReplacementExecuted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayReplacementExecutedEvent }
     *     
     */
    public void setGatewayReplacementExecuted(GatewayReplacementExecutedEvent value) {
        this.gatewayReplacementExecuted = value;
    }

    /**
     * Ruft den Wert der gatewayRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayRemovedEvent }
     *     
     */
    public GatewayRemovedEvent getGatewayRemoved() {
        return gatewayRemoved;
    }

    /**
     * Legt den Wert der gatewayRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayRemovedEvent }
     *     
     */
    public void setGatewayRemoved(GatewayRemovedEvent value) {
        this.gatewayRemoved = value;
    }

}
