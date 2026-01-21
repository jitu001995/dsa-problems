package org.dsa.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysSort {
    public static void main(String[] args){
        List<Integer> al  = Arrays.asList(1,56,239,9,0,100,234,67);
        List<Integer> al2  = Arrays.asList(100,563,239,94,2,100,234,678);


        Set<Integer> hs = new HashSet<>();

        // finrd
       // al.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();


       // find max Number using reduce
        System.out.println("Max Number from list :: ");
        System.out.println(al.stream().reduce(Integer.MIN_VALUE, Integer::max));

        // find duplicate in a list
       List<Integer> dup = al.stream().filter(i-> !hs.add(i)).toList();
       System.out.println(dup);

     Map<Boolean, List<Integer>> partionList =  al.stream().collect(Collectors.partitioningBy(i->i%2==0));

     System.out.println("Even or Odd :: "+partionList);
     System.out.println("Even number list :: "+partionList.get(true));
        System.out.println("Odd number list :: "+partionList.get(false));

        // comman elemetn between two list
     List<Integer> commonEle =  al.stream().filter(al2::contains).distinct().toList();
      System.out.println("common Ele :: "+commonEle);

    }
}
