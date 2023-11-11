package com.practice.striver.SDE_Sheet.array;
/**
 * Given a string s, find the length of the longest substring
 * without repeating characters.

 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.

 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.

 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 * Constraints:
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */
import java.util.HashMap;
public class LC_3_longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String s1 = "pwwkew", s2 = "abba", s3 = "abab";
        System.out.println("For s1 : longest length = "+lengthOfLongestSubstring(s1));
        System.out.println("For s2 : longest length = "+lengthOfLongestSubstring(s2));
        System.out.println("For s3 : longest length = "+lengthOfLongestSubstring(s3));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2)   return n;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, longest = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(map.get(s.charAt(i)) + 1, left);
            }
            map.put(s.charAt(i), i);
            longest = Math.max(longest, i - left + 1);
        }
        return longest;
    }
}
