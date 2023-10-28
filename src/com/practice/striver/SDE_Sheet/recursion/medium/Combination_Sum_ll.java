package com.practice.striver.SDE_Sheet.recursion.medium;

/**
 * Given a collection of candidate numbers (candidates) and a
 * target number (target), find all unique combinations in
 * candidates where the candidate numbers sum to target.

 * Each number in candidates may only be used once in the
 * combination.

 * Note: The solution set must not contain duplicate combinations.

 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]

 * Input: candidates = [2,5,2,1,2], target = 5
 * Output:
 * [
 * [1,2,2],
 * [5]
 * ]

 * Constraints:
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Combination_Sum_ll {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println("Ans1 "+ combinationSum2(nums, target));
    }
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int idx = 0;
        Arrays.sort(nums);
        solveNaive(nums, target, idx, set, ans);
//        System.out.println(Arrays.toString(nums));  // nums is still sorted
        solveOptimal(nums, target, idx, set, ans1);
        System.out.println("Ans  "+ ans);
//        System.out.println("Ans1 "+ ans1);
        return ans1;
    }
    public static void solveNaive(int[] nums, int target, int idx, List<Integer> list, HashSet<List<Integer>> ans){
        if(idx == nums.length || target == 0){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        // pick
        if(nums[idx] <= target){
            list.add(nums[idx]);
            solveNaive(nums, target - nums[idx], idx + 1, list, ans);
            list.remove(list.size() - 1);
        }
        // not pick
        solveNaive(nums, target, idx + 1, list, ans);
    }
    public static void solveOptimal(int[] nums, int target, int idx, List<Integer> list, List<List<Integer>> ans){
        if(idx == nums.length || target == 0){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = idx; i < nums.length; i++){
            // if i > idx and is equal to previous element, then continue
            if(i > idx && nums[i] == nums[i - 1])   continue;
            if(nums[i] > target) break;

            list.add(nums[i]);
            solveOptimal(nums, target - nums[i], i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
