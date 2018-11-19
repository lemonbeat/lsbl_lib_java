//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl_ges;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of the commands of the GES Interface.
 *             
 * 
 * <p>Java-Klasse für ges_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ges_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="gw_broker_config_set" type="{urn:lsbl_ges}gw_broker_config_set_request"/>
 *           &lt;element name="gw_broker_config_delete" type="{urn:lsbl_ges}gw_broker_config_delete_request"/>
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
@XmlType(name = "ges_cmd", propOrder = {
    "gwBrokerConfigSet",
    "gwBrokerConfigDelete"
})
public class GesCmd {

    @XmlElement(name = "gw_broker_config_set")
    protected GwBrokerConfigSetRequest gwBrokerConfigSet;
    @XmlElement(name = "gw_broker_config_delete")
    protected GwBrokerConfigDeleteRequest gwBrokerConfigDelete;

    /**
     * Ruft den Wert der gwBrokerConfigSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwBrokerConfigSetRequest }
     *     
     */
    public GwBrokerConfigSetRequest getGwBrokerConfigSet() {
        return gwBrokerConfigSet;
    }

    /**
     * Legt den Wert der gwBrokerConfigSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwBrokerConfigSetRequest }
     *     
     */
    public void setGwBrokerConfigSet(GwBrokerConfigSetRequest value) {
        this.gwBrokerConfigSet = value;
    }

    /**
     * Ruft den Wert der gwBrokerConfigDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GwBrokerConfigDeleteRequest }
     *     
     */
    public GwBrokerConfigDeleteRequest getGwBrokerConfigDelete() {
        return gwBrokerConfigDelete;
    }

    /**
     * Legt den Wert der gwBrokerConfigDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GwBrokerConfigDeleteRequest }
     *     
     */
    public void setGwBrokerConfigDelete(GwBrokerConfigDeleteRequest value) {
        this.gwBrokerConfigDelete = value;
    }

}
