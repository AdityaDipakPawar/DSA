package com.aditya;

import java.util.Scanner;

public class election {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0,b = 0,c;
        int n = 10;
        for (int i = 0; i < n; i++) {
            c = in.nextInt();
            if ( c== 0){
                a++;
            } else if ( c == 1){
                b++;
            }
        }
        System.out.println("votes of a:" + a);
        System.out.println("votes of b:" +b);
    }
}
