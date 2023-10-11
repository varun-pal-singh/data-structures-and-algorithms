package com.dsa.recursion.Numbers;

public class DecimalToBinary {
    public static void main(String[] args) {
        String result = decimalToBinary(14, "");
        System.out.println(result);
    }
    public static String decimalToBinary(int decimalNum, String binaryNum){
        if(decimalNum == 0){
            return binaryNum;
        }
        binaryNum = decimalNum % 2 + binaryNum;
        return decimalToBinary(decimalNum/2, binaryNum);
    }
}
