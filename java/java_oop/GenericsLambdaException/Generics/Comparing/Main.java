package java.java_oop.GenericsLambdaException.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Student varun = new Student(50, 84.5f);
        Student sahil = new Student(47, 80.1f);
        Student sunil = new Student(49, 86.0f);
        Student sourabh = new Student(48, 70.6f);
        Student ana = new Student(2, 87.1f);


        Student[] studentsList = {varun, sahil, sunil, sourabh, ana};
        System.out.println(Arrays.toString(studentsList));

        Arrays.sort(studentsList);
        System.out.println(Arrays.toString(studentsList));

        Arrays.sort(studentsList, (obj1, obj2) -> (int)(obj1.marks - obj2.marks));
        System.out.println(Arrays.toString(studentsList));
        
        Arrays.sort(studentsList, (obj1, obj2) -> -(int)(obj1.marks - obj2.marks));
        
        System.out.println(Arrays.toString(studentsList));

        // if(varun > sahil){
        //     System.out.println("Varun has more marks");
        // }else{
        //     System.out.println("Sahil has more marks");
        // }

        // correct way

        int diff = varun.compareTo(sahil);

        if(diff > 0){
            System.out.println("Varun has more marks");
        }else if (diff == 0){
            System.out.println("Both has same marks");
        }else{
            System.out.println("Sahil has more marks");
        }


    }
}
