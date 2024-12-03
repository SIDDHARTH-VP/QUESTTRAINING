package com.quest.assessment.playlistmanager.twoquestions;

import java.util.ArrayList;
import java.util.List;

public class ListPartitioner {
    public static List<List<Integer>> partition(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < list.size(); i = i + k) {
            List<Integer> sub;//creating to store the sub
            if (i + k <= list.size()) {//making sure that no AIOB Excep occurs(curr+k should always be less than size)
                sub = list.subList(i, i + k);//sub list
            } else {
                sub = list.subList(i, list.size());
            }
            result.add(new ArrayList<>(sub));

        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int k = 2;
        List<List<Integer>> result = partition(list, k);
        System.out.println(result);
    }
}
