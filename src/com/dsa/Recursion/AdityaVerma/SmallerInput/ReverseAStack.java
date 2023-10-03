package com.dsa.Recursion.AdityaVerma.SmallerInput;
import java.util.Stack;
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for(int el: arr){
            stk.push(el);
        }
        System.out.println("Before reverse: "+stk);
        reverse(stk);
        System.out.println("After reverse: "+stk);
    }
    public static void reverse(Stack<Integer> stk){
        if(stk.size() == 1) return;
        int top = stk.pop();
        reverse(stk);
        insert(stk, top);
        return;
    }
    public static void insert(Stack<Integer> stk, int top){
        if(stk.size() == 0){
            stk.push(top);
            return;
        }
        int val = stk.pop();
        insert(stk, top);
        stk.push(val);
        return;
    }
}
