package java.java_oop.GenericsLambdaException.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String toString(){
        return marks + "";
    }

    @Override
    public int compareTo(Student stu){
        // System.out.println("In compareTo method");
        int diff = (int) (this.marks - stu.marks);
        // diff == 0, both are equal
        // diff < 0, this.marks is less
        // diff > 0, this.marks is more
        return diff;
    }
}
