package com.urosht.demo;

public class Animal {

    private String name;
    private String sound;
    private int height;
    private Flys flys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Flys getFlys() {
        return flys;
    }

    public void setFlys(Flys flys) {
        this.flys = flys;
    }

    public String tryToFly() {
        return flys.fly();
    }
}
