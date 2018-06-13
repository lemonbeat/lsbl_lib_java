//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_metadata_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the events of the metadata_service.
 *             
 * 
 * <p>Java-Klasse f�r metadata_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="metadata_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="metadata_device_included" type="{urn:lsbl_metadata_service}metadata_device_included_event"/>
 *           &lt;element name="metadata_gateway_included" type="{urn:lsbl_metadata_service}metadata_gateway_included_event"/>
 *           &lt;element name="metadata_device_value_reported" type="{urn:lsbl_metadata_service}metadata_device_value_reported"/>
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
@XmlType(name = "metadata_event", propOrder = {
    "metadataDeviceIncluded",
    "metadataGatewayIncluded",
    "metadataDeviceValueReported"
})
public class MetadataEvent {

    @XmlElement(name = "metadata_device_included")
    protected MetadataDeviceIncludedEvent metadataDeviceIncluded;
    @XmlElement(name = "metadata_gateway_included")
    protected MetadataGatewayIncludedEvent metadataGatewayIncluded;
    @XmlElement(name = "metadata_device_value_reported")
    protected MetadataDeviceValueReported metadataDeviceValueReported;

    /**
     * Ruft den Wert der metadataDeviceIncluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceIncludedEvent }
     *     
     */
    public MetadataDeviceIncludedEvent getMetadataDeviceIncluded() {
        return metadataDeviceIncluded;
    }

    /**
     * Legt den Wert der metadataDeviceIncluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceIncludedEvent }
     *     
     */
    public void setMetadataDeviceIncluded(MetadataDeviceIncludedEvent value) {
        this.metadataDeviceIncluded = value;
    }

    /**
     * Ruft den Wert der metadataGatewayIncluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataGatewayIncludedEvent }
     *     
     */
    public MetadataGatewayIncludedEvent getMetadataGatewayIncluded() {
        return metadataGatewayIncluded;
    }

    /**
     * Legt den Wert der metadataGatewayIncluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataGatewayIncludedEvent }
     *     
     */
    public void setMetadataGatewayIncluded(MetadataGatewayIncludedEvent value) {
        this.metadataGatewayIncluded = value;
    }

    /**
     * Ruft den Wert der metadataDeviceValueReported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceValueReported }
     *     
     */
    public MetadataDeviceValueReported getMetadataDeviceValueReported() {
        return metadataDeviceValueReported;
    }

    /**
     * Legt den Wert der metadataDeviceValueReported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceValueReported }
     *     
     */
    public void setMetadataDeviceValueReported(MetadataDeviceValueReported value) {
        this.metadataDeviceValueReported = value;
    }

}
