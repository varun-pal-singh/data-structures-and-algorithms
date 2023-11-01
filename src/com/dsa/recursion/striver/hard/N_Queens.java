package com.dsa.recursion.striver.hard;

import java.util.ArrayList;
import java.util.List;
public class N_Queens {
    public static void main(String[] args){
        int n = 4;
        System.out.println("Naive   : "+ solveNQueen_naive(n));
        System.out.println("Optimal : "+ solveNQueen_optimal(n));
    }
    public static List<List<String>> solveNQueen_naive(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        dfs(0, board, result);
        return result;
    }
    public static List<List<String>> solveNQueen_optimal(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        boolean[] left = new boolean[n];
        boolean[] upLeft = new boolean[2 * n - 1];
        boolean[] downLeft = new boolean[2 * n - 1];
        dfs_optimal(n,0, left, upLeft, downLeft, board, result);
//        System.out.println(Arrays.deepToString(board));
        return result;
    }
    public static void dfs(int colIdx, char[][] board, List<List<String>> result){
        if(colIdx == board.length){
            result.add(construct(board));
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(validate(board, row, colIdx)){
                board[row][colIdx] = 'Q';
                dfs(colIdx + 1, board, result);
                board[row][colIdx] = '.';
            }
        }
    }

    public static void dfs_optimal(int n, int col, boolean[] left, boolean[] upLeft, boolean[] downLeft, char[][] board, List<List<String>> result){
        if(col == board.length){
            result.add(construct(board));
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(left[row] || upLeft[n - 1 + col - row] || downLeft[row + col])   continue;
            board[row][col] = 'Q';
            left[row] = true;
            upLeft[n - 1 + col - row] = true;
            downLeft[row + col] = true;
            dfs_optimal(n,col + 1, left, upLeft, downLeft, board, result);
            board[row][col] = '.';
            left[row] = false;
            upLeft[n - 1 + col - row] = false;
            downLeft[row + col] = false;
        }
    }
    private static boolean validate(char[][] board, int row, int col){
        int dupRow = row, dupCol = col;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row -= 1;
            col -= 1;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col -= 1;
        }
        col = dupCol;
        while(row < board.length && col >= 0){
            if(board[row][col] == 'Q') return false;
            row += 1;
            col -= 1;
        }
        return true;
    }
    private static List<String> construct(char[][] board){
        List<String> ds = new ArrayList<>();
        for (char[] chars : board) {
            String s = new String(chars);
            ds.add(s);
        }
        return ds;
    }
}
