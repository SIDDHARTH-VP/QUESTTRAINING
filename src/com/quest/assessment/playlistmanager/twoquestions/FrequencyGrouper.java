package com.quest.assessment.playlistmanager.twoquestions;

import java.util.*;

public class FrequencyGrouper {

    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (Integer num : numbers) { //numbers is containing the list so iterate the list
            if (frequencyMap.containsKey(num)) {//cheching if curr num alredy exist in the map
                frequencyMap.put(num, frequencyMap.get(num) + 1);//if found increment the freq by 1
            } else {
                frequencyMap.put(num, 1);//else add the num and initialize the freq as 1
            }
        }
        //so this will give a map of all the mum and its freq

        Map<Integer, List<Integer>> grpByFrq = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {//want to iterate through each key and val pair
            int number = entry.getKey();//[1,2,3]-numbers
            int frequency = entry.getValue();
            if (!grpByFrq.containsKey(frequency)) {//checking freq is alredy a key if not adding the freq as key
                grpByFrq.put(frequency, new ArrayList<>());
            }
            grpByFrq.get(frequency).add(number);
        }
        return grpByFrq;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);

        System.out.println("The List is " + numbers);
        Map<Integer, List<Integer>> result = groupByFrequency(numbers);
        System.out.println(result);
    }
}
