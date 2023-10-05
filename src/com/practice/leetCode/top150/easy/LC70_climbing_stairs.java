package com.practice.leetCode.top150.easy;
import java.util.HashMap;

/**
 * You are climbing a staircase. It takes n steps to reach the
 * top.

 * Each time you can either climb 1 or 2 steps. In how many
 * distinct ways can you climb to the top?

 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps

 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step

 * Constraints:
 * 1 <= n <= 45
 */
public class LC70_climbing_stairs {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("first case: "+climbStairs(5));
//        System.out.println("second case: "+climbStairs(45));

        System.out.println("Memoization: "+memoization(47));
        long endTime = System.currentTimeMillis();
        System.out.println("Time : "+(endTime - startTime)/1000+" seconds");
    }
    public static int climbStairs(int n) {  // TLE
        if(n < 2)
            return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int memoization(int n){   // Memoization
        HashMap<Integer, Integer> memoMap = new HashMap<>();
        return solveMemo(n, memoMap);
    }
    public static int solveMemo(int n, HashMap<Integer, Integer> memoMap){
        if(n <= 1)  return 1;
        if(!memoMap.containsKey(n))
            memoMap.put(n, solveMemo(n-1, memoMap) + solveMemo(n-2, memoMap));
        return memoMap.get(n);
    }
}
