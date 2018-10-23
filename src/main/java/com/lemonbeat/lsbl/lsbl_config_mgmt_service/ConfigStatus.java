//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_config_mgmt_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für config_status.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="config_status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "config_status")
@XmlEnum
public enum ConfigStatus {


    /**
     * 
     *                         The configuration is ok.
     *                     
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * 
     *                         The configuration is still pending.
     *                     
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending"),

    /**
     * 
     *                         There is an error on the configuration.
     *                     
     * 
     */
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    ConfigStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigStatus fromValue(String v) {
        for (ConfigStatus c: ConfigStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
