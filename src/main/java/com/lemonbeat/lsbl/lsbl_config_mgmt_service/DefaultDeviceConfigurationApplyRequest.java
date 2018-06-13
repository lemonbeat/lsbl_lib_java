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
 *                 The command requests the Config Management Service to match a default configuration against the given metadata.
 *             
 * 
 * <p>Java-Klasse f�r default_device_configuration_apply_request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="default_device_configuration_apply_request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_sgtin" type="{urn:lsbl_common_base_types}sgtin_96" minOccurs="0"/>
 *         &lt;element name="sgtin_gw" type="{urn:lsbl_common_base_types}sgtin_96"/>
 *         &lt;element name="metadata_report" type="{urn:lsbl_config_mgmt_service}metadata_report"/>
 *         &lt;element name="lsdl" type="{urn:lsbl_common_base_types}lsdl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default_device_configuration_apply_request", propOrder = {
    "deviceSgtin",
    "sgtinGw",
    "metadataReport",
    "lsdl"
})
public class DefaultDeviceConfigurationApplyRequest {

    @XmlElement(name = "device_sgtin")
    protected String deviceSgtin;
    @XmlElement(name = "sgtin_gw", required = true)
    protected String sgtinGw;
    @XmlElement(name = "metadata_report", required = true)
    protected MetadataReport metadataReport;
    @XmlElement(required = true)
    protected String lsdl;

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
     * Ruft den Wert der sgtinGw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtinGw() {
        return sgtinGw;
    }

    /**
     * Legt den Wert der sgtinGw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtinGw(String value) {
        this.sgtinGw = value;
    }

    /**
     * Ruft den Wert der metadataReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataReport }
     *     
     */
    public MetadataReport getMetadataReport() {
        return metadataReport;
    }

    /**
     * Legt den Wert der metadataReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataReport }
     *     
     */
    public void setMetadataReport(MetadataReport value) {
        this.metadataReport = value;
    }

    /**
     * Ruft den Wert der lsdl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsdl() {
        return lsdl;
    }

    /**
     * Legt den Wert der lsdl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsdl(String value) {
        this.lsdl = value;
    }

}
