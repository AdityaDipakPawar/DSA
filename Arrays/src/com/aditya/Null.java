package com.aditya;

public class Null {
    public static void main(String[] args) /* in this line inside the main function ,
            args is the array of string type*/
    {
        // you can't assign null value to any primitive data type
        String str = null;
        System.out.println(str);
        //int s = null;  // this will show an error
        // this null is compared none in python
        // the value of the variable which is defined but not initialised is going to be a null.

        String[] arr = new String[4];
        System.out.println(arr[0]);  /* the value shows null because array is defined but not initialised,
        So , it shows by default value null*/
    }
}
