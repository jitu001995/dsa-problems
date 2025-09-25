package org.dsa.string;

import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        String[] words = {"bat" ,"tab", "cat","act"};

        List<List<String>> groupedList = groupedAnagram(words);
        groupedList.forEach(System.out::println);
    }

    private static List<List<String>> groupedAnagram(String[] words) {
        Map<String,List<String>> groupedMap = new HashMap<>();

        for(String word : words){
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);

            String sortedWord = new String(charArr);
            groupedMap.computeIfAbsent(sortedWord, k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groupedMap.values());
    }

}
