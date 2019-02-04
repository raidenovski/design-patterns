package com.urosht.demo.devices;

public interface Device {

    boolean isEnabled();
    void toggleEnabled();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
