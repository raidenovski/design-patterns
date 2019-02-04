package com.urosht.demo.devices.impl;

import com.urosht.demo.devices.Device;

public class Radio implements Device {

    private static final int MAX_VOLUME = 100;
    private boolean on;
    private int volume;
    private int channel;

    public Radio() {
        this.on = false;
        this.volume = 30;
        this.channel = 1;
    }

    public boolean isEnabled() {
        return on;
    }

    public void toggleEnabled() {
        this.on = !this.on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (this.volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void printStatus() {
        System.out.println("-----------------------------------");
        System.out.println("| I am a radio:");
        System.out.println("| I am " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("-----------------------------------");
    }
}
