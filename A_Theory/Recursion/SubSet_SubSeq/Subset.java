package A_Theory.Recursion.SubSet_SubSeq;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(subsetIteration(arr));
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
