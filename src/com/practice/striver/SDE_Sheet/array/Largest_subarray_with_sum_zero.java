package com.practice.striver.SDE_Sheet.array;
/**
 * 2
 * nums1 = {1 3 -1 4 -4}
 * nums2 = {1 -1 2 -2}
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Largest_subarray_with_sum_zero {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, -1, 4, -4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, -1, 2, -2));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 1, 1, 2, 6));
        System.out.println("length of largest subarray with sum 0 is "+LongestSubsetWithZeroSumValidForNeqZerosPostives(list1));
        System.out.println("length of largest subarray with sum 0 is "+LongestSubsetWithZeroSumValidForNeqZerosPostives(list2));
        System.out.println("length of largest subarray with sum 0 if arr contains only +ve : "+ longestSubsetWithKSumContainsOnlyPostives(list3, 5));
    }

    public static int LongestSubsetWithZeroSumValidForNeqZerosPostives(ArrayList<Integer> arr) {
        // arr contains -ve, zero, and +ve than this is optimal
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.size(), curr_size = 0, max_size = 0, prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += arr.get(i);
            if(prefixSum == 0)  curr_size = i;
//            int rem = prefixSum;
            curr_size += map.getOrDefault(prefixSum, 0);
            map.put(prefixSum, i);
            max_size = Math.max(max_size, curr_size);
        }
        return max_size;
    }
    public static int longestSubsetWithKSumContainsOnlyPostives(ArrayList<Integer> list, int k){
        // [1, 3, 2, 1, 1, 1, 2, 6]
        int n = list.size(), prefixSum = 0;
        int left = 0, right = 0, maxLen = 0;
        while(right < n){
            prefixSum += list.get(right);
            while(left <= right && prefixSum > k){
                prefixSum -= list.get(left++);
            }
            if(prefixSum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}
