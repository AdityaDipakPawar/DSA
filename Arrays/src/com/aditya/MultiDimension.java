package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][3]; // only row size is mandatory
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(arr[1]));

        int[][] arr2D = {
                {1,2,3},{4,5},{6,7,8,9}
        };
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));

        // arr.length is gives the number of rows
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        //output 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //output2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //output 3
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
