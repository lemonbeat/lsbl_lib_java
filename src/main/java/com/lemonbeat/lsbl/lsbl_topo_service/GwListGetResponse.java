//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_topo_service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response for the request of a list of all included gateways. The gateways are ordered by the SGTINs of the
 *         gateway.
 *       
 * 
 * <p>Java-Klasse für gw_list_get_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="gw_list_get_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gw" type="{urn:com.lemonbeat.lsbl.lsbl_common_base_types}sgtin_96" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="range_start" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gw_list_get_response", propOrder = {
    "gw"
})
public class GwListGetResponse {

    protected List<String> gw;
    @XmlAttribute(name = "range_start", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long rangeStart;
    @XmlAttribute(name = "count", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long count;

    /**
     * Gets the value of the gw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGw() {
        if (gw == null) {
            gw = new ArrayList<String>();
        }
        return this.gw;
    }

    /**
     * Ruft den Wert der rangeStart-Eigenschaft ab.
     * 
     */
    public long getRangeStart() {
        return rangeStart;
    }

    /**
     * Legt den Wert der rangeStart-Eigenschaft fest.
     * 
     */
    public void setRangeStart(long value) {
        this.rangeStart = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

}
