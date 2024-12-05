package com.quest.practice_vars.multipleinheritance.example;

import java.util.ArrayList;
import java.util.List;

public class ListLongSubStr {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("flower");
        list.add("flow");
        list.add("fly");

        String initial=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String current=list.get(i);
            for (int j = 0; j < initial.length(); j++) {}


        }


    }
}
