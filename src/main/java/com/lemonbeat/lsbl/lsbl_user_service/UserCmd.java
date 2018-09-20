//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.20 um 04:07:26 PM CEST 
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
 * <p>Java-Klasse für user_cmd complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="user_cmd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="user_get" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_get_request"/>
 *           &lt;element name="user_password_set" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_password_set_request"/>
 *           &lt;element name="user_login" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_login_request"/>
 *           &lt;element name="user_add" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_add_request"/>
 *           &lt;element name="user_delete" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_delete_request"/>
 *           &lt;element name="user_group_add" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_group_add_request"/>
 *           &lt;element name="user_group_delete" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_group_delete_request"/>
 *           &lt;element name="user_metadata_get" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_metadata_get_request"/>
 *           &lt;element name="user_metadata_set" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_metadata_set_request"/>
 *           &lt;element name="user_metadata_delete" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_metadata_delete_request"/>
 *           &lt;element name="group_get" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_get_request"/>
 *           &lt;element name="group_add" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_add_request"/>
 *           &lt;element name="group_delete" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_delete_request"/>
 *           &lt;element name="group_metadata_get" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_metadata_get_request"/>
 *           &lt;element name="group_metadata_set" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_metadata_set_request"/>
 *           &lt;element name="group_metadata_delete" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}group_metadata_delete_request"/>
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
    "userDelete",
    "userGroupAdd",
    "userGroupDelete",
    "userMetadataGet",
    "userMetadataSet",
    "userMetadataDelete",
    "groupGet",
    "groupAdd",
    "groupDelete",
    "groupMetadataGet",
    "groupMetadataSet",
    "groupMetadataDelete"
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
    @XmlElement(name = "user_delete")
    protected UserDeleteRequest userDelete;
    @XmlElement(name = "user_group_add")
    protected UserGroupAddRequest userGroupAdd;
    @XmlElement(name = "user_group_delete")
    protected UserGroupDeleteRequest userGroupDelete;
    @XmlElement(name = "user_metadata_get")
    protected UserMetadataGetRequest userMetadataGet;
    @XmlElement(name = "user_metadata_set")
    protected UserMetadataSetRequest userMetadataSet;
    @XmlElement(name = "user_metadata_delete")
    protected UserMetadataDeleteRequest userMetadataDelete;
    @XmlElement(name = "group_get")
    protected GroupGetRequest groupGet;
    @XmlElement(name = "group_add")
    protected GroupAddRequest groupAdd;
    @XmlElement(name = "group_delete")
    protected GroupDeleteRequest groupDelete;
    @XmlElement(name = "group_metadata_get")
    protected GroupMetadataGetRequest groupMetadataGet;
    @XmlElement(name = "group_metadata_set")
    protected GroupMetadataSetRequest groupMetadataSet;
    @XmlElement(name = "group_metadata_delete")
    protected GroupMetadataDeleteRequest groupMetadataDelete;

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
     * Ruft den Wert der userDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserDeleteRequest }
     *     
     */
    public UserDeleteRequest getUserDelete() {
        return userDelete;
    }

    /**
     * Legt den Wert der userDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDeleteRequest }
     *     
     */
    public void setUserDelete(UserDeleteRequest value) {
        this.userDelete = value;
    }

    /**
     * Ruft den Wert der userGroupAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupAddRequest }
     *     
     */
    public UserGroupAddRequest getUserGroupAdd() {
        return userGroupAdd;
    }

    /**
     * Legt den Wert der userGroupAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupAddRequest }
     *     
     */
    public void setUserGroupAdd(UserGroupAddRequest value) {
        this.userGroupAdd = value;
    }

    /**
     * Ruft den Wert der userGroupDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupDeleteRequest }
     *     
     */
    public UserGroupDeleteRequest getUserGroupDelete() {
        return userGroupDelete;
    }

    /**
     * Legt den Wert der userGroupDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupDeleteRequest }
     *     
     */
    public void setUserGroupDelete(UserGroupDeleteRequest value) {
        this.userGroupDelete = value;
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

    /**
     * Ruft den Wert der groupGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupGetRequest }
     *     
     */
    public GroupGetRequest getGroupGet() {
        return groupGet;
    }

    /**
     * Legt den Wert der groupGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupGetRequest }
     *     
     */
    public void setGroupGet(GroupGetRequest value) {
        this.groupGet = value;
    }

    /**
     * Ruft den Wert der groupAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupAddRequest }
     *     
     */
    public GroupAddRequest getGroupAdd() {
        return groupAdd;
    }

    /**
     * Legt den Wert der groupAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAddRequest }
     *     
     */
    public void setGroupAdd(GroupAddRequest value) {
        this.groupAdd = value;
    }

    /**
     * Ruft den Wert der groupDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupDeleteRequest }
     *     
     */
    public GroupDeleteRequest getGroupDelete() {
        return groupDelete;
    }

    /**
     * Legt den Wert der groupDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDeleteRequest }
     *     
     */
    public void setGroupDelete(GroupDeleteRequest value) {
        this.groupDelete = value;
    }

    /**
     * Ruft den Wert der groupMetadataGet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupMetadataGetRequest }
     *     
     */
    public GroupMetadataGetRequest getGroupMetadataGet() {
        return groupMetadataGet;
    }

    /**
     * Legt den Wert der groupMetadataGet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMetadataGetRequest }
     *     
     */
    public void setGroupMetadataGet(GroupMetadataGetRequest value) {
        this.groupMetadataGet = value;
    }

    /**
     * Ruft den Wert der groupMetadataSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupMetadataSetRequest }
     *     
     */
    public GroupMetadataSetRequest getGroupMetadataSet() {
        return groupMetadataSet;
    }

    /**
     * Legt den Wert der groupMetadataSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMetadataSetRequest }
     *     
     */
    public void setGroupMetadataSet(GroupMetadataSetRequest value) {
        this.groupMetadataSet = value;
    }

    /**
     * Ruft den Wert der groupMetadataDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupMetadataDeleteRequest }
     *     
     */
    public GroupMetadataDeleteRequest getGroupMetadataDelete() {
        return groupMetadataDelete;
    }

    /**
     * Legt den Wert der groupMetadataDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMetadataDeleteRequest }
     *     
     */
    public void setGroupMetadataDelete(GroupMetadataDeleteRequest value) {
        this.groupMetadataDelete = value;
    }

}
