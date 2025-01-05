package com.aditya.intro;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,32,64,74};
        int target = 32;
        System.out.println(search(arr,target, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if ( s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }
        return search(arr, target, mid + 1, e);
    }
}
