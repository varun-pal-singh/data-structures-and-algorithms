package com.dsa.recursion.problems;

public class Print_patterns {
    public static void main (String[] args){
//        pattern1(5, 1);
        pattern2(5, 1);
    }

    /**
     * for(int i = 4; i >= 1; i--){
     *     for(int j = i; j >= 1; j--){
     *         print("* ");
     *     }
     *     println();
     * }
     */
    public static void pattern1(int i, int j){
        if(i <= 0){
            return;
        }
        if(j <= i){
            System.out.print("* ");
            pattern1(i, j + 1);
        }else{
            System.out.println();
            pattern1(i - 1, 1);
        }
    }
    public static void pattern2(int i, int j){
        if(i <= 0) return;
        if(j <= i){
            pattern2(i, j + 1);
            System.out.print("* ");
        }else{
            pattern2(i - 1, 1);
            System.out.println();
        }
    }
}
