package com.ALuniv25.MotionLighting.ReadingData;

public class ArduinoResponse {
    private int motion;
    private int light;
    private int led;

    public ArduinoResponse(int motion,int light,int led){
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
