package com.practice.striver.SDE_Sheet.binary_search;
/**
 * You are given a sorted array consisting of only integers
 * where every element appears exactly twice, except for one
 * element which appears exactly once.

 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.

 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2

 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10

 * Constraints:
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 105
 */
public class LC_540_single_element_in_a_sorted_array {
    public static void main (String[] args){
        int[] nums1 = {1,1,2,3,3,4,4,8,8}, nums2 = {3,3,7,7,10,11,11};
        System.out.println("nums1 : "+singleNonDuplicateNaive(nums1));
        System.out.println("nums2 : "+singleNonDuplicateNaive(nums2));
        System.out.println("nums1 : "+singleNonDuplicateOptimal(nums1));
        System.out.println("nums2 : "+singleNonDuplicateOptimal(nums2));
    }
    public static int singleNonDuplicateNaive(int[] nums) {
        int n = nums.length, xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        return xor;
    }
    public static int singleNonDuplicateOptimal(int[] nums){
        int n = nums.length;
        if(n == 1 || nums[0] != nums[1])    return nums[0];
        if(nums[n - 1] != nums[n - 2])  return nums[n - 1];
        int start = 1, end = n - 2;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] != nums[mid - 1] || nums[mid] != nums[mid + 1]){
                return mid;
            }
//            If (i % 2 == 0 and arr[i] == arr[i+1]) or (i%2 == 1 and arr[i] == arr[i-1]), we are in the left half.
//            If (i % 2 == 0 and arr[i] == arr[i-1]) or (i%2 == 1 and arr[i] == arr[i+1]), we are in the right half.
            else if(mid % 2 == 1 && nums[mid] == nums[mid - 1] || mid % 2 == 0 && nums[mid] == nums[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
