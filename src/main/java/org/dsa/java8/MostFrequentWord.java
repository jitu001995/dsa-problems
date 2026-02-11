package org.dsa.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWord {
    public static void main(String[] args){
        String text = "apple banana apple orange banana apple orange";

        Map<String, Long> freqMap = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        // Sort by frequency descending
        freqMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));


        System.out.println("After practice :: ");
        // practice
        Map<String, Long> freqMaps = Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(w->w, Collectors.counting()));

        // sort by frequency descending
        freqMaps.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e-> System.out.println(e.getKey()+" -> "+e.getValue()));


        System.out.println("After practice 3 :: ");
        Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(w->w, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e->System.out.println(e.getKey()+" -> "+e.getValue()));


    }
}
