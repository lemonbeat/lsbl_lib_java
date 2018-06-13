//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.09 um 10:12:36 PM CEST 
//


package com.lemonbeat.lsbl.lsbl_test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Definition of responses used for testing.
 *             
 * 
 * <p>Java-Klasse f�r test_response complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="test_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="test" type="{urn:lsbl_test}test_message"/>
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
@XmlType(name = "test_response", propOrder = {
    "test"
})
public class TestResponse {

    protected TestMessage test;

    /**
     * Ruft den Wert der test-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TestMessage }
     *     
     */
    public TestMessage getTest() {
        return test;
    }

    /**
     * Legt den Wert der test-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMessage }
     *     
     */
    public void setTest(TestMessage value) {
        this.test = value;
    }

}
