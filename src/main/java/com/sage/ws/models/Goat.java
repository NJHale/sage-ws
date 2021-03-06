package com.sage.ws.models;

/**
 * Created by root on 2/18/16.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Goat {

    private static int latestGoatId = 0;

    private int goatId;

    private int age;

    private int aggression;

    private double weight;

    public Goat() {
        // set and increment goatId
        goatId = latestGoatId++;
    }

    @XmlElement(name = "goatId")
    public int getGoatId() {
        return goatId;
    }

    public void setGoatId(int goatId) {
        this.goatId = goatId;
    }

    @XmlElement(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement(name = "aggression")
    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    @XmlElement(name = "weight")
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
