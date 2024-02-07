package com.example.softlab04;

public class Remote {
    private TV tv;
    public Remote(TV tv)
    {
        this.tv=tv;
    }
    void togglePower()
    {
        System.out.println("Power button clicked");
        if(tv.isEnabled())
            {
                tv.disable();
            }
        else tv.enable();
    };
    void volumeUp(){
        System.out.println("Volume up button clicked");
        int vol=tv.getVolume();
        tv.setVolume(++vol);

    };
    void volumeDown(){
        System.out.println("Volume down button clicked");
        int vol=tv.getVolume();
        tv.setVolume(--vol);
    };
    void channelUp(){
        System.out.println("Channel up button clicked");
        int chan=tv.getChannel();
        tv.setChannel(++chan);
    }
    void channelDown(){
        System.out.println("Channel down button clicked");
        int chan=tv.getChannel();
        tv.setChannel(--chan);
    }

}
