package com.practice.striver.SDE_Sheet.array;
/**
 * Given an array of integers nums and an integer target, return
 * indices of the two numbers such that they add up to target.

 * You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.

 * You can return the answer in any order.

 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]

 * Input: nums = [3,3], target = 6
 * Output: [0,1]

 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.

 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
import java.util.Arrays;
import java.util.HashMap;
public class LC_1_two_sum {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3}, nums2 = {2, 3, 7, 9, 10, 11, 15};
        System.out.println("output for num1 : "+ Arrays.toString(twoSumUnsorted(nums1, 6)));
        System.out.println("output for num1 : "+ Arrays.toString(twoSumSorted(nums2, 14)));
    }
    public static int[] twoSumUnsorted(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[] {map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumSorted(int[] nums, int target) {
        int[] ans = new int[] {-1, -1};
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(target - nums[i] == nums[j]){
                ans[0] = i; ans[1] = j;
                break;
            }
            else if(target - nums[i] < nums[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
