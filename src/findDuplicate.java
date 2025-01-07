package com.aditya;

public class findDuplicate {
    public static void main(String[] args) {

    }
//    public int findDuplicate(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i] - 1;
//            if (nums[i] < nums.length && nums[i] != nums[correct]) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] != index + 1) {
//                return nums[index];
//            }
//        }
//
//        return nums.length;
//    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }


    public void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
