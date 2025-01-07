package com.aditya.easy;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        fun(n--);  //This gives infinite loop
        fun(--n);
    }
}
