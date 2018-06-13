//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_user_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lsbl_user_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lsbl_user_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserPasswordSetRequest }
     * 
     */
    public UserPasswordSetRequest createUserPasswordSetRequest() {
        return new UserPasswordSetRequest();
    }

    /**
     * Create an instance of {@link UserMetadataSetRequest }
     * 
     */
    public UserMetadataSetRequest createUserMetadataSetRequest() {
        return new UserMetadataSetRequest();
    }

    /**
     * Create an instance of {@link UserCmd }
     * 
     */
    public UserCmd createUserCmd() {
        return new UserCmd();
    }

    /**
     * Create an instance of {@link UserLoginRequest }
     * 
     */
    public UserLoginRequest createUserLoginRequest() {
        return new UserLoginRequest();
    }

    /**
     * Create an instance of {@link UserMetadataGetRequest }
     * 
     */
    public UserMetadataGetRequest createUserMetadataGetRequest() {
        return new UserMetadataGetRequest();
    }

    /**
     * Create an instance of {@link UserMetadataDeleteRequest }
     * 
     */
    public UserMetadataDeleteRequest createUserMetadataDeleteRequest() {
        return new UserMetadataDeleteRequest();
    }

    /**
     * Create an instance of {@link MetadataAttribute }
     * 
     */
    public MetadataAttribute createMetadataAttribute() {
        return new MetadataAttribute();
    }

    /**
     * Create an instance of {@link UserGetResponse }
     * 
     */
    public UserGetResponse createUserGetResponse() {
        return new UserGetResponse();
    }

    /**
     * Create an instance of {@link UserMetadataReport }
     * 
     */
    public UserMetadataReport createUserMetadataReport() {
        return new UserMetadataReport();
    }

    /**
     * Create an instance of {@link UserGetRequest }
     * 
     */
    public UserGetRequest createUserGetRequest() {
        return new UserGetRequest();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link UserAddRequest }
     * 
     */
    public UserAddRequest createUserAddRequest() {
        return new UserAddRequest();
    }

}
