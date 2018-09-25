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
 *         Sends group information, after being requested from group_get_request.
 *       
 * 
 * <p>Java-Klasse für group_get_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="group_get_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="users" type="{urn:com.lemonbeat.lsbl.lsbl_user_service}user_list"/>
 *         &lt;element name="inserted_at" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group_get_response", propOrder = {
    "groupname",
    "users",
    "insertedAt",
    "updatedAt"
})
public class GroupGetResponse {

    protected String groupname;
    @XmlElement(required = true)
    protected UserList users;
    @XmlElement(name = "inserted_at", required = true)
    protected String insertedAt;
    @XmlElement(name = "updated_at", required = true)
    protected String updatedAt;

    /**
     * Ruft den Wert der groupname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * Legt den Wert der groupname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupname(String value) {
        this.groupname = value;
    }

    /**
     * Ruft den Wert der users-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserList }
     *     
     */
    public UserList getUsers() {
        return users;
    }

    /**
     * Legt den Wert der users-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserList }
     *     
     */
    public void setUsers(UserList value) {
        this.users = value;
    }

    /**
     * Ruft den Wert der insertedAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertedAt() {
        return insertedAt;
    }

    /**
     * Legt den Wert der insertedAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertedAt(String value) {
        this.insertedAt = value;
    }

    /**
     * Ruft den Wert der updatedAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Legt den Wert der updatedAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

}
