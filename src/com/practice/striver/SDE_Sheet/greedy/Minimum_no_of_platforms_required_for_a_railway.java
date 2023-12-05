package com.practice.striver.SDE_Sheet.greedy;
/**
 * Problem Statement: We are given two arrays that represent the
 * arrival and departure times of trains that stop at the
 * platform. We need to find the minimum number of platforms
 * needed at the railway station so that no train has to wait.

 * Input: N=6,
 * arr[] = {9:00, 9:45, 9:55, 11:00, 15:00, 18:00}
 * dep[] = {9:20, 12:00, 11:30, 11:50, 19:00, 20:00}

 * Output:3
 * Explanation: There are at-most three trains at a time. The
 * train at 11:00 arrived but the trains which had arrived at
 * 9:45 and 9:55 have still not departed. So, we need at least
 * three platforms here.

 * Input Format: N=2,
 * arr[]={10:20,12:00}
 * dep[]={10:50,12:30}

 * Output: 1
 * Explanation: Before the arrival of the new train, the earlier
 * train already departed. So, we don’t require multiple
 * platforms.
 */
public class Minimum_no_of_platforms_required_for_a_railway {
    public static void main(String[] args) {

    }
    public static int calculateMinPatforms(int at[], int dt[], int n) {

        return -1;
    }
}
