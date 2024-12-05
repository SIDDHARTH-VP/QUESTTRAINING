package com.quest.funinter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntFun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Predicate<Integer> condition= num->num%2!=0;
        list.removeIf(condition);
//        System.out.println(list);

        Consumer<List<Integer>> multi= num->{
            for(int i = 0;i<num.size();i++){
                num.set(i,2*num.get(i));
            }
        };

        Supplier<List<Integer>> view=()->list;
        multi.accept(list);
        System.out.println(view.get());
    }
}
