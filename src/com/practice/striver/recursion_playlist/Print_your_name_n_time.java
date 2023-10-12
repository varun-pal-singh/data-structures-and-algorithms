package com.practice.striver.recursion_playlist;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Print_your_name_n_time {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name !");
        String name = in.nextLine();
        System.out.println("How many time you want your name to be printed");
        int n = in.nextInt();
        print(name, 1, n);
        System.out.println("Want to repeat ? (y/n)");
        String response = in.nextLine();
        if(response.equals("y"))
            print(name, 1, n);
    }
    public static void print(String str, int i, int n){
        if(i > n)  return;
        System.out.println(str);
        print(str, i + 1, n);
    }
}
