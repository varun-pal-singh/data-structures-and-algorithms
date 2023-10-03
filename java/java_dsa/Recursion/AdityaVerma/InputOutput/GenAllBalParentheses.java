package java.java_dsa.Recursion.AdityaVerma.InputOutput;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashSet;

public class GenAllBalParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generate(n));
        System.out.println(generate2(n));
    }
    
    public static ArrayList<String> generate(int n){
        return new ArrayList<>(solve(n , n, ""));
    }

    public static HashSet<String> solve(int open, int close, String op){
        HashSet<String> set = new HashSet<>();
        if(open == close && open == 0){
            set.add(op);
            return set;
        }
        if(open == close && open != 0){
            set.addAll(solve(open - 1, close, op+"("));
        }
        if(open > 0){
            set.addAll(solve(open-1, close, op+"("));
        }
        if(close > open){
            set.addAll(solve(open, close - 1, op+")"));
        }
        return set;
    }

    public static ArrayList<String> generate2(int n){
        return new ArrayList<>(solve2(n, n, ""));
    }

    public static ArrayList<String> solve2(int open, int close, String op){
        ArrayList<String> list = new ArrayList<>();
        if(open == close && open == 0){
            list.add(op);
            return list;
        }
        if(close > open){
            list.addAll(solve2(open, close - 1, op+")"));
        }
        if(open == close || open > 0){
        // if(open > 0){    // both will produce same output
            list.addAll(solve2(open - 1, close, op+"("));
        }
        return list;
    }
}
