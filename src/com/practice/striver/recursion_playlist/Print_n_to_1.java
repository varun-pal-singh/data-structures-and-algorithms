package com.practice.striver.recursion_playlist;

public class Print_n_to_1 {
    public static void main(String[] args){
        int n = 1000;
        print(n);
    }
    public static void print(int n){
        if(n <= 1){
            System.out.println("and "+n);
            return;
        }else{
            System.out.print(n+", ");
            print(n - 1);
        }
    }
}
