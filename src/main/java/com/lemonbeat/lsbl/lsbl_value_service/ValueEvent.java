//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_value_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the events of the value_service.
 *             
 * 
 * <p>Java-Klasse für value_event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="value_event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="device_value_reported" type="{urn:lsbl_value_service}device_value_reported"/>
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
@XmlType(name = "value_event", propOrder = {
    "deviceValueReported"
})
public class ValueEvent {

    @XmlElement(name = "device_value_reported")
    protected DeviceValueReported deviceValueReported;

    /**
     * Ruft den Wert der deviceValueReported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceValueReported }
     *     
     */
    public DeviceValueReported getDeviceValueReported() {
        return deviceValueReported;
    }

    /**
     * Legt den Wert der deviceValueReported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceValueReported }
     *     
     */
    public void setDeviceValueReported(DeviceValueReported value) {
        this.deviceValueReported = value;
    }

}
