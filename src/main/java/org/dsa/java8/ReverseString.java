package org.dsa.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args){
        String str="java";

        String revStr = Arrays.stream(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        System.out.println("Reverse String ::"+revStr);


        String str1="hello";
        String rev = Arrays.stream(str1.split(""))
                      .sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        System.out.println("Rev :: "+rev);

    }
}
