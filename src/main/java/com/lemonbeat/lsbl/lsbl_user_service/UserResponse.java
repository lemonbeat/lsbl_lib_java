//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
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
 * <p>Java-Klasse f�r user_response complex type.
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
    "userMetadataReport"
})
public class UserResponse {

    @XmlElement(name = "user_get")
    protected UserGetResponse userGet;
    @XmlElement(name = "user_metadata_report")
    protected UserMetadataReport userMetadataReport;

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

}
