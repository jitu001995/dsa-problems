package org.dsa.java8;

import java.util.List;

public class find_smallest_numer {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 1, 8, 2, 5, 19, 3);
        System.out.println("Min Val "+getMin(numbers));
        System.out.println("Min Val 2 :: "+getMin2(numbers));
    }

    public static int getMin(List<Integer> numbers){
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?y:x);
    }

    public static int getMin2(List<Integer> numbers){
        return numbers.stream().min(Integer::compareTo).get();
    }


}
