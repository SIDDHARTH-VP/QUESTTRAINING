package com.quest.oops.inheritance;

public class Watsapp3  extends Watsapp2 {
    @Override
    void sendMessage() {
        super.sendMessage();
        System.out.println("Blue tick");
    }

    @Override
    void story() {
        super.story();
        System.out.println("Image and video");
    }
    void payment(){
        System.out.println("Payment");
    }
}
