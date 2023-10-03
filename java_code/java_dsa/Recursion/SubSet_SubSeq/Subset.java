package java_code.java_dsa.Recursion.SubSet_SubSeq;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(subsetIteration(arr));
        System.out.println(subsetIterationDuplicates(arr));
        System.out.println(subsetRecurrsion(arr));
    }

    // TC : O(n * 2^n), SC : O(n * 2^n)
    static List<List<Integer>> subsetIteration(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    // if contains duplicates
    static List<List<Integer>> subsetIterationDuplicates(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            start = 0;
            if(i > 0 && nums[i] == nums[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j < n; j++){
                 
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    // TC : O(n), SC : O(n)
    static List<List<Integer>> subsetRecurrsion(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner =  new ArrayList<>();
        solve(nums, 0, inner, outer);
        return outer;
    }

    static void solve(int[] nums, int idx, List<Integer> inner, List<List<Integer>> outer){
        if(idx >= nums.length){
            List<Integer> temp = new ArrayList<>(inner);
            outer.add(temp);
            return;
        }
        solve(nums, idx + 1, inner, outer);
        inner.add(nums[idx]);
        solve(nums, idx + 1, inner, outer);
        inner.remove(inner.size() - 1);
    }

    // if contains duplicates
}
