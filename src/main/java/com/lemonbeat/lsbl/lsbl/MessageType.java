//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für message_type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="message_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LSBL_Request"/>
 *     &lt;enumeration value="LSBL_Response"/>
 *     &lt;enumeration value="LSBL_Event"/>
 *     &lt;enumeration value="LSBL_APP_ACK"/>
 *     &lt;enumeration value="LSBL_APP_NACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "message_type")
@XmlEnum
public enum MessageType {


    /**
     * 
     *                         The LsBL message is a request.
     *                     
     * 
     */
    @XmlEnumValue("LSBL_Request")
    LSBL_REQUEST("LSBL_Request"),

    /**
     * 
     *                         The LsBL message is a response.
     *                     
     * 
     */
    @XmlEnumValue("LSBL_Response")
    LSBL_RESPONSE("LSBL_Response"),

    /**
     * 
     *                         The LsBL message is an event.
     *                     
     * 
     */
    @XmlEnumValue("LSBL_Event")
    LSBL_EVENT("LSBL_Event"),

    /**
     * 
     *                         The LsBL message is an acknowledgment.
     *                     
     * 
     */
    LSBL_APP_ACK("LSBL_APP_ACK"),

    /**
     * 
     *                         The LsBL message is a nacknowledgment.
     *                     
     * 
     */
    LSBL_APP_NACK("LSBL_APP_NACK");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
