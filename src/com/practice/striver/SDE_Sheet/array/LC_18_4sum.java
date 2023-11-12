package com.practice.striver.SDE_Sheet.array;

/**
 * Given an array nums of n integers, return an array of all the
 * unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.

 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]

 * Constraints:
 * 1 <= nums.length <= 200
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class LC_18_4sum {
    public static void main(String[] args) {
        int[] nums1 = {1,0,-1,0,-2,2}, nums2 = {2,2,2,2,2};
        int target1 = 0, target2 = 8;
        System.out.println("output for nums1 : "+ fourSum(nums1, target1));
        System.out.println("output for nums1 : "+ fourSum(nums2, target2));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;   // avoiding duplicates
            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;   // avoiding duplicates
                int k = j + 1, l = n - 1;
                while(k < l){
                    long sum = nums[i] + nums[j];
                    sum += nums[k] + nums[l];
                    if(sum < (long) target)     k++;
                    else if(sum > (long) target)    l--;
                    else{
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++; l--;
                        while(k < l && nums[k] == nums[k - 1])  k++;
                        while(k < l && nums[l] == nums[l + 1])  l--;
                    }
                }
            }
        }
        return list;
    }
}
