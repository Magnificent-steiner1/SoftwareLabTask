package com.example.softlab04;

public class SmartRemote extends Remote{
    private SmartTV smartTV;
    public SmartRemote(SmartTV smartTV) {
        super(smartTV);
        this.smartTV = smartTV;
    }
    void showYoutube(){
        System.out.println("Youtube button is clicked");
        smartTV.YouTube();
    }
}
