package com.practice.striver.SDE_Sheet.array;
/**
 * A permutation of an array of integers is an arrangement of
 * its members into a sequence or linear order.

 * For example, for arr = [1,2,3], the following are all the
 * permutations of arr: [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].
 * The next permutation of an array of integers is the next
 * lexicographically greater permutation of its integer. More
 * formally, if all the permutations of the array are sorted in
 * one container according to their lexicographical order, then
 * the next permutation of that array is the permutation that
 * follows it in the sorted container. If such arrangement is
 * not possible, the array must be rearranged as the lowest
 * possible order (i.e., sorted in ascending order).

 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3]
 * because [3,2,1] does not have a lexicographical larger rearrangement.

 * Given an array of integers nums, find the next permutation of nums.
 * The replacement must be in place and use only constant extra memory.

 * Input: nums = [1,2,3]
 * Output: [1,3,2]

 * Input: nums = [3,2,1]
 * Output: [1,2,3]

 * Input: nums = [1,1,5]
 * Output: [1,5,1]

 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
import java.util.ArrayList;
import java.util.Arrays;
public class LC_31_next_permutation {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 3, 1}, nums3 = {3, 2, 1}, nums4 = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(nums1);
        System.out.println("nums1 : "+Arrays.toString(nums1));
        nextPermutation(nums2);
        System.out.println("nums2 : "+Arrays.toString(nums2));
        nextPermutation(nums3);
        System.out.println("nums3 : "+Arrays.toString(nums3));
        nextPermutation(nums4);
        System.out.println("nums4 : "+Arrays.toString(nums4));
    }
    public static void nextPermutation(int[] nums) {
        int idx = -1;
        // find idx of element just before the peak
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, nums.length - 1);
        }
        else{
            int idxOfGreater = -1;
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[idx]){
                    idxOfGreater = i;
                }
            }
            swap(nums, idx, idxOfGreater);
            reverse(nums, idx + 1, nums.length - 1);
        }
    }
//    public static int findIdxOfGreater(int[] nums, int idx){
//        int idxOfGreater = -1;
//        for(int i = nums.length - 1; i >= 0; i--){
//            if(nums[i] > nums[idx]){
//                return i;
//            }
//        }
//        return -1;
//    }
    public static void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i += 1;
            j -= 1;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
