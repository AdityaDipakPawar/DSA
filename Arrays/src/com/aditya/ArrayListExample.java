package com.aditya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(71);
        list.add(171);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.contains(71));
        System.out.println(list.contains(7));

        System.out.println(list);
        list.set(0,7);
        list.set(3,71);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>(5);

        // input
        for (int i = 0; i < 5; i++) {
            l.add(in.nextInt());
        }

        //output - get item at any index
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i)); // pass index here, l[index] syntax will not work here
        }
    }
}
