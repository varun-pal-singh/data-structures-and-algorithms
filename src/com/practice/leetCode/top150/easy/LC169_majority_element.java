package com.practice.leetCode.top150.easy;
/**
 * Given an array nums of size n, return the majority element.

 * The majority element is the element that appears more than
 * ⌊n / 2⌋ times. You may assume that the majority element
 * always exists in the array.

 * Input: nums = [3,2,3]
 * Output: 3

 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2

 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109

 * Follow-up: Could you solve the problem in linear time and
 * in O(1) space?
 */
import java.util.HashMap;
public class LC169_majority_element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("Majority El : "+ majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for(int num : nums){
            if(map.get(num) >= nums.length / 2 + 1){
                System.out.println(map.get(num));
                return num;
            }
        }
        return -1;
    }
}
