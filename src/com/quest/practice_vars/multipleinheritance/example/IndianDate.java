package com.quest.practice_vars.multipleinheritance.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IndianDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date currentDate = new Date();
        System.out.println(sdf.format(currentDate));
        System.out.println(currentDate);
    }
}
