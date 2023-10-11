package com.dsa.recursion.SubSet_SubSeq;
import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        String str = "abcd";
        
        // mtd 1
        subSeq(str, "");
        System.out.println();

        // mtd2
        subSeq1(str, "", ans);
        System.out.println(ans);

        // mtd3
        System.out.println(subSeq2(str, ""));
    }

    static void subSeq(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return;
        }
        subSeq(ip.substring(1), op);
        char currChar = ip.charAt(0);
        subSeq(ip.substring(1), op+currChar);
    }

    static void subSeq1(String ip, String op, ArrayList<String> list){
        if(ip.isEmpty()){
            list.add(op);
            return;
        }
        subSeq1(ip.substring(1), op, list);
        char currChar = ip.charAt(0);
        subSeq1(ip.substring(1), op+currChar, list);
    }

    static ArrayList<String> subSeq2(String ip, String op){
        ArrayList<String> list = new ArrayList<>();
        if(ip.isEmpty()){
            list.add(op);
            return list;
        }
        list.addAll(subSeq2(ip.substring(1), op));
        char currChar = ip.charAt(0);
        list.addAll(subSeq2(ip.substring(1), op+currChar));
        return list;
    }
} 
