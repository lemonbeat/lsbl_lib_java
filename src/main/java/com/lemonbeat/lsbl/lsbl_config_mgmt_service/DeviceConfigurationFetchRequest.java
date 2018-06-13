//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This command fetches the configuration directly from the device.
 *                 The minimal request contains only the device_sgtin,
 *                 in this case the config_mgmt_service will use the find_device command of the topo_service to find the device.
 *                 Optionally you can fetch specific services configurations by specifing the services node.
 *             
 * 
 * <p>Java-Klasse f�r device_configuration_fetch_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_configuration_fetch_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="gw_sgtin" type="{urn:lsbl_common_base_types}sgtin_96" minOccurs="0"/>
 *         &lt;element name="mac" type="{urn:lsbl_common_base_types}mac" minOccurs="0"/>
 *         &lt;element name="send_response" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="radio_mode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="service_ids" type="{urn:lsbl_config_mgmt_service}service_id_list" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device_configuration_fetch_request", propOrder = {
    "deviceSgtin",
    "gwSgtin",
    "mac",
    "sendResponse",
    "radioMode",
    "serviceIds"
})
public class DeviceConfigurationFetchRequest {

    @XmlElement(name = "device_sgtin", required = true)
    protected String deviceSgtin;
    @XmlElement(name = "gw_sgtin")
    protected String gwSgtin;
    protected String mac;
    @XmlElement(name = "send_response")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sendResponse;
    @XmlElement(name = "radio_mode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long radioMode;
    @XmlElement(name = "service_ids")
    protected ServiceIdList serviceIds;

    /**
     * Ruft den Wert der deviceSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSgtin() {
        return deviceSgtin;
    }

    /**
     * Legt den Wert der deviceSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSgtin(String value) {
        this.deviceSgtin = value;
    }

    /**
     * Ruft den Wert der gwSgtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwSgtin() {
        return gwSgtin;
    }

    /**
     * Legt den Wert der gwSgtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwSgtin(String value) {
        this.gwSgtin = value;
    }

    /**
     * Ruft den Wert der mac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Legt den Wert der mac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Ruft den Wert der sendResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendResponse() {
        return sendResponse;
    }

    /**
     * Legt den Wert der sendResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendResponse(Long value) {
        this.sendResponse = value;
    }

    /**
     * Ruft den Wert der radioMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRadioMode() {
        return radioMode;
    }

    /**
     * Legt den Wert der radioMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRadioMode(Long value) {
        this.radioMode = value;
    }

    /**
     * Ruft den Wert der serviceIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdList }
     *     
     */
    public ServiceIdList getServiceIds() {
        return serviceIds;
    }

    /**
     * Legt den Wert der serviceIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdList }
     *     
     */
    public void setServiceIds(ServiceIdList value) {
        this.serviceIds = value;
    }

}
