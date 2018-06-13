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
 *         Definition of the commands of the user_service.
 *       
 * 
 * <p>Java-Klasse f�r user_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="user_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="user_get" type="{urn:lsbl_user_service}user_get_request"/>
 *           &lt;element name="user_password_set" type="{urn:lsbl_user_service}user_password_set_request"/>
 *           &lt;element name="user_login" type="{urn:lsbl_user_service}user_login_request"/>
 *           &lt;element name="user_add" type="{urn:lsbl_user_service}user_add_request"/>
 *           &lt;element name="user_metadata_get" type="{urn:lsbl_user_service}user_metadata_get_request"/>
 *           &lt;element name="user_metadata_set" type="{urn:lsbl_user_service}user_metadata_set_request"/>
 *           &lt;element name="user_metadata_delete" type="{urn:lsbl_user_service}user_metadata_delete_request"/>
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
@XmlType(name = "user_cmd", propOrder = {
    "userGet",
    "userPasswordSet",
    "userLogin",
    "userAdd",
    "userMetadataGet",
    "userMetadataSet",
    "userMetadataDelete"
})
public class UserCmd {

    @XmlElement(name = "user_get")
    protected UserGetRequest userGet;
    @XmlElement(name = "user_password_set")
    protected UserPasswordSetRequest userPasswordSet;
    @XmlElement(name = "user_login")
    protected UserLoginRequest userLogin;
    @XmlElement(name = "user_add")
    protected UserAddRequest userAdd;
    @XmlElement(name = "user_metadata_get")
    protected UserMetadataGetRequest userMetadataGet;
    @XmlElement(name = "user_metadata_set")
    protected UserMetadataSetRequest userMetadataSet;
    @XmlElement(name = "user_metadata_delete")
    protected UserMetadataDeleteRequest userMetadataDelete;

    /**
     * Ruft den Wert der userGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserGetRequest }
     *     
     */
    public UserGetRequest getUserGet() {
        return userGet;
    }

    /**
     * Legt den Wert der userGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGetRequest }
     *     
     */
    public void setUserGet(UserGetRequest value) {
        this.userGet = value;
    }

    /**
     * Ruft den Wert der userPasswordSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserPasswordSetRequest }
     *     
     */
    public UserPasswordSetRequest getUserPasswordSet() {
        return userPasswordSet;
    }

    /**
     * Legt den Wert der userPasswordSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPasswordSetRequest }
     *     
     */
    public void setUserPasswordSet(UserPasswordSetRequest value) {
        this.userPasswordSet = value;
    }

    /**
     * Ruft den Wert der userLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginRequest }
     *     
     */
    public UserLoginRequest getUserLogin() {
        return userLogin;
    }

    /**
     * Legt den Wert der userLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginRequest }
     *     
     */
    public void setUserLogin(UserLoginRequest value) {
        this.userLogin = value;
    }

    /**
     * Ruft den Wert der userAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserAddRequest }
     *     
     */
    public UserAddRequest getUserAdd() {
        return userAdd;
    }

    /**
     * Legt den Wert der userAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddRequest }
     *     
     */
    public void setUserAdd(UserAddRequest value) {
        this.userAdd = value;
    }

    /**
     * Ruft den Wert der userMetadataGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserMetadataGetRequest }
     *     
     */
    public UserMetadataGetRequest getUserMetadataGet() {
        return userMetadataGet;
    }

    /**
     * Legt den Wert der userMetadataGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserMetadataGetRequest }
     *     
     */
    public void setUserMetadataGet(UserMetadataGetRequest value) {
        this.userMetadataGet = value;
    }

    /**
     * Ruft den Wert der userMetadataSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserMetadataSetRequest }
     *     
     */
    public UserMetadataSetRequest getUserMetadataSet() {
        return userMetadataSet;
    }

    /**
     * Legt den Wert der userMetadataSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserMetadataSetRequest }
     *     
     */
    public void setUserMetadataSet(UserMetadataSetRequest value) {
        this.userMetadataSet = value;
    }

    /**
     * Ruft den Wert der userMetadataDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserMetadataDeleteRequest }
     *     
     */
    public UserMetadataDeleteRequest getUserMetadataDelete() {
        return userMetadataDelete;
    }

    /**
     * Legt den Wert der userMetadataDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserMetadataDeleteRequest }
     *     
     */
    public void setUserMetadataDelete(UserMetadataDeleteRequest value) {
        this.userMetadataDelete = value;
    }

}
