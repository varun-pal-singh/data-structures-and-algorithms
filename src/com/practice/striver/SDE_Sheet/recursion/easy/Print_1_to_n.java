package com.practice.striver.SDE_Sheet.recursion.easy;

public class Print_1_to_n {
    public static void main(String[] args){
        int n = 10;
        print(1, n);
    }
    public static void print(int i, int n){
        if(i == n){
            System.out.print("and "+n);
            return;
        }
        else{
            System.out.print(i+", ");
            print(i + 1, n);
        }
    }
}
