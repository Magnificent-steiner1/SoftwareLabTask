package com.example.softlab04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication {
    public static void main(String[] args) {

        //general remote operating generalTV
        GeneralTV generalTV1= new GeneralTV();
        Remote remote1 = new Remote(generalTV1);
        remote1.togglePower();
        remote1.volumeUp();




        //general remote operating smartTV
        SmartTV smartTV1= new SmartTV();
        Remote remote2=new Remote(smartTV1);
        remote2.togglePower();
        remote2.channelUp();
        remote2.togglePower();




       //accessing Youtube() on SmartTV
        SmartTV smartTV2= new SmartTV();
        SmartRemote smartRemote= new SmartRemote(smartTV2);
        smartRemote.showYoutube();



    }
}