package com.practice.striver.SDE_Sheet.array;
/**
 * 2
 * nums1 = {1 3 -1 4 -4}
 * nums2 = {1 -1 2 -2}
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Largest_subarray_with_sum_zero {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, -1, 4, -4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, -1, 2, -2));
        System.out.println("length of largest subarray with sum 0 is "+LongestSubsetWithZeroSum(list1));
        System.out.println("length of largest subarray with sum 0 is "+LongestSubsetWithZeroSum(list2));
    }
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int n = arr.size(), curr_size = 0, max_size = 0, prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += arr.get(i);
            if(prefixSum == 0)  curr_size = i;

        }
        return prefixSum;
    }
}
