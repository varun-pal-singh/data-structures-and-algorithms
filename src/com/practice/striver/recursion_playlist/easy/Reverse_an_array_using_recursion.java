package com.practice.striver.recursion_playlist.easy;

import java.util.Arrays;
public class Reverse_an_array_using_recursion {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums1 = {-1, -2, -3, -4, -5};
        System.out.println("Reversed array is "+Arrays.toString(reverseFunctional(nums)));
//        System.out.println(Arrays.toString(nums));
        System.out.println("Single pointer "+ Arrays.toString(singlePointer(nums1, 0)));
    }
    public static int[] singlePointer(int[] nums, int i){
        if(i >= nums.length / 2)    return nums;
        swap(nums, i, nums.length - i - 1);
        return singlePointer(nums, i + 1);
    }
    public static int[] reverseFunctional(int[] nums){
        return solve(nums, 0, nums.length - 1);
    }

    public static int[] solve(int[] nums, int left, int right) {
        if (left >= right) return nums;
        swap(nums, left, right);
        return solve(nums, left + 1, right - 1);
    }
    public static void swap(int[] nums, int left, int right){
        int first = nums[left];
        nums[left] = nums[right];
        nums[right] = first;
    }
}
