package A_Theory.Recursion.DivideAndConquer;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = bs(arr, 7, 0, 10);
        System.out.println(index);
    }
    public static int bs(int[] arr, int x, int s, int e){
        if(s > e) return -1;
        int mid = s + (e - s)/2;
        if(arr[mid] == x) return mid;
        if(arr[mid] < x){
            return bs(arr, x, mid + 1, e);
        }else{
            return bs(arr, x, s, mid - 1);
        }
    }

}
