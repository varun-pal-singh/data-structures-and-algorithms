package com.practice.striver.recursion_playlist.easy;

public class Pow_x_n {
    public static void main(String[] args){
        double x1 = 2, x2 = 5;
        int n1 = -2, n2 =  100;
        System.out.println(pow_naive(x1, n1));
        System.out.println(pow_optimal(x2, n2));
    }
    public static double pow_naive(double x, int n){
        if(n < 0){
            x = 1 / x;
            n = n * -1;
        }
        else if(n == 0){
            return 1;
        }
        return x * pow_naive(x, n - 1);
    }
    public static double pow_optimal(double x, int n){
        if(n < 0){
            x = 1 / x;
            n = n * -1;
        }
        else if(n == 0){
            return 1;
        }
        else if(n % 2 == 0){
            return pow_optimal(x * x, n / 2);
        }
        return x * pow_optimal(x, n - 1);
    }
}
