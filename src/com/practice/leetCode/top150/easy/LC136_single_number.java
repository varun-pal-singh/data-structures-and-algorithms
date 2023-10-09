package com.practice.leetCode.top150.easy;
/**
 * Given a non-empty array of integers nums, every element
 * appears twice except for one. Find that single one.

 * You must implement a solution with a linear runtime
 * complexity and use only constant extra space.

 * Input: nums = [2,2,1]
 * Output: 1

 * Input: nums = [4,1,2,1,2]
 * Output: 4

 * Input: nums = [1]
 * Output: 1

 * Constraints:
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * Each element in the array appears twice except for one
 *  element which appears only once.
 */
import java.util.HashMap;
public class LC136_single_number {
    public static void main(String[] args) {
        int[] nums = {2,2,1}, nums1 = {4,1,2,1,2};
        System.out.println("single number naive : " + singleNumber1(nums));
        System.out.println("single number optimal : " + singleNumber2(nums1));

    }
    public static int singleNumber1(int[] nums) {
        if(nums.length == 1)    return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(map.get(num) == 1)
                return num;
        }
        return -1;
    }
    public static int singleNumber2(int[] nums){
//        [4,1,2,1,2]
        if(nums.length == 1)    return nums[0];
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}
