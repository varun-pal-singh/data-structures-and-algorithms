package com.practice.striver.recursion_playlist.medium;

import java.util.ArrayList;
public class Print_SubSeq_whose_sum_is_K {
    public static void main(String[] args) {
        int k = 2, sum = 0, idx = 0;
        int[] nums = {1, 2, 1};
        ArrayList<Integer> op = new ArrayList<>();
        print1(nums, k, idx, sum, op);
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
}
