package com.dsa.array.sorting;
import java.util.Arrays;

public class Cycle_sort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 2, 5};
        cycleSort(nums, nums.length);
        System.out.println("After sorting : "+ Arrays.toString(nums));
    }
    public static void cycleSort(int[] nums, int n){
        int i = 0;
        while(i < n){
            int correctIdx = nums[i] - 1;
            if(nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
