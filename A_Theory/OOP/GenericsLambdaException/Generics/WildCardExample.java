package A_Theory.OOP.GenericsLambdaException.Generics;

import java.util.Arrays;
import java.util.List;

        /* This is wild card to only allow certain types to be T*/ 
        // here T should be either be Number or subclasses of Number class
public class WildCardExample <T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   // also working as index value

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

                    /*This is other example of wild card */
                    /*Here you can either give List of Number class or its sub classes */
    public void getNum(List <? extends Number> li){
        // do something
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
