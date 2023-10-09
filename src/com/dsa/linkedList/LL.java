package com.dsa.linkedList;
import java.util.LinkedList;
public class LL {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
