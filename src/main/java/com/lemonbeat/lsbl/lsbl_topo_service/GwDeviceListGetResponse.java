//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message with a list of all devices included by the gateway.
 *       
 * 
 * <p>Java-Klasse für gw_device_list_get_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gw_device_list_get_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_list" type="{urn:lsbl_topo_service}device_list"/>
 *         &lt;element name="unincluded_device_list" type="{urn:lsbl_topo_service}device_list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gw_device_list_get_response", propOrder = {
    "deviceList",
    "unincludedDeviceList"
})
public class GwDeviceListGetResponse {

    @XmlElement(name = "device_list", required = true)
    protected DeviceList deviceList;
    @XmlElement(name = "unincluded_device_list", required = true)
    protected DeviceList unincludedDeviceList;

    /**
     * Ruft den Wert der deviceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Legt den Wert der deviceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

    /**
     * Ruft den Wert der unincludedDeviceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getUnincludedDeviceList() {
        return unincludedDeviceList;
    }

    /**
     * Legt den Wert der unincludedDeviceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setUnincludedDeviceList(DeviceList value) {
        this.unincludedDeviceList = value;
    }

}
