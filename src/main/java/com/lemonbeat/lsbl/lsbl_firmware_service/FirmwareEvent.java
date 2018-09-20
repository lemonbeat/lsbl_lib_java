//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_firmware_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the events of the firmware_service.
 *             
 * 
 * <p>Java-Klasse für firmware_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="firmware_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_firmware_update_report" type="{urn:com.lemonbeat.lsbl.lsbl_firmware_service}device_firmware_update_report_event"/>
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
@XmlType(name = "firmware_event", propOrder = {
    "deviceFirmwareUpdateReport"
})
public class FirmwareEvent {

    @XmlElement(name = "device_firmware_update_report")
    protected DeviceFirmwareUpdateReportEvent deviceFirmwareUpdateReport;

    /**
     * Ruft den Wert der deviceFirmwareUpdateReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFirmwareUpdateReportEvent }
     *     
     */
    public DeviceFirmwareUpdateReportEvent getDeviceFirmwareUpdateReport() {
        return deviceFirmwareUpdateReport;
    }

    /**
     * Legt den Wert der deviceFirmwareUpdateReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFirmwareUpdateReportEvent }
     *     
     */
    public void setDeviceFirmwareUpdateReport(DeviceFirmwareUpdateReportEvent value) {
        this.deviceFirmwareUpdateReport = value;
    }

}
