package com.practice.striver.a2Z.binarySearch;
/*
You are given an integer array bloomDay, an integer m and an
integer k.

You want to make m bouquets. To make a bouquet, you need to
use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in
the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able
to make m bouquets from the garden. If it is impossible to make m bouquets return -1.

Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let us see what happened in the first three days.
x means flower bloomed and _ means flower did not bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
 */
public class LC1482_MIn_Days_To_Make_M_Bouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 4, 10 ,2 , 1};
        System.out.println("Minimum days to make m bouquet : "+minDays(bloomDay,2,2));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m * k) return -1;
        int max = Integer.MIN_VALUE;
        for(int i : bloomDay)
            max = Math.max(i, max);
        int left = 1, right = max;
        while(left <= right){
            int mid = left + (right - left)/2;
            int numOfBouquet = findNumOfBouquet(bloomDay, k, mid);
            if(numOfBouquet >= m)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
    public static int findNumOfBouquet(int[] arr, int k, int mid){
        int cnt = 0, numOfBouquet = 0;
        for (int el : arr) {
            if (el <= mid)
                cnt += 1;
            else {
                numOfBouquet += cnt / k;
                cnt = 0;
            }
        }
        numOfBouquet += cnt/k;
        return numOfBouquet;
    }
}
