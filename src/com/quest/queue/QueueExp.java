package com.quest.queue;

import java.util.*;

public class QueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(8);
        pq.add(5);
        pq.add(7);
        pq.add(9);

        //inserton order is preserved


//        pq.forEach(System.out::println);
//        Iterator<Integer> it = pq.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        //Its following FIFO
        pq2.add("ac");
        pq2.add("ad");
        pq2.add("ae");
        pq2.add("af");
        pq2.add("ag");

        //pq2.forEach(System.out::println);

        //System.out.println(pq2.size());
//        System.out.println(pq2.peek());
        pq2.poll();//Removing the element(POP)


//        System.out.println(pq2.size());
//        //pq2.clear();
//        System.out.println(pq2.add("Abc"));
//        System.out.println(pq2.offer("af"));//inserting similar to add
        //System.out.println(pq2.remove());//remove the first element
        Spliterator<String> spliterator = pq2.spliterator();
        //System.out.println(pq2.spliterator());
        //pq2.forEach(System.out::println);



        Stack<String> stack = new Stack<>();
        //Its following LIFO
        stack.push("ac");
        stack.push("ad");
        stack.push("ae");
        stack.push("af");
        stack.push("ag");
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());





    }
}
