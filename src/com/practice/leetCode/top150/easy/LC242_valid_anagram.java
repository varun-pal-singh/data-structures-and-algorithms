package com.practice.leetCode.top150.easy;
/**
 * Given two strings s and t, return true if t is an anagram
 * of s, and false otherwise.

 * An Anagram is a word or phrase formed by rearranging the
 * letters of a different word or phrase, typically using all
 * the original letters exactly once.

 * Input: s = "anagram", t = "nagaram"
 * Output: true

 * Input: s = "rat", t = "car"
 * Output: false

 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.

 * Follow up: What if the inputs contain Unicode characters?
 * How would you adapt your solution to such a case?
 */
import java.util.Arrays;
import java.util.HashMap;
public class LC242_valid_anagram {
    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println("Is valid anagram ? " + isAnagram1(s, t));
        System.out.println("Is valid anagram ? " + isAnagram2(s, t));
        System.out.println("Is valid anagram ? " + isAnagram3(s, t));

    }
    public static boolean isAnagram1(String s, String t) {
        if(s.length() != t.length())    return false;
        char[] sChar = s.toCharArray(), tChar = t.toCharArray();
        Arrays.sort(sChar); Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length())    return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(int val : map.values()){
            if(val != 0)
                return false;
        }
        return true;
    }
    public static boolean isAnagram3(String s, String t){
        if(s.length() != t.length())    return false;
        int[] cnts = new int[26];
        for(int i = 0; i < s.length(); i++){
            cnts[s.charAt(i) - 'a'] += 1;
            cnts[t.charAt(i) - 'a'] -= 1;
        }
        for(int cnt : cnts){
            if(cnt != 0)
                return false;
        }
        return true;
    }
}
