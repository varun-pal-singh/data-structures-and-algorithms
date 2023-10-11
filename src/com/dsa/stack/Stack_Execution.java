package com.dsa.stack;

// import java.util.HashMap;
import java.util.Stack;

// stack = LIFO data structure, Last-In First-Out stores objects into a sort of 
// "vertical tower" 
// push() to add to the top
// pop() to remove from the top
// peek() to see top element
// empty()
// search()

// uses of stacks?
// 1. undo/redo features in text editors,
// 2. moving back/forward through browser history,
// 3. backtracking algorithms (maze, file directories),
// 4. calling functions (call stack).


public class Stack_Execution {
    public static void main(String[] args) {
        System.out.println();
        
        Stack <String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        
        System.out.println(stack.empty());
        System.out.println(stack);

        stack.pop();
        String myFavGame = stack.pop();

        System.out.println(stack);
        System.out.println(myFavGame);
        System.out.println(stack.peek());
        
        System.out.println(stack.search("Borderlands"));

        for(int i = 0; i < 10000; i++){
            stack.push("Fallout76");
        }
        System.out.println(stack);
    }
}
