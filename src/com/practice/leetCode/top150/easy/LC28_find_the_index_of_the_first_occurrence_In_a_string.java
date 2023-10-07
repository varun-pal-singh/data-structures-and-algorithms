package com.practice.leetCode.top150.easy;
/**
 * Given two strings needle and haystack, return the index of
 * the first occurrence of needle in haystack, or -1 if needle
 * is not part of haystack.

 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.

 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we
 * return -1.

 * Constraints:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class LC28_find_the_index_of_the_first_occurrence_In_a_string {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println("length of first occ : "+strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        if(hLen < nLen) return -1;
        for(int i = 0; i < hLen - nLen + 1; i++){
            int j = 0;
            while(j < nLen && haystack.charAt(i + j) == needle.charAt(j)){
                j += 1;
            }
            if(j == nLen)
                return i;
        }
        return -1;
    }
}
