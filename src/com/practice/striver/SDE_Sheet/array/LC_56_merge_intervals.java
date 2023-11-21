package com.practice.striver.SDE_Sheet.array;
/**
 * Given an array of intervals where intervals[i] = [start-i,
 * end-i], merge all overlapping intervals, and return an array
 * of the non-overlapping intervals that cover all the intervals
 * in the input.

 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.

 * Constraints:
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= start-i <= end-i <= 10^4
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class LC_56_merge_intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{19,6},{15,18}};
        System.out.println("After merger : ");
        for(int[] interval : merge(intervals)){
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)   return intervals;

        // sort
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] lastInterval = intervals[0];
        result.add(lastInterval);

        for(int[] interval : intervals){
            if(interval[0] <= lastInterval[1]){  // Overlapping
                lastInterval[1] = Math.max(lastInterval[1], interval[1]);
            }else{
                lastInterval = interval;    // made new interval
                result.add(lastInterval);
            }
        }

        int n = result.size();
        return result.toArray(new int[n][]);
    }
}
