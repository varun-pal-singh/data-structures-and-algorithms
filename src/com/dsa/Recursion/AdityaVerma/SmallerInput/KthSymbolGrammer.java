package com.dsa.Recursion.AdityaVerma.SmallerInput;

public class KthSymbolGrammer {
    public static void main(String[] args) {
        System.out.println(solve(2, 2));
    }
    public static boolean solve(int n, int k){
        if(n == 1 && k == 1)    return false;
        int mid = (int) Math.pow(2, n - 1) / 2;
        if(k <= mid){
            return solve(n - 1, k);
        }else{
            return !solve(n - 1, k - mid);
        }
    }
}
