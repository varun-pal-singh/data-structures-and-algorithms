package com.practice.striver.SDE_Sheet.binary_search;

/**
 * You are given an m x n integer matrix "matrix" with the following two properties:

 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.

 * You must write a solution in O(log(m * n)) time complexity.

 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:

 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false

 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -10^4 <= matrix[i][j], target <= 10^4
 */
public class LC_74_search_a_2D_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60},};
        int target = 3, target1 = 13;
        System.out.println("Is matrix contains "+target+"? "+searchMatrixNaive(mat, target));
        System.out.println("Is matrix contains "+target1+"? "+searchMatrixNaive(mat, target1));

        System.out.println("Is matrix contains "+target+"? "+searchMatrixOptimal(mat, target));
        System.out.println("Is matrix contains "+target1+"? "+searchMatrixOptimal(mat, target1));
    }
    public static boolean searchMatrixNaive(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int[] arr : matrix){
            if(arr[0] <= target && target <= arr[m-1]){
                return bs(arr, target);
            }
        }
        return false;
    }
    public static boolean bs(int[] arr, int target){
        int n = arr.length, start = 0, end = n - 1;;
        if(n == 1 && target == arr[0]) return true;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static boolean searchMatrixOptimal(int[][] matrix, int target){
        int n = matrix.length, m = matrix[0].length;
        int start = 0, end = n * m - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int rowNo = mid / m, colNo = mid % m;
            if(matrix[rowNo][colNo] == target)  return true;
            else if(matrix[rowNo][colNo] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
