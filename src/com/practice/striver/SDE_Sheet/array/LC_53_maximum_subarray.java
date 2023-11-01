package com.practice.striver.SDE_Sheet.array;
/**
 * Given an integer array nums, find the subarray with the
 * largest sum, and return its sum.

 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.

 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.

 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4

 * Follow up: If you have figured out the O(n) solution, try
 * coding another solution using the divide and conquer
 * approach, which is more subtle.
 */
public class LC_53_maximum_subarray {
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4}, nums2 = {1}, nums3 = {5,4,-1,7,8};
        System.out.println("Largest subarray sum for nums1 : "+maxSubArray(nums1));
        System.out.println("Largest subarray sum for nums2 : "+maxSubArray(nums2));
        System.out.println("Largest subarray sum for nums3 : "+maxSubArray(nums3));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = 0, currSum = 0;
        if(nums.length == 1)    return nums[0];
        for (int num : nums) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
