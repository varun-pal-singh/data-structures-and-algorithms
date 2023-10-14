package com.practice.striver.recursion_playlist.medium;
import java.util.ArrayList;
// Subsequences follows order of the array
public class Subsequences {
    public static void main(String[] args) {
        int[] nums = {1, 2};
//        System.out.println("Subsequences : "+ printSubSeq(nums));
        System.out.println();
        printSubSeq1(nums);
    }
    public static void printSubSeq1(int[] nums){
        ArrayList<Integer> op = new ArrayList<>();
        int idx = 0;
        solveFor1(nums, idx, op);
    }
    public static void solveFor1(int[] nums, int idx, ArrayList<Integer> op){
        if(idx >= nums.length){
            System.out.print(op+", ");
            return;
        }
        solveFor1(nums, idx + 1, op);
        op.add(nums[idx]);
        solveFor1(nums, idx + 1, op);
//        op.remove(op.size() - 1);
    }
}
