package org.dsa.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProgram {
    public static void main(String[] args){
        String str = "sea shells a sea shore";
        // return highest frequency word
        // output : sea

        String mostFrequent = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))  // Map word -> count
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())  // Find max count
                .map(Map.Entry::getKey)
                .orElse(null);  // Default if empty

        System.out.println(mostFrequent);

    }
}
