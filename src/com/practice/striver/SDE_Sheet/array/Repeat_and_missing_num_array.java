package com.practice.striver.SDE_Sheet.array;

/**
 * You are given a read only array of n integers from 1 to n.

 * Each integer appears exactly once except A which appears
 * twice and B which is missing.

 * Return A and B.

 * Note: Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 * Note that in your output A should precede B.

 * Input:[3 1 2 5 3]
 * Output:[3, 4]
 * A = 3, B = 4
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Repeat_and_missing_num_array {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 5, 3));
        System.out.println("A and B are : "+ Arrays.toString(missingAndRepeating(list, list.size())));
    }
    public static int[] missingAndRepeating(ArrayList<Integer> list, int n) {
        cycleSort(list, n);
        System.out.println("list after sorting : "+ list);

        for(int i = 0; i < n; i++){
            if(list.get(i) != i + 1){
                int appear = list.get(i);
                int missing = i + 1;
                return new int[]{appear, missing};
            }
        }
        return new int[]{-1, -1};
    }
    public static void cycleSort(ArrayList<Integer> list, int n){
        int i = 0;
        while(i < n){
            int correctIdx = list.get(i) - 1;
            if(!list.get(i).equals(list.get(correctIdx))){
                // if the current element is not equal to the element present at correct Idx
                // put the element in correct Idx by swapping
                swap(list, i, correctIdx);
            }else{
                i++;
            }
        }
    }
    public static void swap(ArrayList<Integer> list, int i , int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
