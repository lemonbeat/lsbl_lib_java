//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.19 um 04:40:50 PM CET 
//


package com.lemonbeat.lsbl.lsbl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.lemonbeat.lsbl.lsbl_common.CommonCmd;
import com.lemonbeat.lsbl.lsbl_common.CommonResponse;
import com.lemonbeat.lsbl.lsbl_config_mgmt_service.ConfigMgmtCmd;
import com.lemonbeat.lsbl.lsbl_config_mgmt_service.ConfigMgmtEvent;
import com.lemonbeat.lsbl.lsbl_config_mgmt_service.ConfigMgmtResponse;
import com.lemonbeat.lsbl.lsbl_firmware_service.FirmwareCmd;
import com.lemonbeat.lsbl.lsbl_firmware_service.FirmwareEvent;
import com.lemonbeat.lsbl.lsbl_firmware_service.FirmwareResponse;
import com.lemonbeat.lsbl.lsbl_ges.GesCmd;
import com.lemonbeat.lsbl.lsbl_ges.GesResponse;
import com.lemonbeat.lsbl.lsbl_global_key_service.GlobalKeyCmd;
import com.lemonbeat.lsbl.lsbl_global_key_service.GlobalKeyEvent;
import com.lemonbeat.lsbl.lsbl_global_key_service.GlobalKeyResponse;
import com.lemonbeat.lsbl.lsbl_heartbeat_service.HeartbeatCmd;
import com.lemonbeat.lsbl.lsbl_heartbeat_service.HeartbeatEvent;
import com.lemonbeat.lsbl.lsbl_heartbeat_service.HeartbeatResponse;
import com.lemonbeat.lsbl.lsbl_inclusion_service.InclusionCmd;
import com.lemonbeat.lsbl.lsbl_inclusion_service.InclusionEvent;
import com.lemonbeat.lsbl.lsbl_inclusion_service.InclusionResponse;
import com.lemonbeat.lsbl.lsbl_metadata_service.MetadataCmd;
import com.lemonbeat.lsbl.lsbl_metadata_service.MetadataEvent;
import com.lemonbeat.lsbl.lsbl_metadata_service.MetadataResponse;
import com.lemonbeat.lsbl.lsbl_status_service.StatusCmd;
import com.lemonbeat.lsbl.lsbl_status_service.StatusEvent;
import com.lemonbeat.lsbl.lsbl_status_service.StatusResponse;
import com.lemonbeat.lsbl.lsbl_sys_event.SysEvent;
import com.lemonbeat.lsbl.lsbl_test.TestCmd;
import com.lemonbeat.lsbl.lsbl_test.TestResponse;
import com.lemonbeat.lsbl.lsbl_topo_service.TopoCmd;
import com.lemonbeat.lsbl.lsbl_topo_service.TopoEvent;
import com.lemonbeat.lsbl.lsbl_topo_service.TopoResponse;
import com.lemonbeat.lsbl.lsbl_user_service.UserCmd;
import com.lemonbeat.lsbl.lsbl_user_service.UserResponse;
import com.lemonbeat.lsbl.lsbl_value_service.ValueCmd;
import com.lemonbeat.lsbl.lsbl_value_service.ValueEvent;
import com.lemonbeat.lsbl.lsbl_value_service.ValueResponse;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="src" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required" type="{urn:lsbl-envelope}message_type" />
 *                 &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hdr" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;choice>
 *           &lt;element name="cmd" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="common_cmd" type="{urn:lsbl_common}common_cmd"/>
 *                     &lt;element name="config_mgmt_cmd" type="{urn:lsbl_config_mgmt_service}config_mgmt_cmd"/>
 *                     &lt;element name="global_key_cmd" type="{urn:lsbl_global_key_service}global_key_cmd"/>
 *                     &lt;element name="heartbeat_cmd" type="{urn:lsbl_heartbeat_service}heartbeat_cmd"/>
 *                     &lt;element name="ges_cmd" type="{urn:lsbl_ges}ges_cmd"/>
 *                     &lt;element name="inclusion_cmd" type="{urn:lsbl_inclusion_service}inclusion_cmd"/>
 *                     &lt;element name="metadata_cmd" type="{urn:lsbl_metadata_service}metadata_cmd"/>
 *                     &lt;element name="status_cmd" type="{urn:lsbl_status_service}status_cmd"/>
 *                     &lt;element name="topo_cmd" type="{urn:lsbl_topo_service}topo_cmd"/>
 *                     &lt;element name="test_cmd" type="{urn:lsbl_test}test_cmd"/>
 *                     &lt;element name="user_cmd" type="{urn:lsbl_user_service}user_cmd"/>
 *                     &lt;element name="value_cmd" type="{urn:lsbl_value_service}value_cmd"/>
 *                     &lt;element name="firmware_cmd" type="{urn:lsbl_firmware_service}firmware_cmd"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="response" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="common_response" type="{urn:lsbl_common}common_response"/>
 *                     &lt;element name="config_mgmt_response" type="{urn:lsbl_config_mgmt_service}config_mgmt_response"/>
 *                     &lt;element name="topo_response" type="{urn:lsbl_topo_service}topo_response"/>
 *                     &lt;element name="user_response" type="{urn:lsbl_user_service}user_response"/>
 *                     &lt;element name="metadata_response" type="{urn:lsbl_metadata_service}metadata_response"/>
 *                     &lt;element name="status_response" type="{urn:lsbl_status_service}status_response"/>
 *                     &lt;element name="inclusion_response" type="{urn:lsbl_inclusion_service}inclusion_response"/>
 *                     &lt;element name="global_key_response" type="{urn:lsbl_global_key_service}global_key_response"/>
 *                     &lt;element name="heartbeat_response" type="{urn:lsbl_heartbeat_service}heartbeat_response"/>
 *                     &lt;element name="value_response" type="{urn:lsbl_value_service}value_response"/>
 *                     &lt;element name="ges_response" type="{urn:lsbl_ges}ges_response"/>
 *                     &lt;element name="test_response" type="{urn:lsbl_test}test_response"/>
 *                     &lt;element name="firmware_response" type="{urn:lsbl_firmware_service}firmware_response"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="event" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="topo_event" type="{urn:lsbl_topo_service}topo_event"/>
 *                     &lt;element name="config_mgmt_event" type="{urn:lsbl_config_mgmt_service}config_mgmt_event"/>
 *                     &lt;element name="global_key_event" type="{urn:lsbl_global_key_service}global_key_event"/>
 *                     &lt;element name="heartbeat_event" type="{urn:lsbl_heartbeat_service}heartbeat_event"/>
 *                     &lt;element name="metadata_event" type="{urn:lsbl_metadata_service}metadata_event"/>
 *                     &lt;element name="status_event" type="{urn:lsbl_status_service}status_event"/>
 *                     &lt;element name="value_event" type="{urn:lsbl_value_service}value_event"/>
 *                     &lt;element name="inclusion_event" type="{urn:lsbl_inclusion_service}inclusion_event"/>
 *                     &lt;element name="sys_event" type="{urn:lsbl_sys_event}sys_event"/>
 *                     &lt;element name="firmware_event" type="{urn:lsbl_firmware_service}firmware_event"/>
 *                   &lt;/choice>
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adr",
    "hdr",
    "cmd",
    "response",
    "event"
})
@XmlRootElement(name = "lsbl")
public class Lsbl {

    @XmlElement(required = true)
    protected Lsbl.Adr adr;
    @XmlElement(required = true)
    protected Object hdr;
    protected Lsbl.Cmd cmd;
    protected Lsbl.Response response;
    protected Lsbl.Event event;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der adr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lsbl.Adr }
     *     
     */
    public Lsbl.Adr getAdr() {
        return adr;
    }

    /**
     * Legt den Wert der adr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lsbl.Adr }
     *     
     */
    public void setAdr(Lsbl.Adr value) {
        this.adr = value;
    }

    /**
     * Ruft den Wert der hdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHdr() {
        return hdr;
    }

    /**
     * Legt den Wert der hdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHdr(Object value) {
        this.hdr = value;
    }

    /**
     * Ruft den Wert der cmd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lsbl.Cmd }
     *     
     */
    public Lsbl.Cmd getCmd() {
        return cmd;
    }

    /**
     * Legt den Wert der cmd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lsbl.Cmd }
     *     
     */
    public void setCmd(Lsbl.Cmd value) {
        this.cmd = value;
    }

    /**
     * Ruft den Wert der response-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lsbl.Response }
     *     
     */
    public Lsbl.Response getResponse() {
        return response;
    }

    /**
     * Legt den Wert der response-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lsbl.Response }
     *     
     */
    public void setResponse(Lsbl.Response value) {
        this.response = value;
    }

    /**
     * Ruft den Wert der event-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lsbl.Event }
     *     
     */
    public Lsbl.Event getEvent() {
        return event;
    }

    /**
     * Legt den Wert der event-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lsbl.Event }
     *     
     */
    public void setEvent(Lsbl.Event value) {
        this.event = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="src" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required" type="{urn:lsbl-envelope}message_type" />
     *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Adr {

        @XmlAttribute(name = "target", required = true)
        protected String target;
        @XmlAttribute(name = "src", required = true)
        protected String src;
        @XmlAttribute(name = "type", required = true)
        protected MessageType type;
        @XmlAttribute(name = "seq", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long seq;

        /**
         * Ruft den Wert der target-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Legt den Wert der target-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

        /**
         * Ruft den Wert der src-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrc() {
            return src;
        }

        /**
         * Legt den Wert der src-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrc(String value) {
            this.src = value;
        }

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MessageType }
         *     
         */
        public MessageType getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageType }
         *     
         */
        public void setType(MessageType value) {
            this.type = value;
        }

        /**
         * Ruft den Wert der seq-Eigenschaft ab.
         * 
         */
        public long getSeq() {
            return seq;
        }

        /**
         * Legt den Wert der seq-Eigenschaft fest.
         * 
         */
        public void setSeq(long value) {
            this.seq = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="common_cmd" type="{urn:lsbl_common}common_cmd"/>
     *         &lt;element name="config_mgmt_cmd" type="{urn:lsbl_config_mgmt_service}config_mgmt_cmd"/>
     *         &lt;element name="global_key_cmd" type="{urn:lsbl_global_key_service}global_key_cmd"/>
     *         &lt;element name="heartbeat_cmd" type="{urn:lsbl_heartbeat_service}heartbeat_cmd"/>
     *         &lt;element name="ges_cmd" type="{urn:lsbl_ges}ges_cmd"/>
     *         &lt;element name="inclusion_cmd" type="{urn:lsbl_inclusion_service}inclusion_cmd"/>
     *         &lt;element name="metadata_cmd" type="{urn:lsbl_metadata_service}metadata_cmd"/>
     *         &lt;element name="status_cmd" type="{urn:lsbl_status_service}status_cmd"/>
     *         &lt;element name="topo_cmd" type="{urn:lsbl_topo_service}topo_cmd"/>
     *         &lt;element name="test_cmd" type="{urn:lsbl_test}test_cmd"/>
     *         &lt;element name="user_cmd" type="{urn:lsbl_user_service}user_cmd"/>
     *         &lt;element name="value_cmd" type="{urn:lsbl_value_service}value_cmd"/>
     *         &lt;element name="firmware_cmd" type="{urn:lsbl_firmware_service}firmware_cmd"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonCmd",
        "configMgmtCmd",
        "globalKeyCmd",
        "heartbeatCmd",
        "gesCmd",
        "inclusionCmd",
        "metadataCmd",
        "statusCmd",
        "topoCmd",
        "testCmd",
        "userCmd",
        "valueCmd",
        "firmwareCmd"
    })
    public static class Cmd {

        @XmlElement(name = "common_cmd")
        protected CommonCmd commonCmd;
        @XmlElement(name = "config_mgmt_cmd")
        protected ConfigMgmtCmd configMgmtCmd;
        @XmlElement(name = "global_key_cmd")
        protected GlobalKeyCmd globalKeyCmd;
        @XmlElement(name = "heartbeat_cmd")
        protected HeartbeatCmd heartbeatCmd;
        @XmlElement(name = "ges_cmd")
        protected GesCmd gesCmd;
        @XmlElement(name = "inclusion_cmd")
        protected InclusionCmd inclusionCmd;
        @XmlElement(name = "metadata_cmd")
        protected MetadataCmd metadataCmd;
        @XmlElement(name = "status_cmd")
        protected StatusCmd statusCmd;
        @XmlElement(name = "topo_cmd")
        protected TopoCmd topoCmd;
        @XmlElement(name = "test_cmd")
        protected TestCmd testCmd;
        @XmlElement(name = "user_cmd")
        protected UserCmd userCmd;
        @XmlElement(name = "value_cmd")
        protected ValueCmd valueCmd;
        @XmlElement(name = "firmware_cmd")
        protected FirmwareCmd firmwareCmd;

        /**
         * Ruft den Wert der commonCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CommonCmd }
         *     
         */
        public CommonCmd getCommonCmd() {
            return commonCmd;
        }

        /**
         * Legt den Wert der commonCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonCmd }
         *     
         */
        public void setCommonCmd(CommonCmd value) {
            this.commonCmd = value;
        }

        /**
         * Ruft den Wert der configMgmtCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ConfigMgmtCmd }
         *     
         */
        public ConfigMgmtCmd getConfigMgmtCmd() {
            return configMgmtCmd;
        }

        /**
         * Legt den Wert der configMgmtCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigMgmtCmd }
         *     
         */
        public void setConfigMgmtCmd(ConfigMgmtCmd value) {
            this.configMgmtCmd = value;
        }

        /**
         * Ruft den Wert der globalKeyCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GlobalKeyCmd }
         *     
         */
        public GlobalKeyCmd getGlobalKeyCmd() {
            return globalKeyCmd;
        }

        /**
         * Legt den Wert der globalKeyCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalKeyCmd }
         *     
         */
        public void setGlobalKeyCmd(GlobalKeyCmd value) {
            this.globalKeyCmd = value;
        }

        /**
         * Ruft den Wert der heartbeatCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link HeartbeatCmd }
         *     
         */
        public HeartbeatCmd getHeartbeatCmd() {
            return heartbeatCmd;
        }

        /**
         * Legt den Wert der heartbeatCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link HeartbeatCmd }
         *     
         */
        public void setHeartbeatCmd(HeartbeatCmd value) {
            this.heartbeatCmd = value;
        }

        /**
         * Ruft den Wert der gesCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GesCmd }
         *     
         */
        public GesCmd getGesCmd() {
            return gesCmd;
        }

        /**
         * Legt den Wert der gesCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GesCmd }
         *     
         */
        public void setGesCmd(GesCmd value) {
            this.gesCmd = value;
        }

        /**
         * Ruft den Wert der inclusionCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InclusionCmd }
         *     
         */
        public InclusionCmd getInclusionCmd() {
            return inclusionCmd;
        }

        /**
         * Legt den Wert der inclusionCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InclusionCmd }
         *     
         */
        public void setInclusionCmd(InclusionCmd value) {
            this.inclusionCmd = value;
        }

        /**
         * Ruft den Wert der metadataCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MetadataCmd }
         *     
         */
        public MetadataCmd getMetadataCmd() {
            return metadataCmd;
        }

        /**
         * Legt den Wert der metadataCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataCmd }
         *     
         */
        public void setMetadataCmd(MetadataCmd value) {
            this.metadataCmd = value;
        }

        /**
         * Ruft den Wert der statusCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link StatusCmd }
         *     
         */
        public StatusCmd getStatusCmd() {
            return statusCmd;
        }

        /**
         * Legt den Wert der statusCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusCmd }
         *     
         */
        public void setStatusCmd(StatusCmd value) {
            this.statusCmd = value;
        }

        /**
         * Ruft den Wert der topoCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TopoCmd }
         *     
         */
        public TopoCmd getTopoCmd() {
            return topoCmd;
        }

        /**
         * Legt den Wert der topoCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TopoCmd }
         *     
         */
        public void setTopoCmd(TopoCmd value) {
            this.topoCmd = value;
        }

        /**
         * Ruft den Wert der testCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestCmd }
         *     
         */
        public TestCmd getTestCmd() {
            return testCmd;
        }

        /**
         * Legt den Wert der testCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestCmd }
         *     
         */
        public void setTestCmd(TestCmd value) {
            this.testCmd = value;
        }

        /**
         * Ruft den Wert der userCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UserCmd }
         *     
         */
        public UserCmd getUserCmd() {
            return userCmd;
        }

        /**
         * Legt den Wert der userCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UserCmd }
         *     
         */
        public void setUserCmd(UserCmd value) {
            this.userCmd = value;
        }

        /**
         * Ruft den Wert der valueCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ValueCmd }
         *     
         */
        public ValueCmd getValueCmd() {
            return valueCmd;
        }

        /**
         * Legt den Wert der valueCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ValueCmd }
         *     
         */
        public void setValueCmd(ValueCmd value) {
            this.valueCmd = value;
        }

        /**
         * Ruft den Wert der firmwareCmd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link FirmwareCmd }
         *     
         */
        public FirmwareCmd getFirmwareCmd() {
            return firmwareCmd;
        }

        /**
         * Legt den Wert der firmwareCmd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link FirmwareCmd }
         *     
         */
        public void setFirmwareCmd(FirmwareCmd value) {
            this.firmwareCmd = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="topo_event" type="{urn:lsbl_topo_service}topo_event"/>
     *         &lt;element name="config_mgmt_event" type="{urn:lsbl_config_mgmt_service}config_mgmt_event"/>
     *         &lt;element name="global_key_event" type="{urn:lsbl_global_key_service}global_key_event"/>
     *         &lt;element name="heartbeat_event" type="{urn:lsbl_heartbeat_service}heartbeat_event"/>
     *         &lt;element name="metadata_event" type="{urn:lsbl_metadata_service}metadata_event"/>
     *         &lt;element name="status_event" type="{urn:lsbl_status_service}status_event"/>
     *         &lt;element name="value_event" type="{urn:lsbl_value_service}value_event"/>
     *         &lt;element name="inclusion_event" type="{urn:lsbl_inclusion_service}inclusion_event"/>
     *         &lt;element name="sys_event" type="{urn:lsbl_sys_event}sys_event"/>
     *         &lt;element name="firmware_event" type="{urn:lsbl_firmware_service}firmware_event"/>
     *       &lt;/choice>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "topoEvent",
        "configMgmtEvent",
        "globalKeyEvent",
        "heartbeatEvent",
        "metadataEvent",
        "statusEvent",
        "valueEvent",
        "inclusionEvent",
        "sysEvent",
        "firmwareEvent"
    })
    public static class Event {

        @XmlElement(name = "topo_event")
        protected TopoEvent topoEvent;
        @XmlElement(name = "config_mgmt_event")
        protected ConfigMgmtEvent configMgmtEvent;
        @XmlElement(name = "global_key_event")
        protected GlobalKeyEvent globalKeyEvent;
        @XmlElement(name = "heartbeat_event")
        protected HeartbeatEvent heartbeatEvent;
        @XmlElement(name = "metadata_event")
        protected MetadataEvent metadataEvent;
        @XmlElement(name = "status_event")
        protected StatusEvent statusEvent;
        @XmlElement(name = "value_event")
        protected ValueEvent valueEvent;
        @XmlElement(name = "inclusion_event")
        protected InclusionEvent inclusionEvent;
        @XmlElement(name = "sys_event")
        protected SysEvent sysEvent;
        @XmlElement(name = "firmware_event")
        protected FirmwareEvent firmwareEvent;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "time", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger time;

        /**
         * Ruft den Wert der topoEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TopoEvent }
         *     
         */
        public TopoEvent getTopoEvent() {
            return topoEvent;
        }

        /**
         * Legt den Wert der topoEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TopoEvent }
         *     
         */
        public void setTopoEvent(TopoEvent value) {
            this.topoEvent = value;
        }

        /**
         * Ruft den Wert der configMgmtEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ConfigMgmtEvent }
         *     
         */
        public ConfigMgmtEvent getConfigMgmtEvent() {
            return configMgmtEvent;
        }

        /**
         * Legt den Wert der configMgmtEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigMgmtEvent }
         *     
         */
        public void setConfigMgmtEvent(ConfigMgmtEvent value) {
            this.configMgmtEvent = value;
        }

        /**
         * Ruft den Wert der globalKeyEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GlobalKeyEvent }
         *     
         */
        public GlobalKeyEvent getGlobalKeyEvent() {
            return globalKeyEvent;
        }

        /**
         * Legt den Wert der globalKeyEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalKeyEvent }
         *     
         */
        public void setGlobalKeyEvent(GlobalKeyEvent value) {
            this.globalKeyEvent = value;
        }

        /**
         * Ruft den Wert der heartbeatEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link HeartbeatEvent }
         *     
         */
        public HeartbeatEvent getHeartbeatEvent() {
            return heartbeatEvent;
        }

        /**
         * Legt den Wert der heartbeatEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link HeartbeatEvent }
         *     
         */
        public void setHeartbeatEvent(HeartbeatEvent value) {
            this.heartbeatEvent = value;
        }

        /**
         * Ruft den Wert der metadataEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MetadataEvent }
         *     
         */
        public MetadataEvent getMetadataEvent() {
            return metadataEvent;
        }

        /**
         * Legt den Wert der metadataEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataEvent }
         *     
         */
        public void setMetadataEvent(MetadataEvent value) {
            this.metadataEvent = value;
        }

        /**
         * Ruft den Wert der statusEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link StatusEvent }
         *     
         */
        public StatusEvent getStatusEvent() {
            return statusEvent;
        }

        /**
         * Legt den Wert der statusEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusEvent }
         *     
         */
        public void setStatusEvent(StatusEvent value) {
            this.statusEvent = value;
        }

        /**
         * Ruft den Wert der valueEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ValueEvent }
         *     
         */
        public ValueEvent getValueEvent() {
            return valueEvent;
        }

        /**
         * Legt den Wert der valueEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ValueEvent }
         *     
         */
        public void setValueEvent(ValueEvent value) {
            this.valueEvent = value;
        }

        /**
         * Ruft den Wert der inclusionEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InclusionEvent }
         *     
         */
        public InclusionEvent getInclusionEvent() {
            return inclusionEvent;
        }

        /**
         * Legt den Wert der inclusionEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InclusionEvent }
         *     
         */
        public void setInclusionEvent(InclusionEvent value) {
            this.inclusionEvent = value;
        }

        /**
         * Ruft den Wert der sysEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SysEvent }
         *     
         */
        public SysEvent getSysEvent() {
            return sysEvent;
        }

        /**
         * Legt den Wert der sysEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SysEvent }
         *     
         */
        public void setSysEvent(SysEvent value) {
            this.sysEvent = value;
        }

        /**
         * Ruft den Wert der firmwareEvent-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link FirmwareEvent }
         *     
         */
        public FirmwareEvent getFirmwareEvent() {
            return firmwareEvent;
        }

        /**
         * Legt den Wert der firmwareEvent-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link FirmwareEvent }
         *     
         */
        public void setFirmwareEvent(FirmwareEvent value) {
            this.firmwareEvent = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der time-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTime() {
            return time;
        }

        /**
         * Legt den Wert der time-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTime(BigInteger value) {
            this.time = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="common_response" type="{urn:lsbl_common}common_response"/>
     *         &lt;element name="config_mgmt_response" type="{urn:lsbl_config_mgmt_service}config_mgmt_response"/>
     *         &lt;element name="topo_response" type="{urn:lsbl_topo_service}topo_response"/>
     *         &lt;element name="user_response" type="{urn:lsbl_user_service}user_response"/>
     *         &lt;element name="metadata_response" type="{urn:lsbl_metadata_service}metadata_response"/>
     *         &lt;element name="status_response" type="{urn:lsbl_status_service}status_response"/>
     *         &lt;element name="inclusion_response" type="{urn:lsbl_inclusion_service}inclusion_response"/>
     *         &lt;element name="global_key_response" type="{urn:lsbl_global_key_service}global_key_response"/>
     *         &lt;element name="heartbeat_response" type="{urn:lsbl_heartbeat_service}heartbeat_response"/>
     *         &lt;element name="value_response" type="{urn:lsbl_value_service}value_response"/>
     *         &lt;element name="ges_response" type="{urn:lsbl_ges}ges_response"/>
     *         &lt;element name="test_response" type="{urn:lsbl_test}test_response"/>
     *         &lt;element name="firmware_response" type="{urn:lsbl_firmware_service}firmware_response"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonResponse",
        "configMgmtResponse",
        "topoResponse",
        "userResponse",
        "metadataResponse",
        "statusResponse",
        "inclusionResponse",
        "globalKeyResponse",
        "heartbeatResponse",
        "valueResponse",
        "gesResponse",
        "testResponse",
        "firmwareResponse"
    })
    public static class Response {

        @XmlElement(name = "common_response")
        protected CommonResponse commonResponse;
        @XmlElement(name = "config_mgmt_response")
        protected ConfigMgmtResponse configMgmtResponse;
        @XmlElement(name = "topo_response")
        protected TopoResponse topoResponse;
        @XmlElement(name = "user_response")
        protected UserResponse userResponse;
        @XmlElement(name = "metadata_response")
        protected MetadataResponse metadataResponse;
        @XmlElement(name = "status_response")
        protected StatusResponse statusResponse;
        @XmlElement(name = "inclusion_response")
        protected InclusionResponse inclusionResponse;
        @XmlElement(name = "global_key_response")
        protected GlobalKeyResponse globalKeyResponse;
        @XmlElement(name = "heartbeat_response")
        protected HeartbeatResponse heartbeatResponse;
        @XmlElement(name = "value_response")
        protected ValueResponse valueResponse;
        @XmlElement(name = "ges_response")
        protected GesResponse gesResponse;
        @XmlElement(name = "test_response")
        protected TestResponse testResponse;
        @XmlElement(name = "firmware_response")
        protected FirmwareResponse firmwareResponse;

        /**
         * Ruft den Wert der commonResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CommonResponse }
         *     
         */
        public CommonResponse getCommonResponse() {
            return commonResponse;
        }

        /**
         * Legt den Wert der commonResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonResponse }
         *     
         */
        public void setCommonResponse(CommonResponse value) {
            this.commonResponse = value;
        }

        /**
         * Ruft den Wert der configMgmtResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ConfigMgmtResponse }
         *     
         */
        public ConfigMgmtResponse getConfigMgmtResponse() {
            return configMgmtResponse;
        }

        /**
         * Legt den Wert der configMgmtResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigMgmtResponse }
         *     
         */
        public void setConfigMgmtResponse(ConfigMgmtResponse value) {
            this.configMgmtResponse = value;
        }

        /**
         * Ruft den Wert der topoResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TopoResponse }
         *     
         */
        public TopoResponse getTopoResponse() {
            return topoResponse;
        }

        /**
         * Legt den Wert der topoResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TopoResponse }
         *     
         */
        public void setTopoResponse(TopoResponse value) {
            this.topoResponse = value;
        }

        /**
         * Ruft den Wert der userResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link UserResponse }
         *     
         */
        public UserResponse getUserResponse() {
            return userResponse;
        }

        /**
         * Legt den Wert der userResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link UserResponse }
         *     
         */
        public void setUserResponse(UserResponse value) {
            this.userResponse = value;
        }

        /**
         * Ruft den Wert der metadataResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MetadataResponse }
         *     
         */
        public MetadataResponse getMetadataResponse() {
            return metadataResponse;
        }

        /**
         * Legt den Wert der metadataResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataResponse }
         *     
         */
        public void setMetadataResponse(MetadataResponse value) {
            this.metadataResponse = value;
        }

        /**
         * Ruft den Wert der statusResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link StatusResponse }
         *     
         */
        public StatusResponse getStatusResponse() {
            return statusResponse;
        }

        /**
         * Legt den Wert der statusResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusResponse }
         *     
         */
        public void setStatusResponse(StatusResponse value) {
            this.statusResponse = value;
        }

        /**
         * Ruft den Wert der inclusionResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InclusionResponse }
         *     
         */
        public InclusionResponse getInclusionResponse() {
            return inclusionResponse;
        }

        /**
         * Legt den Wert der inclusionResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InclusionResponse }
         *     
         */
        public void setInclusionResponse(InclusionResponse value) {
            this.inclusionResponse = value;
        }

        /**
         * Ruft den Wert der globalKeyResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GlobalKeyResponse }
         *     
         */
        public GlobalKeyResponse getGlobalKeyResponse() {
            return globalKeyResponse;
        }

        /**
         * Legt den Wert der globalKeyResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalKeyResponse }
         *     
         */
        public void setGlobalKeyResponse(GlobalKeyResponse value) {
            this.globalKeyResponse = value;
        }

        /**
         * Ruft den Wert der heartbeatResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link HeartbeatResponse }
         *     
         */
        public HeartbeatResponse getHeartbeatResponse() {
            return heartbeatResponse;
        }

        /**
         * Legt den Wert der heartbeatResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link HeartbeatResponse }
         *     
         */
        public void setHeartbeatResponse(HeartbeatResponse value) {
            this.heartbeatResponse = value;
        }

        /**
         * Ruft den Wert der valueResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ValueResponse }
         *     
         */
        public ValueResponse getValueResponse() {
            return valueResponse;
        }

        /**
         * Legt den Wert der valueResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ValueResponse }
         *     
         */
        public void setValueResponse(ValueResponse value) {
            this.valueResponse = value;
        }

        /**
         * Ruft den Wert der gesResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GesResponse }
         *     
         */
        public GesResponse getGesResponse() {
            return gesResponse;
        }

        /**
         * Legt den Wert der gesResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GesResponse }
         *     
         */
        public void setGesResponse(GesResponse value) {
            this.gesResponse = value;
        }

        /**
         * Ruft den Wert der testResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TestResponse }
         *     
         */
        public TestResponse getTestResponse() {
            return testResponse;
        }

        /**
         * Legt den Wert der testResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TestResponse }
         *     
         */
        public void setTestResponse(TestResponse value) {
            this.testResponse = value;
        }

        /**
         * Ruft den Wert der firmwareResponse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link FirmwareResponse }
         *     
         */
        public FirmwareResponse getFirmwareResponse() {
            return firmwareResponse;
        }

        /**
         * Legt den Wert der firmwareResponse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link FirmwareResponse }
         *     
         */
        public void setFirmwareResponse(FirmwareResponse value) {
            this.firmwareResponse = value;
        }

    }

}
