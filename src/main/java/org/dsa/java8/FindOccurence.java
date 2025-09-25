package org.dsa.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindOccurence {
    public static void main(String[] args) {
        String str ="hellolo";

        Map<String,Long> map = Arrays.stream(str.split(""))
                                  .collect(Collectors.groupingBy(Function.identity(),
                                          Collectors.counting()));

        System.out.println("Mapped data occurence");
        System.out.println(map);

        /*Using character*/
        Map<Character,Long> charMap = str.chars()
                                       .mapToObj(c->(char)c)
                                       .collect(Collectors.groupingBy(Function.identity(),
                                               Collectors.counting()));

        System.out.println("Char Map :: "+charMap);

    Character ch =  str.chars().mapToObj(c->(char)c).collect(
                Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting())
                 ).entrySet().stream()
            .filter(c-> c.getValue()==1)
            .map(Map.Entry::getKey)
            .findFirst().orElse(null);

     System.out.println("First uniq CHaracter ::"+ch);
    }
}
