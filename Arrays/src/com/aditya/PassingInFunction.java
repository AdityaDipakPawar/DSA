package com.aditya;
import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));


    }

    static void change(int[] num) {
        num[1]= 71;
    }  // Strings are immutable and arrays are mutable in java i.e. can change the objects of array
}
