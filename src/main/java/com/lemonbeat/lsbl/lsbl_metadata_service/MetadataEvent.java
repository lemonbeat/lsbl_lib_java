//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
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
 * <p>Java-Klasse für metadata_event complex type.
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
 *           &lt;element name="metadata_device_excluded" type="{urn:lsbl_metadata_service}metadata_device_excluded_event"/>
 *           &lt;element name="metadata_gateway_included" type="{urn:lsbl_metadata_service}metadata_gateway_included_event"/>
 *           &lt;element name="metadata_device_value_reported" type="{urn:lsbl_metadata_service}metadata_device_value_reported"/>
 *           &lt;element name="metadata_gateway_removed" type="{urn:lsbl_metadata_service}metadata_gateway_removed_event"/>
 *           &lt;element name="metadata_device_removed" type="{urn:lsbl_metadata_service}metadata_device_removed_event"/>
 *           &lt;element name="metadata_device_config_fetched" type="{urn:lsbl_metadata_service}metadata_device_config_fetched_event"/>
 *           &lt;element name="metadata_device_config_written" type="{urn:lsbl_metadata_service}metadata_device_config_written_event"/>
 *           &lt;element name="metadata_device_config_error" type="{urn:lsbl_metadata_service}metadata_device_config_error_event"/>
 *           &lt;element name="metadata_status_reported" type="{urn:lsbl_metadata_service}metadata_status_reported_event"/>
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
    "metadataDeviceExcluded",
    "metadataGatewayIncluded",
    "metadataDeviceValueReported",
    "metadataGatewayRemoved",
    "metadataDeviceRemoved",
    "metadataDeviceConfigFetched",
    "metadataDeviceConfigWritten",
    "metadataDeviceConfigError",
    "metadataStatusReported"
})
public class MetadataEvent {

    @XmlElement(name = "metadata_device_included")
    protected MetadataDeviceIncludedEvent metadataDeviceIncluded;
    @XmlElement(name = "metadata_device_excluded")
    protected MetadataDeviceExcludedEvent metadataDeviceExcluded;
    @XmlElement(name = "metadata_gateway_included")
    protected MetadataGatewayIncludedEvent metadataGatewayIncluded;
    @XmlElement(name = "metadata_device_value_reported")
    protected MetadataDeviceValueReported metadataDeviceValueReported;
    @XmlElement(name = "metadata_gateway_removed")
    protected MetadataGatewayRemovedEvent metadataGatewayRemoved;
    @XmlElement(name = "metadata_device_removed")
    protected MetadataDeviceRemovedEvent metadataDeviceRemoved;
    @XmlElement(name = "metadata_device_config_fetched")
    protected MetadataDeviceConfigFetchedEvent metadataDeviceConfigFetched;
    @XmlElement(name = "metadata_device_config_written")
    protected MetadataDeviceConfigWrittenEvent metadataDeviceConfigWritten;
    @XmlElement(name = "metadata_device_config_error")
    protected MetadataDeviceConfigErrorEvent metadataDeviceConfigError;
    @XmlElement(name = "metadata_status_reported")
    protected MetadataStatusReportedEvent metadataStatusReported;

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
     * Ruft den Wert der metadataDeviceExcluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceExcludedEvent }
     *     
     */
    public MetadataDeviceExcludedEvent getMetadataDeviceExcluded() {
        return metadataDeviceExcluded;
    }

    /**
     * Legt den Wert der metadataDeviceExcluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceExcludedEvent }
     *     
     */
    public void setMetadataDeviceExcluded(MetadataDeviceExcludedEvent value) {
        this.metadataDeviceExcluded = value;
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

    /**
     * Ruft den Wert der metadataGatewayRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataGatewayRemovedEvent }
     *     
     */
    public MetadataGatewayRemovedEvent getMetadataGatewayRemoved() {
        return metadataGatewayRemoved;
    }

    /**
     * Legt den Wert der metadataGatewayRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataGatewayRemovedEvent }
     *     
     */
    public void setMetadataGatewayRemoved(MetadataGatewayRemovedEvent value) {
        this.metadataGatewayRemoved = value;
    }

    /**
     * Ruft den Wert der metadataDeviceRemoved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceRemovedEvent }
     *     
     */
    public MetadataDeviceRemovedEvent getMetadataDeviceRemoved() {
        return metadataDeviceRemoved;
    }

    /**
     * Legt den Wert der metadataDeviceRemoved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceRemovedEvent }
     *     
     */
    public void setMetadataDeviceRemoved(MetadataDeviceRemovedEvent value) {
        this.metadataDeviceRemoved = value;
    }

    /**
     * Ruft den Wert der metadataDeviceConfigFetched-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceConfigFetchedEvent }
     *     
     */
    public MetadataDeviceConfigFetchedEvent getMetadataDeviceConfigFetched() {
        return metadataDeviceConfigFetched;
    }

    /**
     * Legt den Wert der metadataDeviceConfigFetched-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceConfigFetchedEvent }
     *     
     */
    public void setMetadataDeviceConfigFetched(MetadataDeviceConfigFetchedEvent value) {
        this.metadataDeviceConfigFetched = value;
    }

    /**
     * Ruft den Wert der metadataDeviceConfigWritten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceConfigWrittenEvent }
     *     
     */
    public MetadataDeviceConfigWrittenEvent getMetadataDeviceConfigWritten() {
        return metadataDeviceConfigWritten;
    }

    /**
     * Legt den Wert der metadataDeviceConfigWritten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceConfigWrittenEvent }
     *     
     */
    public void setMetadataDeviceConfigWritten(MetadataDeviceConfigWrittenEvent value) {
        this.metadataDeviceConfigWritten = value;
    }

    /**
     * Ruft den Wert der metadataDeviceConfigError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceConfigErrorEvent }
     *     
     */
    public MetadataDeviceConfigErrorEvent getMetadataDeviceConfigError() {
        return metadataDeviceConfigError;
    }

    /**
     * Legt den Wert der metadataDeviceConfigError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceConfigErrorEvent }
     *     
     */
    public void setMetadataDeviceConfigError(MetadataDeviceConfigErrorEvent value) {
        this.metadataDeviceConfigError = value;
    }

    /**
     * Ruft den Wert der metadataStatusReported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataStatusReportedEvent }
     *     
     */
    public MetadataStatusReportedEvent getMetadataStatusReported() {
        return metadataStatusReported;
    }

    /**
     * Legt den Wert der metadataStatusReported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataStatusReportedEvent }
     *     
     */
    public void setMetadataStatusReported(MetadataStatusReportedEvent value) {
        this.metadataStatusReported = value;
    }

}
