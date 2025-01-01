package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Array of Primitives
        // input using for loop
        int[] arr = new int[5];
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        // output using for loop
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // Enhanced for loop which is also known as for each loop
        for (int num:arr) // for every element in the array, print the array
        {
            System.out.println(num + " "); // here num represent element of the array
        }
        System.out.println();

        //System.out.println(arr[5]); // shows Array Index out of bound error

        // 3rd way to print array is using Arrays.toString
        // this is built-in method in which it uses a for loop to print array and gives array with
        //brackets, comma and this is the best way to print an array
        System.out.println(Arrays.toString(arr));

        //2. Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1]="Adi";
        System.out.println(Arrays.toString(str));

    }
}
