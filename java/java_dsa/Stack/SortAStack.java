package java.java_dsa.Stack;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<arr.length; i++){
            stack.add(arr[i]);
        }
        System.out.println(stack.peek());
        System.out.println(stack);
    }

    public static Stack<Integer> sort(Stack<Integer> stack, int ele){

        if(stack.size() == 1) return stack;

        int top = stack.pop();
        int newTop = stack.peek();

        if(newTop > top){
            return sort(stack, top);
        }else{
            return sort(stack, newTop);
        }

        // return stack;
    }
}
