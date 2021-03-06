package com.sage.ws.models;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Nick Hale on 2/21/16.
 * @author Nick Hale
 *         NJohnHale@gmail.com
 *
 */
@XmlRootElement
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "android_node")
public class AndroidNode {

    /**
     * Instance variables annotated with Hibernate mappings
     */

    // Unique android node Id
    @Column(name = "android_id")
    private String androidId;

    @Id
    @GeneratedValue
    @Column(name = "node_id")
    private int nodeId;

    @Column(name = "owner_id")
    private int ownerId;

    @Column(name = "info")
    private String info;

    public AndroidNode(){
        // set and increment computeId
        //computeId = latestComputeId++;
    }

    /**
     * Getters and Setters annotated with Jersey mappings
     */

    @XmlElement(name = "androidId")
    public String getAndroidId() { return androidId; }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    @XmlElement(name = "nodeId")
    public int getNodeId(){
        return nodeId;
    }

    public void setNodeId(int nodeId){
        this.nodeId = nodeId;
    }

    @XmlElement(name = "ownerId")
    public int getOwnerId(){
        return ownerId;
    }

    public void setOwnerId(int ownerId){
        this.ownerId = ownerId;
    }

    @XmlElement(name = "info")
    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }

}
