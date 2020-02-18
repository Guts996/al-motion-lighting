package com.ALuniv25.MotionLighting.ReadingData;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int motion;
    private int light;
    private int led;

    public Reading() {
        
    }

    public Reading(int motion,int light,int led){
        this.motion=motion;
        this.light=light;
        this.led=led;
    }

    /**
     * @return int return the motion
     */
    public int getMotion() {
        return motion;
    }

    /**
     * @param motion the motion to set
     */
    public void setMotion(int motion) {
        this.motion = motion;
    }

    /**
     * @return int return the light
     */
    public int getLight() {
        return light;
    }

    /**
     * @param light the light to set
     */
    public void setLight(int light) {
        this.light = light;
    }

    /**
     * @return int return the led
     */
    public int getLed() {
        return led;
    }

    /**
     * @param led the led to set
     */
    public void setLed(int led) {
        this.led = led;
    }

}