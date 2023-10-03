package com.oop.GenericsLambdaException.Generics;
import java.util.Arrays;

public class CustomGenericArrayList <T> {   // <T> T means template, we can use any
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   // also working as index value

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        // copy the current items into new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size(){
        return size;
    }

    public T pop(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int idx){
        return (T) data[idx];
    }

    public void set(int idx, T value){
        data[idx] = value;
    }

    public String toString(){
        return "Array = "+Arrays.toString(data)+" size = "+size;
    }
}