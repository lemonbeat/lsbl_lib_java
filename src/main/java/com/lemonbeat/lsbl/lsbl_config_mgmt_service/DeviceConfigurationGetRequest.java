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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The RequestDeviceConfigurationGet payload is used by other services to request the device configuration stored in the data store.
 *             
 * 
 * <p>Java-Klasse f�r device_configuration_get_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="device_configuration_get_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96" minOccurs="0"/>
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
@XmlType(name = "device_configuration_get_request", propOrder = {
    "deviceSgtin",
    "serviceIds"
})
public class DeviceConfigurationGetRequest {

    @XmlElement(name = "device_sgtin")
    protected String deviceSgtin;
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
