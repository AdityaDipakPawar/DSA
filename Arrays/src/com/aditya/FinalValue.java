package com.aditya;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValue {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int n = operations.length;
        for (int i = 0; i < n; i++) {
//            if (operations[i].equals("X++")){
//                x++;
//            }
//            if (operations[i].equals("++X")){
//                x++;
//            }
//            if (operations[i].equals("X--")){
//                x--;
//            }
//            if (operations[i].equals("--X")){
//                x--;
//            }
//
//        }
            if (operations[i].charAt(1) == '+') {
                x++;
            } else {
                x--;
            }

        }
        return x;
    }
}
