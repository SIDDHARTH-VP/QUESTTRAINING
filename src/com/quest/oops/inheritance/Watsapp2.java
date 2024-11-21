package com.quest.oops.inheritance;

public class Watsapp2 extends Watsapp1 {
    @Override
    void sendMessage() {
        super.sendMessage();
        System.out.println("double tick sendMessage");
    }
    void story(){
        System.out.println(" TXT Msg only");
    }
}
