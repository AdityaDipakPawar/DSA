package com.aditya;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,25,5,71,43};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,2));
    }
    public static int max(int[] arr){
        int maxValue= arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>maxValue){
               maxValue = arr[i];
           }
        }
        return maxValue;
    }
    public static int maxRange(int[] arr, int start, int end){
        int maxValue= arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
