package com.practice.striver.SDE_Sheet.array;
/**
 * Given an array of integers nums containing n + 1 integers
 * where each integer is in the range [1, n] inclusive.

 * There is only one repeated number in nums, return this repeated number.

 * You must solve the problem without modifying the array nums
 * and uses only constant extra space.

 * Input: nums = [1,3,4,2,2]
 * Output: 2

 * Input: nums = [3,1,3,4,2]
 * Output: 3

 * Constraints:
 * 1 <= n <= 10^5
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * All the integers in nums appear only once except for
 * precisely one integer which appears two or more times.

 * Follow up:
 * How can we prove that at least one duplicate number must exist in nums?
 * Can you solve the problem in linear runtime complexity?
 */
import java.util.HashMap;
public class LC_287_find_the_duplicate_number {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println("Duplicate : "+ findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // inserting
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) == 2){
                return num;
            }
        }
        return -1;
    }
}
