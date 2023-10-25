package com.practice.striver.recursion_playlist.medium;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("naive approach "+ naivePermutations(nums));
    }
    public static List<List<Integer>> naivePermutations(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        System.out.println(Arrays.toString(freq));
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

}
