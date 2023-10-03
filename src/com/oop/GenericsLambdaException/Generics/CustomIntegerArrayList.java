package com.oop.GenericsLambdaException.Generics;

import java.util.Arrays;
public class CustomIntegerArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   // also working as index value

    public CustomIntegerArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        // copy the current items into new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size(){
        return size;
    }

    public int pop(){
        int removed = data[--size];
        return removed;
    }

    public int get(int idx){
        return data[idx];
    }

    public void set(int idx, int value){
        data[idx] = value;
    }

    public String toString(){
        return "Array = "+Arrays.toString(data)+" size = "+size;
    }
}
