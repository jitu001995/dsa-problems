package org.dsa.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap_Value_Using_Stream {

    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();

        map.put("grapes", 30);
        map.put("Apple", 10);
        map.put("PineApple", 40);
        map.put("banana",15);

      System.out.println(" Map :: "+map);
        Map<String, Integer> newMap  =   map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue)->oldValue,
                LinkedHashMap::new

        ));

        System.out.println("New Map :: "+newMap);
    }
}
