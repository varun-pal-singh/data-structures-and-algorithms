package com.dsa.recursion.problems;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Subsets : "+generateSubsets(nums));
    }
    public static List<Integer> generateSubsets(int[] ip){
        List<Integer> list = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        list.add(0);
        solve(ip, op, list, 0);
        Collections.sort(list);
        return list;
    }
    public static void solve(int[] ip, List<Integer> op, List<Integer> list, int idx){
        if(idx >= ip.length){
//            List<Integer> temp = new ArrayList<>(op);
            list.addAll(op);
            return;
        }
        solve(ip, op, list, idx + 1);
        op.add(ip[idx]);
        solve(ip, op, list, idx + 1);
        op.remove(op.size() - 1);
    }
}
