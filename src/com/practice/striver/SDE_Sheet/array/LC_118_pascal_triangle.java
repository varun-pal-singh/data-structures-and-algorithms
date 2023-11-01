package com.practice.striver.SDE_Sheet.array;
/**
 * Given an integer numRows, return the first numRows of
 * Pascal's triangle.

 * In Pascal's triangle, each number is the sum of the two
 * numbers directly above it as shown:

 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

 * Input: numRows = 1
 * Output: [[1]]

 * Constraints:
 * 1 <= numRows <= 30
 */
import java.util.List;
import java.util.ArrayList;
public class LC_118_pascal_triangle {
    public static void main(String[] args) {
        int numRows1 = 5, numRows2 = 1;
        System.out.println("numRow1 : "+generate(numRows1));
        System.out.println("numRow2 : "+generate(numRows2));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int rowNo = 1; rowNo <= numRows; rowNo++){
            result.add(generateRow(rowNo));
        }
        return result;
    }
    public static List<Integer> generateRow(int rowNo){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int value = 1;
        for(int i = 1; i < rowNo; i++){
            value = value * (rowNo - i);
            value = value / i;
            row.add(value);
        }
        return row;
    }
}
