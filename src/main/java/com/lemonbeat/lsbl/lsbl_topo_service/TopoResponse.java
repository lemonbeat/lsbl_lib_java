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
 *         Definition of the responses of the topo_service.
 *       
 * 
 * <p>Java-Klasse für topo_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="topo_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="gw_list_get" type="{urn:lsbl_topo_service}gw_list_get_response"/>
 *           &lt;element name="gw_description_get" type="{urn:lsbl_topo_service}gateway_description"/>
 *           &lt;element name="gw_device_list_get" type="{urn:lsbl_topo_service}gw_device_list_get_response"/>
 *           &lt;element name="gw_network_key_get" type="{urn:lsbl_topo_service}gw_network_key_get_response"/>
 *           &lt;element name="device_description_get" type="{urn:lsbl_topo_service}device_description_get_response"/>
 *           &lt;element name="device_find" type="{urn:lsbl_topo_service}device_find_response"/>
 *           &lt;element name="device_autoinclude_report" type="{urn:lsbl_topo_service}device_autoinclude_report"/>
 *           &lt;element name="device_description_report" type="{urn:lsbl_topo_service}device_description_report_response"/>
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
@XmlType(name = "topo_response", propOrder = {
    "gwListGet",
    "gwDescriptionGet",
    "gwDeviceListGet",
    "gwNetworkKeyGet",
    "deviceDescriptionGet",
    "deviceFind",
    "deviceAutoincludeReport",
    "deviceDescriptionReport"
})
public class TopoResponse {

    @XmlElement(name = "gw_list_get")
    protected GwListGetResponse gwListGet;
    @XmlElement(name = "gw_description_get")
    protected GatewayDescription gwDescriptionGet;
    @XmlElement(name = "gw_device_list_get")
    protected GwDeviceListGetResponse gwDeviceListGet;
    @XmlElement(name = "gw_network_key_get")
    protected GwNetworkKeyGetResponse gwNetworkKeyGet;
    @XmlElement(name = "device_description_get")
    protected DeviceDescriptionGetResponse deviceDescriptionGet;
    @XmlElement(name = "device_find")
    protected DeviceFindResponse deviceFind;
    @XmlElement(name = "device_autoinclude_report")
    protected DeviceAutoincludeReport deviceAutoincludeReport;
    @XmlElement(name = "device_description_report")
    protected DeviceDescriptionReportResponse deviceDescriptionReport;

    /**
     * Ruft den Wert der gwListGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwListGetResponse }
     *     
     */
    public GwListGetResponse getGwListGet() {
        return gwListGet;
    }

    /**
     * Legt den Wert der gwListGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwListGetResponse }
     *     
     */
    public void setGwListGet(GwListGetResponse value) {
        this.gwListGet = value;
    }

    /**
     * Ruft den Wert der gwDescriptionGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GatewayDescription }
     *     
     */
    public GatewayDescription getGwDescriptionGet() {
        return gwDescriptionGet;
    }

    /**
     * Legt den Wert der gwDescriptionGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayDescription }
     *     
     */
    public void setGwDescriptionGet(GatewayDescription value) {
        this.gwDescriptionGet = value;
    }

    /**
     * Ruft den Wert der gwDeviceListGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwDeviceListGetResponse }
     *     
     */
    public GwDeviceListGetResponse getGwDeviceListGet() {
        return gwDeviceListGet;
    }

    /**
     * Legt den Wert der gwDeviceListGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwDeviceListGetResponse }
     *     
     */
    public void setGwDeviceListGet(GwDeviceListGetResponse value) {
        this.gwDeviceListGet = value;
    }

    /**
     * Ruft den Wert der gwNetworkKeyGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwNetworkKeyGetResponse }
     *     
     */
    public GwNetworkKeyGetResponse getGwNetworkKeyGet() {
        return gwNetworkKeyGet;
    }

    /**
     * Legt den Wert der gwNetworkKeyGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwNetworkKeyGetResponse }
     *     
     */
    public void setGwNetworkKeyGet(GwNetworkKeyGetResponse value) {
        this.gwNetworkKeyGet = value;
    }

    /**
     * Ruft den Wert der deviceDescriptionGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDescriptionGetResponse }
     *     
     */
    public DeviceDescriptionGetResponse getDeviceDescriptionGet() {
        return deviceDescriptionGet;
    }

    /**
     * Legt den Wert der deviceDescriptionGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDescriptionGetResponse }
     *     
     */
    public void setDeviceDescriptionGet(DeviceDescriptionGetResponse value) {
        this.deviceDescriptionGet = value;
    }

    /**
     * Ruft den Wert der deviceFind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFindResponse }
     *     
     */
    public DeviceFindResponse getDeviceFind() {
        return deviceFind;
    }

    /**
     * Legt den Wert der deviceFind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFindResponse }
     *     
     */
    public void setDeviceFind(DeviceFindResponse value) {
        this.deviceFind = value;
    }

    /**
     * Ruft den Wert der deviceAutoincludeReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAutoincludeReport }
     *     
     */
    public DeviceAutoincludeReport getDeviceAutoincludeReport() {
        return deviceAutoincludeReport;
    }

    /**
     * Legt den Wert der deviceAutoincludeReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAutoincludeReport }
     *     
     */
    public void setDeviceAutoincludeReport(DeviceAutoincludeReport value) {
        this.deviceAutoincludeReport = value;
    }

    /**
     * Ruft den Wert der deviceDescriptionReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDescriptionReportResponse }
     *     
     */
    public DeviceDescriptionReportResponse getDeviceDescriptionReport() {
        return deviceDescriptionReport;
    }

    /**
     * Legt den Wert der deviceDescriptionReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDescriptionReportResponse }
     *     
     */
    public void setDeviceDescriptionReport(DeviceDescriptionReportResponse value) {
        this.deviceDescriptionReport = value;
    }

}
