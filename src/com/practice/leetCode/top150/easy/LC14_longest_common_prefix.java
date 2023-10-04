package com.practice.leetCode.top150.easy;
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
        String[] str = {"flower","flow","flight"}, str1 = {"dog","racecar","car"};
        System.out.println("Result for 1st input string : "+ longestCommonPrefix(str));
        System.out.println("Result for 2nd input string : "+ longestCommonPrefix(str1));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        char[] mainStr = strs[0].toCharArray();
        for(int i = 0; i < mainStr.length; i++){
            char ch = mainStr[i];
            for(int j = 1; j < strs.length; j++){
                char[] temp = strs[j].toCharArray();
                if(temp[i] != ch)
                    return result.toString();
            }
            result.append(ch);
        }
        return result.toString();
    }
}
