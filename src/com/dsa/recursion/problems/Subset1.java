package com.dsa.recursion.problems;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Subset1 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        subset1(nums);
        System.out.println();
        System.out.println("subsets of "+Arrays.toString(nums)+" are : "+subset2(nums));
    }
    public static void subset1(int[] nums){
        ArrayList<Integer> op = new ArrayList<>();
        int idx = 0;
        solveFor1(nums, op, idx);
    }

    public static List<List<Integer>> subset2(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        int idx = 0;
        solveFor2(nums, result, op, idx);
        System.out.println("After processed op : " + op);
        System.out.println("After processed result : " + result);
        return result;
    }
    public static void solveFor1(int[] nums, ArrayList<Integer> op, int idx){
        if(idx >= nums.length){
            System.out.print(op+", ");
            return;
        }
        // not pick
        solveFor1(nums,op, idx + 1);

        // pick
        op.add(nums[idx]);
        solveFor1(nums, op, idx + 1);
        op.remove(op.size() - 1);
    }

    public static void solveFor2(int[] nums, List<List<Integer>> result, List<Integer> op, int idx){
        if(idx >= nums.length){
            List<Integer> temp = new ArrayList<>(op);
            result.add(temp);
            return;
        }
        // not pick
        solveFor2(nums, result, op, idx + 1);

        // pick
        op.add(nums[idx]);
        solveFor2(nums, result, op, idx + 1);
        op.remove(op.size() - 1);
        return;
    }
}
