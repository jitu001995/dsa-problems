package org.dsa.java8;

import java.util.List;

public class find_smallest_numer {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 1, 8, 2, 5, 19, 3);
        System.out.println("Min Val "+getMin(numbers));
        System.out.println("Min Val 2 :: "+getMin2(numbers));

        System.out.println(" Min val 3 :: "+getMin3(numbers));

        System.out.println(" Max val 4 :: "+getMax4(numbers));
    }

    public static int getMin(List<Integer> numbers){
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?y:x);
    }

    public static int getMin2(List<Integer> numbers){
        return numbers.stream().min(Integer::compareTo).get();
    }

    public static int getMin3(List<Integer> numbers){
        return numbers.stream().min(Integer::compareTo).get();
    }

    public static int getMax4(List<Integer> numbers){
        return numbers.stream().max(Integer::compareTo).get();
    }


}
