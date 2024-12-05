package com.quest.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class SecondLarg {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Optional<Integer> first=numbers
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1).
//                findFirst();
//        System.out.println(first.get());

        Consumer<Integer> consumer=i->{
            if(i%2==0){
                System.out.println(i);
            }else{
                System.out.println("odd");
            }
        };

       numbers
               .peek(consumer)
               .forEach( i->{
                   System.out.println("__________________");
        });



    }
}
