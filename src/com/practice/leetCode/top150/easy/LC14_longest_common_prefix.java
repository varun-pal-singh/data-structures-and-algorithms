package com.practice.leetCode.top150.easy;

import java.util.Arrays;

/**
 Write a function to find the longest common prefix string
 amongst an array of strings.
 If there is no common prefix, return an empty string "".

 Input: strs = ["flower","flow","flight"]
 Output: "fl"

 Input: strs = ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 */
public class LC14_longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flo"}, strs1 = {"dog","racecar","car"};
        // Naive
        System.out.println("Result for 1st input string : "+ longestCommonPrefix(strs));
        System.out.println("Result for 2nd input string : "+ longestCommonPrefix(strs1));

        // Optimal
        System.out.println("Result for 1st input string : "+ optimal(strs));
        System.out.println("Result for 2nd input string : "+ optimal(strs1));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] mainStr = strs[0].toCharArray();
        for(int i = 0; i < mainStr.length; i++){
            char ch = mainStr[i];
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != ch){
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String optimal(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) != s2.charAt(idx))
                break;
            else
                idx += 1;
        }
        return s1.substring(0, idx);
    }
}
