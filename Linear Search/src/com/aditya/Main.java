package com.aditya;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,25,3,4,84,71,6,54,21,21};
        int target = 71;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return index if item found
    // otherwise return -1
    public static int LinearSearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
