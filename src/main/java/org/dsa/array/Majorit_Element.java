package org.dsa.array;

public class Majorit_Element {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 1};
        int res = majorityElement2(nums);
        System.out.println("Res :: "+res);

        int majorityEle = majorityElement3(nums);
        System.out.println("Majority Elem ::: "+majorityEle);
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static int majorityElement2(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int no : nums){
            if(count == 0){
                candidate = no;
            }
            count +=(no == candidate)?1:-1;

        }
        return candidate;
    }

    public static int majorityElement3(int[] nums){
        int count =0;
        int candidate = 0;
        for(int no : nums){
            if(count == 0){
                candidate = no;
            }
            count +=(no==candidate)?1:-1;
        }
        return candidate;
    }
}
