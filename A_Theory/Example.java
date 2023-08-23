package A_Theory;

import A_Theory.OOP.GenericsLambdaException.Generics.CustomIntegerArrayList;
// import java.util.Arrays;
public class Example {
    public static void main(String[] args) {
        CustomIntegerArrayList list = new CustomIntegerArrayList();
        for(int i=0; i<15; i++)
            list.add(i);


        System.out.println(list);
        list.pop();
        list.add(15);
        System.out.println(list);
    }
}
