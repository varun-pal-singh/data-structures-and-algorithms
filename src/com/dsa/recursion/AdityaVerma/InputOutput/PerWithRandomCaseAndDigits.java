package com.dsa.recursion.AdityaVerma.InputOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class PerWithRandomCaseAndDigits {
    public static void main(String[] args) {
        String ip = "a1B27c ", op = "";
        System.out.println(solve(ip, op));
        // String i = "1";
        // System.out.println(i.toUpperCase());
    }
    static ArrayList<String> solve(String ip, String op){
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        if(ip.isEmpty()){
            set.add(op);
            list.addAll(set);
            return list;
        }
        set.addAll(solve(ip.substring(1), op+ip.toLowerCase().charAt(0)));
        set.addAll(solve(ip.substring(1), op+ip.toUpperCase().charAt(0)));
        list.addAll(set);
        return list;
    }
}
