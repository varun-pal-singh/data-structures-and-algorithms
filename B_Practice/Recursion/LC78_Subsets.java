package B_Practice.Recursion;
import java.util.ArrayList;
import java.util.List;

/*
 * given [1, 2, 3]
 * op : [[], [1], [2], [3], [1,2], [1, 3], [2, 3], [1, 2, 3]];
 */

public class LC78_Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(generateSubsets(nums));
    }
    public static List<List<Integer>> generateSubsets(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        solve(nums, 0, op, list);
        System.out.println("op list after process : "+op);
        System.out.println("size of list of list of integer : "+list.size());
        return list;
    }
    private static void solve(int[] nums, int idx, List<Integer> op, List<List<Integer>> list){
        if(idx >= nums.length){
            List<Integer> temp = new ArrayList<>(op);
            list.add(temp);
            return;
        }
        solve(nums, idx+1, op, list);
        op.add(nums[idx]);
        solve(nums, idx+1, op, list);
        op.remove(op.size() - 1);
    }
}
