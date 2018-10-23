//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_firmware_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für firmware_type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="firmware_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="application"/>
 *     &lt;enumeration value="application_and_os"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "firmware_type")
@XmlEnum
public enum FirmwareType {


    /**
     * 
     *                         The firmware is for the application.
     *                     
     * 
     */
    @XmlEnumValue("application")
    APPLICATION("application"),

    /**
     * 
     *                         The firmware is for the application and the Lemonbeat OS.
     *                     
     * 
     */
    @XmlEnumValue("application_and_os")
    APPLICATION_AND_OS("application_and_os"),

    /**
     * 
     *                         The firmware is for the application and the Lemonbeat OS, and bootloader.
     *                     
     * 
     */
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    FirmwareType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirmwareType fromValue(String v) {
        for (FirmwareType c: FirmwareType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
