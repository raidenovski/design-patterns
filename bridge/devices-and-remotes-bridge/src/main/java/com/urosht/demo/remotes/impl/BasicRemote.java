package com.urosht.demo.remotes.impl;

import com.urosht.demo.devices.Device;
import com.urosht.demo.remotes.Remote;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Remote: toggle power");
            device.toggleEnabled();
    }

    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}
