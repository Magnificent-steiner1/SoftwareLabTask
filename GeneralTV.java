package com.example.softlab04;

public class GeneralTV implements TV{
    public boolean powerOn = false;
    int volume = 0;
    int channel=1;
    @Override
    public boolean isEnabled() {
        return powerOn;
    }

    @Override
    public void enable() {
        powerOn=true;
        System.out.println("The TV is on");
    }

    @Override
    public void disable() {
        powerOn=false;
        System.out.println("The TV is off");

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
        System.out.println("Volume set to "+volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
        System.out.println("Channel set to "+channel);

    }
}
