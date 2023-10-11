package com.dsa.recursion.Numbers;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sum = sumOfNaturalNum(10);
        System.out.println(sum);
    }
    public static  int sumOfNaturalNum(int num){
        if(num <= 1){
            return 1;
        }
        return num + sumOfNaturalNum(num - 1);

    }
}
