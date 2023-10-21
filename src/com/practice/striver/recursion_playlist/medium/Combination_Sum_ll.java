package com.practice.striver.recursion_playlist.medium;

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
import java.util.*;
public class Combination_Sum_ll {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(nums, target));
    }
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        solveNaive(nums, target, idx, set, ans);
        Collections.sort(ans);
        return ans.sort();
    }
    public static void solveNaive(int[] nums, int target, int idx, HashSet<Integer> set, List<List<Integer>> ans){
        if(idx == nums.length || target == 0){
            if(target == 0)
                ans.add(new ArrayList<>(set));
            return;
        }
        // pick
        if(nums[idx] <= target){
            set.add(nums[idx]);
            solveNaive(nums, target - nums[idx], idx + 1, set, ans);
            set.remove(nums[idx]);
        }
        // not pick
        solveNaive(nums, target, idx + 1, set, ans);
    }
}
