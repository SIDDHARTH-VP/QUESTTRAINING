package com.quest.funinter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StdConFun {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Jhon");
        students.add("Jane");
        students.add("Paul");
        students.add("Maryy");
        students.add("Rohn");

        Consumer<String> printUCase=name ->
                System.out.println("Name: "+name.toUpperCase());
        Consumer<String> PrintLen=name ->
                System.out.println("Length: "+name.length());
        Predicate<String> condition=name ->
        {
            if(name.length()>4){
                System.out.println("The name len is greater than 4"+name);
                return true;
            }else{
                System.out.println("The name len is less than or equal to  4"+name);
                return false;
            }

        };
        Supplier<String> getOne= ()->{
            for(String name:students){
                if(name.equalsIgnoreCase("Jhon")){
                    return "Student with name "+name+"is found";
                }
            }
            return "No student found";


        };

        for(String name : students){
            printUCase.accept(name);
            PrintLen.accept(name);
            condition.test(name);
        }
        System.out.println(getOne.get());

    }
}
