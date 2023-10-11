package com.dsa.recursion.Strings;

public class RemoveAWord {
    public static void main(String[] args) {
        String str = "Hello World!", target = "World";
        System.out.println("Before : "+str);
        System.out.println("After return func : "+removeAWord(str, target));
    }
    static String removeAWord(String ip, String target){
        if(ip.isEmpty()){
            return "";
        }
        char ch = ip.charAt(0);
        if(ip.startsWith(target)){
            return removeAWord(ip.substring(target.length()), target);
        }else{
            return ch + removeAWord(ip.substring(1), target);
        }

    }
}
