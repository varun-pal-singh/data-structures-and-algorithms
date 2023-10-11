package com.dsa.stack;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        Stack<Integer> stack = new Stack<>();
        for (int el : arr) {
            stack.add(el);
        }
        System.out.println(stack);

        System.out.println("Stack after sorting : ");
        sort(stack);
        System.out.println(stack);
    }

    public static void sort(Stack<Integer> stack){
        if(stack.size() == 1)   return;
        int top = stack.pop();
        sort(stack);
        insert(stack, top);
    }
    public static void insert(Stack<Integer> stk, int el){
        if(stk.isEmpty() || stk.peek() <= el){
            stk.push(el);
            return;
        }
        int top = stk.pop();
        insert(stk, el);
        stk.push(top);
    }
}
