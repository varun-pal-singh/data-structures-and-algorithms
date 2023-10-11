package com.dsa.recursion.problems;

public class Find_all_the_unique_paths_in_nXm_grid {
    public static void main(String[] args){
        int n = 1;
        int m = 2;
        System.out.println("All the unique paths for "+n+" X "+m+" grid are "+grid_paths(n, m));
    }
    private static int grid_paths(int n, int m){
        if(n == 1 || m == 1)
            return 1;
        else
            return grid_paths(n - 1, m) + grid_paths(n, m - 1);
    }
}
