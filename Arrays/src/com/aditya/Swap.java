package com.aditya;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int Index1, int Index2){
        int temp = arr[Index1];
        arr[Index1] = arr[Index2];
        arr[Index2] = temp;
    }
}
