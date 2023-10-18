package com.practice.striver.recursion_playlist.medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_l {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        System.out.println("First combinations : ");
        combination_sum_1(0, new ArrayList<>(), arr, target);

        System.out.println();

        System.out.println("Second combinations : "+ combinationSum(arr, target));

    }
    public static List<List<Integer>> combinationSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        combination_sum_2(0, arr, target, ans, new ArrayList<>());
        return ans;
    }
    public static void combination_sum_2(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> list){
        if(idx == arr.length || target == 0){
            if(target == 0)
                ans.add(new ArrayList<>(list));
            return;
        }
        // pick
        if(arr[idx] <= target){
            list.add(arr[idx]);
            combination_sum_2(idx, arr, target - arr[idx], ans, list);
            list.remove(list.size() - 1);
        }
        // not pick
        combination_sum_2(idx + 1, arr, target, ans, list);
    }
    public static void combination_sum_1(int idx, ArrayList<Integer> list, int[] arr, int target){
        if(idx == arr.length){
            if(target == 0)
                System.out.print(list + ", ");
            return;
        }
        // pick
        if(arr[idx] <= target){
            list.add(arr[idx]);
            combination_sum_1(idx, list, arr, target - arr[idx]);
            list.remove(list.size() - 1);
        }

        // not pick
        combination_sum_1(idx + 1, list, arr, target);
    }

}
