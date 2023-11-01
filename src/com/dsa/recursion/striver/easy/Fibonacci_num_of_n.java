package com.dsa.recursion.striver.easy;
import java.util.HashMap;
public class Fibonacci_num_of_n {
    public static void main(String[] args){
        int n = 10, n1 = 45;
        System.out.println("Fibonacci num for "+n+" is "+fiboNaive(n));
        System.out.println("Fibonacci num for "+n1+" is "+fiboOptimal(n1));
    }
    public static int fiboNaive(int n){
        if(n <= 0)  return 0;
        else if(n <= 2) return 1;
        else return fiboNaive(n - 2) + fiboNaive(n - 1);
    }
    public static int fiboOptimal(int n){
        HashMap<Integer, Integer> memoMap = new HashMap<>();
        return solveUsingMemoization(n, memoMap);
    }
    public static int solveUsingMemoization(int n, HashMap<Integer, Integer> memoMap){
        if(n <= 0)  return 0;
        else if(n <= 2) return 1;
        else if(!memoMap.containsKey(n)){
            memoMap.put(n, solveUsingMemoization(n - 2, memoMap) + solveUsingMemoization(n - 1, memoMap));
        }
        return memoMap.get(n);
    }
}
