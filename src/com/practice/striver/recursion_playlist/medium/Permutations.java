package com.practice.striver.recursion_playlist.medium;

import java.util.List;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("naive approach   "+ naivePermutations(nums));
        System.out.println("optimal approach "+ optimalPermutations(nums));
    }
    public static List<List<Integer>> naivePermutations(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
//        System.out.println(Arrays.toString(freq));
        solveNaive(nums, new ArrayList<>(), freq, ans);
        return ans;
    }
    public static void solveNaive(int[] nums, List<Integer> ds, boolean[] map, List<List<Integer>> ans){
        if(nums.length == ds.size()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!map[i]) {
                ds.add(nums[i]);
                map[i] = true;
                solveNaive(nums, ds, map, ans);
                map[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static List<List<Integer>> optimalPermutations(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        solveOptimal(nums, 0, ans);
        return ans;
    }

    public static void solveOptimal(int[] nums, int idx, List<List<Integer>> ans){
        if(idx == nums.length - 1){
            // copy the nums to ds
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, i, idx);
            solveOptimal(nums, idx + 1, ans);
            swap(nums, i, idx);
        }
    }

    public static void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
