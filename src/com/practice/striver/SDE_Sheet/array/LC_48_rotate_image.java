package com.practice.striver.SDE_Sheet.array;
/**
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise).

 * You have to rotate the image in-place, which means you have
 * to modify the input 2D matrix directly. DO NOT allocate
 * another 2D matrix and do the rotation.

 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]

 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

 * Constraints:
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 */
import java.util.Arrays;
public class LC_48_rotate_image {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}}, matrix1 = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        rotate(matrix); rotate(matrix1);
        print(matrix);
        System.out.println();
        print(matrix1);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < m; j++){
                swap(matrix, i, j);
            }
        }
        for(int[] arr : matrix){
            reverse(arr);
        }
    }
    public static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void reverse(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
    }
    public static void print(int[][] matrix){
        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
