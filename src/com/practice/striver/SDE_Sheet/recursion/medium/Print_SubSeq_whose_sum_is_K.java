package com.practice.striver.SDE_Sheet.recursion.medium;

import java.util.ArrayList;
public class Print_SubSeq_whose_sum_is_K {
    public static void main(String[] args) {
        int k = 2, sum = 0, idx = 0;
        int[] nums = {1, 2, 1};
        ArrayList<Integer> op = new ArrayList<>();

        System.out.println("All subsets with sum "+k);
        print1(nums, k, idx, sum, op);

        System.out.println();

        int[] nums1 = {1, 1, 1, 1, 2, 2, 3, 4};
        ArrayList<Integer> op1 = new ArrayList<>();

        System.out.println("Any one subsequence with sum 4");
        boolean ans = printAnyOneSubseq(nums1, 4, idx, sum, op1);
        System.out.println(ans);

        int count = printCountOfSubseqSumK(nums1, 4, idx, sum);
        System.out.println("count of all the subsequences with sum 4 is "+count);

    }
    public static void print1(int[] nums,int k, int idx, int sum, ArrayList<Integer> op){
        if(idx >= nums.length){
            if(sum == k)
                System.out.print(op + ", ");
            return;
        }
//        pick and add
        op.add(nums[idx]);
        print1(nums, k, idx + 1, sum + nums[idx], op);
        op.remove(op.size() - 1);

//        not pick and don't add
        print1(nums, k, idx + 1, sum, op);
    }

    public static boolean printAnyOneSubseq(int[] nums, int k, int idx, int sum, ArrayList<Integer> op){
        if(idx >= nums.length){
            if(sum == k){
                System.out.println(op);
                return true;
            }
            return false;
        }
        // not pick
        if(printAnyOneSubseq(nums, k, idx + 1, sum, op)){
            return true;
        }
        // pick
        op.add(nums[idx]);
        if(printAnyOneSubseq(nums, k, idx + 1, sum + nums[idx], op)){
            return true;
        }
        op.remove(op.size() - 1);

        return false;
    }

    public static int printCountOfSubseqSumK(int[] nums, int k, int idx, int sum){
        if(sum > k) return 0;
        if(idx >= nums.length){
            if(sum == k){
                return 1;
            }
            else return 0;
        }
        // pick
        int left = printCountOfSubseqSumK(nums, k, idx + 1, sum + nums[idx]);

        // not pick
        int right = printCountOfSubseqSumK(nums, k, idx + 1, sum);
        return left + right;
    }
}
