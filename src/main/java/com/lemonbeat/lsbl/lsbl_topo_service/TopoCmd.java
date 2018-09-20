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
 *         Definition of the commands of the topo_service.
 *       
 * 
 * <p>Java-Klasse für topo_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="topo_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="forward_to_service" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}forward_to_service"/>
 *           &lt;element name="gw_list_get" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_list_get_request"/>
 *           &lt;element name="gw_description_get" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_description_get_request"/>
 *           &lt;element name="gw_device_list_get" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_device_list_get_request"/>
 *           &lt;element name="gw_network_key_get" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_network_key_get_request"/>
 *           &lt;element name="gw_replacement_init" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_replacement_init_request"/>
 *           &lt;element name="gw_replacement_execute" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_replacement_execute_request"/>
 *           &lt;element name="gw_description_publish" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_description_publish_request"/>
 *           &lt;element name="gw_remove" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}gw_remove_request"/>
 *           &lt;element name="device_description_get" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_description_get_request"/>
 *           &lt;element name="device_include" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_include_request"/>
 *           &lt;element name="device_find" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_find_request"/>
 *           &lt;element name="device_autoinclude_set" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_autoinclude_set_request"/>
 *           &lt;element name="device_autoinclude_delete" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_autoinclude_delete_request"/>
 *           &lt;element name="device_factory_reset" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_factory_reset"/>
 *           &lt;element name="device_remove" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_remove_request"/>
 *           &lt;element name="device_replacement_init" type="{urn:com.lemonbeat.lsbl.lsbl_topo_service}device_replacement_init_request"/>
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
    "forwardToService",
    "gwListGet",
    "gwDescriptionGet",
    "gwDeviceListGet",
    "gwNetworkKeyGet",
    "gwReplacementInit",
    "gwReplacementExecute",
    "gwDescriptionPublish",
    "gwRemove",
    "deviceDescriptionGet",
    "deviceInclude",
    "deviceFind",
    "deviceAutoincludeSet",
    "deviceAutoincludeDelete",
    "deviceFactoryReset",
    "deviceRemove",
    "deviceReplacementInit"
})
public class TopoCmd {

    @XmlElement(name = "forward_to_service")
    protected ForwardToService forwardToService;
    @XmlElement(name = "gw_list_get")
    protected GwListGetRequest gwListGet;
    @XmlElement(name = "gw_description_get")
    protected GwDescriptionGetRequest gwDescriptionGet;
    @XmlElement(name = "gw_device_list_get")
    protected GwDeviceListGetRequest gwDeviceListGet;
    @XmlElement(name = "gw_network_key_get")
    protected GwNetworkKeyGetRequest gwNetworkKeyGet;
    @XmlElement(name = "gw_replacement_init")
    protected GwReplacementInitRequest gwReplacementInit;
    @XmlElement(name = "gw_replacement_execute")
    protected GwReplacementExecuteRequest gwReplacementExecute;
    @XmlElement(name = "gw_description_publish")
    protected GwDescriptionPublishRequest gwDescriptionPublish;
    @XmlElement(name = "gw_remove")
    protected GwRemoveRequest gwRemove;
    @XmlElement(name = "device_description_get")
    protected DeviceDescriptionGetRequest deviceDescriptionGet;
    @XmlElement(name = "device_include")
    protected DeviceIncludeRequest deviceInclude;
    @XmlElement(name = "device_find")
    protected DeviceFindRequest deviceFind;
    @XmlElement(name = "device_autoinclude_set")
    protected DeviceAutoincludeSetRequest deviceAutoincludeSet;
    @XmlElement(name = "device_autoinclude_delete")
    protected DeviceAutoincludeDeleteRequest deviceAutoincludeDelete;
    @XmlElement(name = "device_factory_reset")
    protected DeviceFactoryReset deviceFactoryReset;
    @XmlElement(name = "device_remove")
    protected DeviceRemoveRequest deviceRemove;
    @XmlElement(name = "device_replacement_init")
    protected DeviceReplacementInitRequest deviceReplacementInit;

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
     * Ruft den Wert der gwNetworkKeyGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwNetworkKeyGetRequest }
     *     
     */
    public GwNetworkKeyGetRequest getGwNetworkKeyGet() {
        return gwNetworkKeyGet;
    }

    /**
     * Legt den Wert der gwNetworkKeyGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwNetworkKeyGetRequest }
     *     
     */
    public void setGwNetworkKeyGet(GwNetworkKeyGetRequest value) {
        this.gwNetworkKeyGet = value;
    }

    /**
     * Ruft den Wert der gwReplacementInit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwReplacementInitRequest }
     *     
     */
    public GwReplacementInitRequest getGwReplacementInit() {
        return gwReplacementInit;
    }

    /**
     * Legt den Wert der gwReplacementInit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwReplacementInitRequest }
     *     
     */
    public void setGwReplacementInit(GwReplacementInitRequest value) {
        this.gwReplacementInit = value;
    }

    /**
     * Ruft den Wert der gwReplacementExecute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwReplacementExecuteRequest }
     *     
     */
    public GwReplacementExecuteRequest getGwReplacementExecute() {
        return gwReplacementExecute;
    }

    /**
     * Legt den Wert der gwReplacementExecute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwReplacementExecuteRequest }
     *     
     */
    public void setGwReplacementExecute(GwReplacementExecuteRequest value) {
        this.gwReplacementExecute = value;
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
     * Ruft den Wert der gwRemove-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwRemoveRequest }
     *     
     */
    public GwRemoveRequest getGwRemove() {
        return gwRemove;
    }

    /**
     * Legt den Wert der gwRemove-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwRemoveRequest }
     *     
     */
    public void setGwRemove(GwRemoveRequest value) {
        this.gwRemove = value;
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

    /**
     * Ruft den Wert der deviceRemove-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRemoveRequest }
     *     
     */
    public DeviceRemoveRequest getDeviceRemove() {
        return deviceRemove;
    }

    /**
     * Legt den Wert der deviceRemove-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRemoveRequest }
     *     
     */
    public void setDeviceRemove(DeviceRemoveRequest value) {
        this.deviceRemove = value;
    }

    /**
     * Ruft den Wert der deviceReplacementInit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceReplacementInitRequest }
     *     
     */
    public DeviceReplacementInitRequest getDeviceReplacementInit() {
        return deviceReplacementInit;
    }

    /**
     * Legt den Wert der deviceReplacementInit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceReplacementInitRequest }
     *     
     */
    public void setDeviceReplacementInit(DeviceReplacementInitRequest value) {
        this.deviceReplacementInit = value;
    }

}
