package com.dsa.recursion.problems;

import com.sun.security.jgss.GSSUtil;

public class Print_with_case_change {
    public static void main(String[] args) {
        String ip = "abc", op = "";
        printWithCaseChange1(ip, op, 0);
        System.out.println();
        printWithCaseChange2(ip, op);
    }
    public static void printWithCaseChange1(String ip, String op, int idx){
        if(idx >= ip.length()){
            System.out.print(op+" ");
            return;
        }
        char ch = ip.charAt(idx);
        char change = Character.toUpperCase(ch);

        // not take
        printWithCaseChange1(ip, op + ch, idx + 1);

        // take
        printWithCaseChange1(ip, op + change, idx + 1);
    }
    public static void printWithCaseChange2(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return;
        }
        char ch = ip.charAt(0);
        char change = Character.toUpperCase(ch);
        // not take
        printWithCaseChange2(ip.substring(1), op + ch);

        // take
        printWithCaseChange2(ip.substring(1), op + change);
    }
}
