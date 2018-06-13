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
 *                 Definition of the commands of the topo_service.
 *             
 * 
 * <p>Java-Klasse f�r topo_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="topo_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="gw_list_get" type="{urn:lsbl_topo_service}gw_list_get_request"/>
 *           &lt;element name="gw_description_get" type="{urn:lsbl_topo_service}gw_description_get_request"/>
 *           &lt;element name="gw_device_list_get" type="{urn:lsbl_topo_service}gw_device_list_get_request"/>
 *           &lt;element name="gw_description_publish" type="{urn:lsbl_topo_service}gw_description_publish_request"/>
 *           &lt;element name="device_description_get" type="{urn:lsbl_topo_service}device_description_get_request"/>
 *           &lt;element name="device_include" type="{urn:lsbl_topo_service}device_include_request"/>
 *           &lt;element name="device_find" type="{urn:lsbl_topo_service}device_find_request"/>
 *           &lt;element name="forward_to_service" type="{urn:lsbl_topo_service}forward_to_service"/>
 *           &lt;element name="device_autoinclude_set" type="{urn:lsbl_topo_service}device_autoinclude_set_request"/>
 *           &lt;element name="device_autoinclude_delete" type="{urn:lsbl_topo_service}device_autoinclude_delete_request"/>
 *           &lt;element name="device_factory_reset" type="{urn:lsbl_topo_service}device_factory_reset"/>
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
@XmlType(name = "topo_cmd", propOrder = {
    "gwListGet",
    "gwDescriptionGet",
    "gwDeviceListGet",
    "gwDescriptionPublish",
    "deviceDescriptionGet",
    "deviceInclude",
    "deviceFind",
    "forwardToService",
    "deviceAutoincludeSet",
    "deviceAutoincludeDelete",
    "deviceFactoryReset"
})
public class TopoCmd {

    @XmlElement(name = "gw_list_get")
    protected GwListGetRequest gwListGet;
    @XmlElement(name = "gw_description_get")
    protected GwDescriptionGetRequest gwDescriptionGet;
    @XmlElement(name = "gw_device_list_get")
    protected GwDeviceListGetRequest gwDeviceListGet;
    @XmlElement(name = "gw_description_publish")
    protected GwDescriptionPublishRequest gwDescriptionPublish;
    @XmlElement(name = "device_description_get")
    protected DeviceDescriptionGetRequest deviceDescriptionGet;
    @XmlElement(name = "device_include")
    protected DeviceIncludeRequest deviceInclude;
    @XmlElement(name = "device_find")
    protected DeviceFindRequest deviceFind;
    @XmlElement(name = "forward_to_service")
    protected ForwardToService forwardToService;
    @XmlElement(name = "device_autoinclude_set")
    protected DeviceAutoincludeSetRequest deviceAutoincludeSet;
    @XmlElement(name = "device_autoinclude_delete")
    protected DeviceAutoincludeDeleteRequest deviceAutoincludeDelete;
    @XmlElement(name = "device_factory_reset")
    protected DeviceFactoryReset deviceFactoryReset;

    /**
     * Ruft den Wert der gwListGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwListGetRequest }
     *     
     */
    public GwListGetRequest getGwListGet() {
        return gwListGet;
    }

    /**
     * Legt den Wert der gwListGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwListGetRequest }
     *     
     */
    public void setGwListGet(GwListGetRequest value) {
        this.gwListGet = value;
    }

    /**
     * Ruft den Wert der gwDescriptionGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwDescriptionGetRequest }
     *     
     */
    public GwDescriptionGetRequest getGwDescriptionGet() {
        return gwDescriptionGet;
    }

    /**
     * Legt den Wert der gwDescriptionGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwDescriptionGetRequest }
     *     
     */
    public void setGwDescriptionGet(GwDescriptionGetRequest value) {
        this.gwDescriptionGet = value;
    }

    /**
     * Ruft den Wert der gwDeviceListGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwDeviceListGetRequest }
     *     
     */
    public GwDeviceListGetRequest getGwDeviceListGet() {
        return gwDeviceListGet;
    }

    /**
     * Legt den Wert der gwDeviceListGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwDeviceListGetRequest }
     *     
     */
    public void setGwDeviceListGet(GwDeviceListGetRequest value) {
        this.gwDeviceListGet = value;
    }

    /**
     * Ruft den Wert der gwDescriptionPublish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwDescriptionPublishRequest }
     *     
     */
    public GwDescriptionPublishRequest getGwDescriptionPublish() {
        return gwDescriptionPublish;
    }

    /**
     * Legt den Wert der gwDescriptionPublish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwDescriptionPublishRequest }
     *     
     */
    public void setGwDescriptionPublish(GwDescriptionPublishRequest value) {
        this.gwDescriptionPublish = value;
    }

    /**
     * Ruft den Wert der deviceDescriptionGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDescriptionGetRequest }
     *     
     */
    public DeviceDescriptionGetRequest getDeviceDescriptionGet() {
        return deviceDescriptionGet;
    }

    /**
     * Legt den Wert der deviceDescriptionGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDescriptionGetRequest }
     *     
     */
    public void setDeviceDescriptionGet(DeviceDescriptionGetRequest value) {
        this.deviceDescriptionGet = value;
    }

    /**
     * Ruft den Wert der deviceInclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIncludeRequest }
     *     
     */
    public DeviceIncludeRequest getDeviceInclude() {
        return deviceInclude;
    }

    /**
     * Legt den Wert der deviceInclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIncludeRequest }
     *     
     */
    public void setDeviceInclude(DeviceIncludeRequest value) {
        this.deviceInclude = value;
    }

    /**
     * Ruft den Wert der deviceFind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFindRequest }
     *     
     */
    public DeviceFindRequest getDeviceFind() {
        return deviceFind;
    }

    /**
     * Legt den Wert der deviceFind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFindRequest }
     *     
     */
    public void setDeviceFind(DeviceFindRequest value) {
        this.deviceFind = value;
    }

    /**
     * Ruft den Wert der forwardToService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ForwardToService }
     *     
     */
    public ForwardToService getForwardToService() {
        return forwardToService;
    }

    /**
     * Legt den Wert der forwardToService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardToService }
     *     
     */
    public void setForwardToService(ForwardToService value) {
        this.forwardToService = value;
    }

    /**
     * Ruft den Wert der deviceAutoincludeSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAutoincludeSetRequest }
     *     
     */
    public DeviceAutoincludeSetRequest getDeviceAutoincludeSet() {
        return deviceAutoincludeSet;
    }

    /**
     * Legt den Wert der deviceAutoincludeSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAutoincludeSetRequest }
     *     
     */
    public void setDeviceAutoincludeSet(DeviceAutoincludeSetRequest value) {
        this.deviceAutoincludeSet = value;
    }

    /**
     * Ruft den Wert der deviceAutoincludeDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAutoincludeDeleteRequest }
     *     
     */
    public DeviceAutoincludeDeleteRequest getDeviceAutoincludeDelete() {
        return deviceAutoincludeDelete;
    }

    /**
     * Legt den Wert der deviceAutoincludeDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAutoincludeDeleteRequest }
     *     
     */
    public void setDeviceAutoincludeDelete(DeviceAutoincludeDeleteRequest value) {
        this.deviceAutoincludeDelete = value;
    }

    /**
     * Ruft den Wert der deviceFactoryReset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFactoryReset }
     *     
     */
    public DeviceFactoryReset getDeviceFactoryReset() {
        return deviceFactoryReset;
    }

    /**
     * Legt den Wert der deviceFactoryReset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFactoryReset }
     *     
     */
    public void setDeviceFactoryReset(DeviceFactoryReset value) {
        this.deviceFactoryReset = value;
    }

}
