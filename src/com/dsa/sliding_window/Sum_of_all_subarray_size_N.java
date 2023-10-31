package com.dsa.sliding_window;
import java.util.List;
import java.util.ArrayList;
public class Sum_of_all_subarray_size_N {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 3;
        System.out.println("Naive   : "+print_sum_naive(arr, n));
        System.out.println("Optimal : "+print_sum_optimal(arr, n));
    }
    public static List<Integer> print_sum_naive(int[] arr, int n){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i <= arr.length - n; i++){
            for(int j = i; j < i + 3; j++){
                sum += arr[j];
            }
            list.add(sum);
            sum = 0;
        }
        return list;
    }
    public static List<Integer> print_sum_optimal(int[] arr, int n){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        list.add(sum);
//        System.out.println("sum of first n items "+ sum);
        for(int i = n; i < arr.length; i++){
            sum -= arr[i - n];
            sum += arr[i];
            list.add(sum);
        }
        return list;
    }
}
