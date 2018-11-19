//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_inclusion_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the commands of the inclusion_service.
 *             
 * 
 * <p>Java-Klasse für inclusion_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="inclusion_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="lsdl_device_include" type="{urn:lsbl_inclusion_service}lsdl_device_include_request"/>
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
@XmlType(name = "inclusion_cmd", propOrder = {
    "lsdlDeviceInclude"
})
public class InclusionCmd {

    @XmlElement(name = "lsdl_device_include")
    protected LsdlDeviceIncludeRequest lsdlDeviceInclude;

    /**
     * Ruft den Wert der lsdlDeviceInclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LsdlDeviceIncludeRequest }
     *     
     */
    public LsdlDeviceIncludeRequest getLsdlDeviceInclude() {
        return lsdlDeviceInclude;
    }

    /**
     * Legt den Wert der lsdlDeviceInclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LsdlDeviceIncludeRequest }
     *     
     */
    public void setLsdlDeviceInclude(LsdlDeviceIncludeRequest value) {
        this.lsdlDeviceInclude = value;
    }

}
