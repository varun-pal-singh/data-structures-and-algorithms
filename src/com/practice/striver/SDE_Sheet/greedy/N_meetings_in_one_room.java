package com.practice.striver.SDE_Sheet.greedy;

import java.util.HashMap;

/**
 * Problem Statement: There is one meeting room in a firm. You are given two arrays, start and end each of size N.For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting. Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time. Print the order in which these meetings will be performed.

 * Input:
 * N = 6, start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}

 * Output: 1 2 4 5
 */
public class N_meetings_in_one_room {
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5}, end = {2, 4, 5, 7, 9, 9};
        int n = start.length;
        System.out.println("No. of meetings that can be arranged in same room are "+ maximumMeetings(n, start, end));
    }
    public static int maximumMeetings(int n, int []start, int []end) {
        if(n <= 0)  return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(start[0], end[0]);
        for(int i = 1; i < n; i++){
            if(map.get(start[i]) >= map.get(end[i - 1])){
//
            }
        }
        return -1;
    }
}
