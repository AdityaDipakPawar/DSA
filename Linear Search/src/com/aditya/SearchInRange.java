package com.aditya;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(LinearSearch(nums, target, 1 , 4));
    }
    public static int LinearSearch(int[] nums, int target, int start, int end){
        if(nums.length==0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
