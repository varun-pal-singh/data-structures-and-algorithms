package com.practice.striver.SDE_Sheet.array;

/**
 * Given an integer array nums, return the number of reverse pairs in the array.

 * A reverse pair is a pair (i, j) where:

 * 0 <= i < j < nums.length and
 * nums[i] > 2 * nums[j].

 * Input: nums = [1,3,2,3,1]
 * Output: 2
 * Explanation: The reverse pairs are:
 * (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
 * (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

 * Input: nums = [2,4,3,5,1]
 * Output: 3
 * Explanation: The reverse pairs are:
 * (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
 * (2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
 * (3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1

 * Constraints:
 * 1 <= nums.length <= 5 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class LC_493_reverse_pairs {
    public static void main(String[] args) {
        int[] nums1 = {1,3,2,3,1}, nums2 = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println("Naive output for nums1 : "+reversePairsNaive(nums1));
        System.out.println("Naive output for nums2 : "+reversePairsNaive(nums2));

//        System.out.println("Optimal output for nums1 : "+reversePairsOptimal(nums1));
//        System.out.println("Optimal output for nums2 : "+reversePairsOptimal(nums2));
    }
    public static int reversePairsNaive(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > 2 * nums[j]){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    public static int reversePairsOptimal(int[] nums){

        return -1;
    }
}
