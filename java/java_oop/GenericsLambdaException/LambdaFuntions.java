package java.java_oop.GenericsLambdaException;

import java.util.ArrayList;

public class LambdaFuntions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i);
        }
        arr.forEach((item) -> System.out.print(item * 2+" "));
    }
    int sum(int a, int b){
        return a+b;
    }
}
