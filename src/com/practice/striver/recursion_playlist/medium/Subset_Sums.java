package com.practice.striver.recursion_playlist.medium;
import java.util.*;
public class Subset_Sums {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        System.out.println(subsetSum(nums));
    }
    public static List<Integer> subsetSum(int[] nums){
//        Arrays.sort(nums);
        List<Integer> sumList = new ArrayList<>();
        solve1(nums, 0, 0, sumList);
        Collections.sort(sumList);
        return sumList;
    }
    public static void solve1(int[] nums, int idx, int sum, List<Integer> sumList){
        if(idx == nums.length){
            sumList.add(sum);
            return;
        }
        // pick
        sum += nums[idx];
        solve1(nums, idx + 1,sum, sumList);
        sum -= nums[idx];

        // not pick
        solve1(nums, idx + 1, sum, sumList);
    }
}
