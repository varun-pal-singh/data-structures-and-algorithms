package com.practice.leetCode.top150.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
Given an array of integers nums and an integer target, return
 indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
 and you may not use the same element twice.

You can return the answer in any order.

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 */
public class LC1_two_sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}, nums1 = {3,2,4};
        int target = 9, target1 = 6;
        System.out.println("first condition "+ Arrays.toString(twoSum(nums, target)));
        System.out.println("first condition "+ Arrays.toString(twoSum(nums1, target1)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[] {i, map.get(rem)};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
