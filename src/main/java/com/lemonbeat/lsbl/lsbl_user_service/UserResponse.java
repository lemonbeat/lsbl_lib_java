//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.23 um 02:25:46 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_user_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Definition of the responses of the user_service.
 *       
 * 
 * <p>Java-Klasse für user_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="user_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="user_get" type="{urn:lsbl_user_service}user_get_response"/>
 *           &lt;element name="user_metadata_report" type="{urn:lsbl_user_service}user_metadata_report"/>
 *           &lt;element name="group_get" type="{urn:lsbl_user_service}group_get_response"/>
 *           &lt;element name="group_metadata_report" type="{urn:lsbl_user_service}group_metadata_report"/>
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
@XmlType(name = "user_response", propOrder = {
    "userGet",
    "userMetadataReport",
    "groupGet",
    "groupMetadataReport"
})
public class UserResponse {

    @XmlElement(name = "user_get")
    protected UserGetResponse userGet;
    @XmlElement(name = "user_metadata_report")
    protected UserMetadataReport userMetadataReport;
    @XmlElement(name = "group_get")
    protected GroupGetResponse groupGet;
    @XmlElement(name = "group_metadata_report")
    protected GroupMetadataReport groupMetadataReport;

    /**
     * Ruft den Wert der userGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserGetResponse }
     *     
     */
    public UserGetResponse getUserGet() {
        return userGet;
    }

    /**
     * Legt den Wert der userGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGetResponse }
     *     
     */
    public void setUserGet(UserGetResponse value) {
        this.userGet = value;
    }

    /**
     * Ruft den Wert der userMetadataReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserMetadataReport }
     *     
     */
    public UserMetadataReport getUserMetadataReport() {
        return userMetadataReport;
    }

    /**
     * Legt den Wert der userMetadataReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserMetadataReport }
     *     
     */
    public void setUserMetadataReport(UserMetadataReport value) {
        this.userMetadataReport = value;
    }

    /**
     * Ruft den Wert der groupGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupGetResponse }
     *     
     */
    public GroupGetResponse getGroupGet() {
        return groupGet;
    }

    /**
     * Legt den Wert der groupGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupGetResponse }
     *     
     */
    public void setGroupGet(GroupGetResponse value) {
        this.groupGet = value;
    }

    /**
     * Ruft den Wert der groupMetadataReport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupMetadataReport }
     *     
     */
    public GroupMetadataReport getGroupMetadataReport() {
        return groupMetadataReport;
    }

    /**
     * Legt den Wert der groupMetadataReport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMetadataReport }
     *     
     */
    public void setGroupMetadataReport(GroupMetadataReport value) {
        this.groupMetadataReport = value;
    }

}
