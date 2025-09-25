package org.dsa.array;

public class Container_with_most_water {
    public  static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
     int result = maxArea(height);
     System.out.println("Result ::"+result);
    }
    public static  int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
