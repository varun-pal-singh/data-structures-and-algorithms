package com.practice.striver.SDE_Sheet.array;

import java.util.Arrays;

/**
 * Given an array nums with n objects colored red, white, or
 * blue, sort them in-place so that objects of the same color
 * are adjacent, with the colors in the order red, white, and blue.

 * We will use the integers 0, 1, and 2 to represent the color
 * red, white, and blue, respectively.

 * You must solve this problem without using the library's sort function.

 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]

 * Input: nums = [2,0,1]
 * Output: [0,1,2]

 * Constraints:
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is either 0, 1, or 2.

 * Follow up: Could you come up with a one-pass algorithm using
 * only constant extra space?
 */
public class LC_75_sort_colors {
    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0}, nums2 = {2,0,1};
        sortColors(nums1); sortColors(nums2);
        System.out.println("nums1 : "+ Arrays.toString(nums1));
        System.out.println("nums2 : "+ Arrays.toString(nums2));
    }
    // Kadane's algorithm
    public static void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;
        while(mid <= end){
            // if 0, then swap it with the startIdx and move both startIdx and midIdx by 1
            if(nums[mid] == 0){
                swap(nums, start, mid);
                start += 1;
                mid += 1;
            }else if (nums[mid] == 2){
                swap(nums, mid, end);
                end -= 1;   // don't move mid here as we don't know what endIdx contains ?
            }else{
                mid += 1;   // if its 1
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
