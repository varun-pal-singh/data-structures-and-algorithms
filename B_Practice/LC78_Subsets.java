package B_Practice;
import java.util.ArrayList;
import java.util.List;
public class LC78_Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(generateSubsets(nums));
    }
    public static List<List<Integer>> generateSubsets(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        return solve(nums, 0, list, new ArrayList<>());
    }
    static List<List<Integer>> solve(int[] nums, int idx, List<List<Integer>> list, List<Integer> op){
        if(idx == nums.length - 1){
            list.add(op);
            // System.out.println(list);
            return list;
        }
        list.addAll(solve(nums, idx + 1, list, op));
        op.add(nums[idx]);
        list.addAll(solve(nums, idx + 1, list, op));
        System.out.println(list);
        return list;
    }
}
