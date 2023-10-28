package com.practice.striver.SDE_Sheet.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Subsets_ll {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {0};
        System.out.println("naive "+ naive(nums1));
        System.out.println("optimal "+ optimal(nums1));
    }
    public static List<List<Integer>> naive(int[] nums){
        HashSet<List<Integer>> ans = new HashSet<>();
        solveNaive(nums, 0, ans, new ArrayList<>());
        return new ArrayList<>(ans);
    }
    public static void solveNaive(int[] nums, int idx, HashSet<List<Integer>> ans, ArrayList<Integer> ds){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        // not pick
        solveNaive(nums, idx + 1, ans, ds);

        // pick
        ds.add(nums[idx]);
        solveNaive(nums, idx + 1, ans, ds);
        ds.remove(ds.size() - 1);
    }
    public static List<List<Integer>> optimal(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solveOptimal(nums, 0, ans, new ArrayList<>());
        return ans;
    }
    public static void solveOptimal(int[] nums, int idx, List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i - 1])   continue;

            // pick
            ds.add(nums[i]);
            solveOptimal(nums, i + 1, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
