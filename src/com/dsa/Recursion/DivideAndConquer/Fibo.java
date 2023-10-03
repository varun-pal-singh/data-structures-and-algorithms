package com.dsa.Recursion.DivideAndConquer;

public class Fibo {
    public static void main(String[] args) {
        int result = fibo(600);
        System.out.println(result);
    }
    public static int fibo(int num){
        if(num <= 1)    return num;
        return fibo(num - 1) + fibo(num - 2);
    }
}
