package com.practice.striver.SDE_Sheet.recursion.easy;

public class Check_if_given_is_palindrome {
    public static void main(String[] args) {
        String str = "ab@cdefed#%cba";
        String str1 = " This# is7 not @ \" pAlinDrOme \"string ";
        String str2 = "MaDAm";
        System.out.println("str is palindrome : " + checkPalindrome(str));
        System.out.println("str1 is palindrome : " + checkPalindrome(str1));
        System.out.println("str2 is palindrome : " + checkPalindrome(str2));
    }
    public static boolean checkPalindrome(String str){
        String lowerStr = str.toLowerCase();
        int n = str.length();
        return solve(lowerStr, 0, n - 1);
    }
    public static boolean solve(String str, int i, int j){
        if(i >= j)   return true;

        char leftChar = str.charAt(i);
        char rightChar = str.charAt(j);

        // skips if char is not letter or digit;
        if(!Character.isLetterOrDigit(leftChar)){
            return solve(str, i + 1, j);
        }
        else if(!Character.isLetterOrDigit(rightChar)){
            return solve(str, i, j - 1);
        }
        else if(leftChar == rightChar){
            return solve(str, i + 1, j - 1);
        }
        else {
            return false;
        }
    }
}
