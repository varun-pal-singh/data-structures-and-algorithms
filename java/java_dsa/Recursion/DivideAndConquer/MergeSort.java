package java.java_dsa.Recursion.DivideAndConquer;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {4, 1, 3, 2, 0, -1, 7, 10, 9, 20};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int[] arr, int start, int end){
        // if(start > end) return;
        if(start < end){
            int mid = start + (end - start)/2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        } 
    }
    public static void merge(int[] arr, int start, int mid, int end){
        // build temp array to avoid modifying the original contents
        int[] temp = new int[end-start+1];
        int i = start, j = mid + 1, k = 0;

        // while both sub-array have values, then try and merge them in sorted order
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
                // k++; i++;
            }else{
                temp[k++] = arr[j++];
            }
        }

        // add the rest of the values from the left sub-array into the result
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // add the rest of the values from the right sub-array into the result
        while(j <= end){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(i = start; i <= end; i++){
            arr[i] = temp[i - start];
        }
    }
}
