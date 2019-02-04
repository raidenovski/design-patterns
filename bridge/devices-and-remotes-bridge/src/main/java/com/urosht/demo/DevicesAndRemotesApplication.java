package com.urosht.demo;

import com.urosht.demo.devices.Device;
import com.urosht.demo.devices.impl.Radio;
import com.urosht.demo.devices.impl.Tv;
import com.urosht.demo.remotes.impl.AdvancedRemote;
import com.urosht.demo.remotes.impl.BasicRemote;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class DevicesAndRemotesApplication {

    public static void main(String[] args) {

        testDevice(new Tv());
        testDevice(new Radio());
    }


    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.channelUp();
        advancedRemote.mute();
        device.printStatus();

    }

}
