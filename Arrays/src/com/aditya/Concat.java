package com.aditya;

import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        System.out.println(getConcatenation(nums));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length ; i++ ){
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
