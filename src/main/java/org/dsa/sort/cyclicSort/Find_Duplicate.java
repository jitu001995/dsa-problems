package org.dsa.sort.cyclicSort;

public class Find_Duplicate {
    public static void main(String[] args){
       int[] nums = {1,3,4,2,2};
       int result = findDuplicate(nums);
       System.out.println("Duplicate :: "+result);
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIdx = nums[i] - 1;
                if (nums[i] == nums[correctIdx]) {
                    return nums[i];
                }
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
