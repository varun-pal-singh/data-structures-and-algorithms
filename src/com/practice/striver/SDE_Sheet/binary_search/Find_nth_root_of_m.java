package com.practice.striver.SDE_Sheet.binary_search;
// n = 3, m = 27
// op : 3, m ^ (1/n)
public class Find_nth_root_of_m {
    public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println("output : "+ NthRoot(n, m));
    }
    public static int NthRoot(int n, int m) {
        int start = 1, end = m / n;
        while(start < end){
            int root = start + (end - start) / 2;
            int val = verify(root, n, m);
            if(val == 1)    return root;
            else if(val == 0)   start = root + 1;
            else end = root - 1;
        }
        return -1;
    }
    public static int verify(int root, int n, int m){
        long val = 1;
        for(int i = 0; i < n; i++){
            val = val * root;
            if(val > (long) m) return 2;
        }
        return val == m ? 1 : 0;
    }
}
