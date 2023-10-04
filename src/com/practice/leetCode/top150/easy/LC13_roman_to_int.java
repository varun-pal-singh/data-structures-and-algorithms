package com.practice.leetCode.top150.easy;
/**
 Roman numerals are represented by seven different symbols:
 I, V, X, L, C, D and M.

 Symbol       Value
 I             1
 V             5
 X             10
 L             50
 C             100
 D             500
 M             1000

 For example, 2 is written as II in Roman numeral, just two
 ones added together. 12 is written as XII, which is simply X
 + II. The number 27 is written as XXVII, which is XX + V + II.

 Roman numerals are usually written largest to smallest from
 left to right. However, the numeral for four is not IIII.
 Instead, the number four is written as IV. Because the one is
 before the five we subtract it making four. The same
 principle applies to the number nine, which is written as IX.
 There are six instances where subtraction is used:

 I can be placed before V (5) and X (10) to make 4 and 9.
 X can be placed before L (50) and C (100) to make 40 and 90.
 C can be placed before D (500) and M (1000) to make 400 and
 900.
 Given a roman numeral, convert it to an integer.

 Input: s = "LVIII"
 Output: 58
 Explanation: L = 50, V= 5, III = 3.

 Input: s = "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
import java.util.Arrays;
import java.util.HashMap;
public class LC13_roman_to_int {
    public static void main(String[] args) {
        String s = "LVIII";
        String s1 = "MCMXCIV";
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static HashMap<Character, Integer> buildMap(){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 50);
        map.put('M', 1000);
        return map;
    }
    public static  int romanToInt(String s) {
        if(s.isEmpty()) return 0;
        HashMap<Character, Integer> map = buildMap();
        char[] chars = s.toCharArray();
        int sum = 0;
        sum += map.get(chars[0]);
        for(int i = 1; i < chars.length; i++){
            // MCMXCIV
            int prevVal = map.get(chars[i-1]), currVal = map.get(chars[i]);
            if(prevVal < currVal){
                sum -= 2 * prevVal;
            }
            sum += currVal;
        }

        return sum;
    }
}
