package com.practice.striver.SDE_Sheet.array;

import java.util.Arrays;

/**
 * Given an m x n integer matrix "matrix", if an element is 0,
 * set its entire row and column to 0's.
 * You must do it in place.

 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]

 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

 * Constraints:
 * m == matrix.length
 * n == matrix[0].length
 * 1 <= m, n <= 200
 * -231 <= matrix[i][j] <= 231 - 1

 * Follow up:
 * A straightforward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */
public class LC_73_set_matrix_zeroes {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,1,1},
                {1,0,1},
                {1,1,1},
        },
                matrix2 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };
        setZeroesBetter(matrix1);
        setZeroesBetter(matrix2);
//        setZeroesOptimal(matrix1);
//        setZeroesOptimal(matrix2);
        System.out.println("Matrix1 : ");
        print(matrix1);
        System.out.println("Matrix2 : ");
        print(matrix2);
    }
    public static void print(int[][] matrix){
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setZeroesBetter(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m], col = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void setZeroesOptimal(int[][] matrix) {
        int col0 = 1;
    }
}
