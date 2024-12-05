package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModExce {
    public static void main(String[] args) {
        List<String> list1 = new CopyOnWriteArrayList<>();




        for (String s : list1) {
            if(s.equals("a")){
                list1.remove(s);//mod count++
            }
            System.out.println(s);
        }
//        (List<String> list){
//            List<String> list = new ArrayList<String>();
//            list.add("a");
//            list.add("b");
//            list.add("c");
//        }
    }
}
