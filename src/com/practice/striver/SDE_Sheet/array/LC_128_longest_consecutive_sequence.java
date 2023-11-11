package com.practice.striver.SDE_Sheet.array;

/**
 * Given an unsorted array of integers nums, return the length
 * of the longest consecutive elements sequence.

 * You must write an algorithm that runs in O(n) time.

 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.

 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9

 * Constraints:
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
import java.util.Arrays;
public class LC_128_longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println("Longest consecutive sequence : "+longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 2)   return n;
        Arrays.sort(nums);
        int lastEl = Integer.MIN_VALUE;
        int cnt = 0, longest = 0;
        for(int i = 0; i < n; i++){
            if(lastEl == nums[i] - 1){
                cnt += 1;
            }else if(lastEl != nums[i]){
                cnt = 1;
            }
            lastEl = nums[i];
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
