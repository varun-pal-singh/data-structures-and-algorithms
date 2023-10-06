package com.practice.leetCode.top150.easy;
/**
 Given a string s containing just the characters '(', ')', '{',
 '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the
 same type.

 Input: s = "()"
 Output: true
 Example 2:

 Input: s = "()[]{}"
 Output: true
 Example 3:

 Input: s = "(]"
 Output: false

 Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
import java.util.HashMap;
import java.util.Stack;
public class LC20_valid_parentheses {
    public static void main(String[] args) {
        String s = "()[]{}", s1 = ")[]", s2 = "(}){}";
        System.out.println("s : " + isValid(s));
        System.out.println("s1 : " + isValid(s1));
        System.out.println("s2 : " + isValid(s2));

        System.out.println("Optimal");
        System.out.println("s : " + optimal(s));
        System.out.println("s1 : " + optimal(s1));
        System.out.println("s2 : " + optimal(s2));
    }
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                stk.push(ch);
            }else if(stk.isEmpty() || stk.peek() != map.get(ch)){
                    return false;
            }else{
                stk.pop();
            }
        }
        return  stk.isEmpty();
    }
    public static boolean optimal(String s){
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else if(stk.isEmpty() || (stk.peek() == '(' && ch != ')') || (stk.peek() == '{' && ch != '}') || (stk.peek() == '[' && ch != ']')){
                    return false;
            }else{
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
