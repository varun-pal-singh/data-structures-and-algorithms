package com.practice.striver.SDE_Sheet.array;

/**
 * Given an array of integers nums and an integer k, return the
 * total number of subarrays whose sum equals to k.

 * A subarray is a contiguous non-empty sequence of elements
 * within an array.

 * Input: nums = [1,1,1], k = 2
 * Output: 2

 * Input: nums = [1,2,3], k = 3
 * Output: 2

 * Constraints:
 * 1 <= nums.length <= 2 * 10^4
 * -1000 <= nums[i] <= 1000
 * -10^7 <= k <= 10^7
 */
import java.util.HashMap;
public class LC_560_subarray_sum_equals_k {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2, 6, 3, 2, 7, 9, 1, 1};
        int target1 = 3, target2 = 11;
        System.out.println("no of subarray that add up to "+target1+" are : "+subarraySum(nums1, target1));
        System.out.println("no of subarray that add up to "+target2+" are : "+subarraySum(nums2, target2));
    }
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length, cnt = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            if(prefixSum == k)  cnt += 1;
            int remaining = prefixSum - k;
            cnt += map.getOrDefault(remaining, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return cnt;
    }
}
