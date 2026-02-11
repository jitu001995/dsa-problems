package org.dsa.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWord2 {
    public static void main(String[] args){

        String text = "apple banana apple orange banana apple orange";

        // Step 1: Create frequency map
        Map<String, Long> freqMap =
                Arrays.stream(text.split("\\s+"))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        // Step 2: Use max() to get the entry with highest value
        Map.Entry<String, Long> maxEntry =
                freqMap.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .orElse(null);

        // Step 3: Print result
        if (maxEntry != null) {
            System.out.println("Most frequent word: "
                    + maxEntry.getKey() + " -> " + maxEntry.getValue());
        }
    }
}
