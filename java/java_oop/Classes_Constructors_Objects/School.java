package java.java_oop.Classes_Constructors_Objects;

// classes -> logical construct (not exists physically).
// objects -> physical reality (occuping space in memeory).
public class School {
    public static void main(String[] args) {
        System.out.println();

        Student stu1;   // declaring a reference to Student 
        // class not created a object (stu1 is in stack (ref 
        // variable)). 

        stu1 = new Student();   // created a object of Student 
        // class with reference of stu1 (object is in heap, 
        // stu1 is in stack).
        // "new" keyword dynamically allocates memory and 
        // return a reference to it and which is stored in 
        // reference variable (stu1).

        System.out.println(stu1);

        // stu1.rollNo = 50;
        // stu1.name = "Varun";
        // stu1.marks = 84.50f;
        System.out.println(stu1.name);
        System.out.println(stu1.rollNo);
        System.out.println(stu1.marks);

        Student stu2 = new Student(50, "Varun", 84.5f);
        System.out.println(stu2.name);
        System.out.println(stu2.rollNo);
        System.out.println(stu2.marks);

        // creating object from object.
        Student random = new Student(stu2);

        System.out.println(random.name);
        System.out.println(random.rollNo);
        System.out.println(random.marks);
    }

}

// cteate a class of student
class Student {
    int rollNo;
    String name;
    float marks;

    // constructor defines what will happens when a object is created.
    
    // Default constructor
    Student(){        
        // rollNo = 0; 
        // name = "Default Name";
        // marks = 0.0f;

        // or 

        // calling a constructor from another constructor 
        // Student(rollNo, name, marks);
        this(0, "Default Name", 0.0f);
    }

    // Constructor is a special type of function, that runs 
    // when you create an object and it allocates it some variables.

    // Parameterised constructor
    // Student (int r, String n, float m){ 
        //     rollNo = r; // correct but not a good practice.
        //     name = n;
        //     marks = m;
        // }
        
    Student(int rollNo, String name, float marks){
        // "this" keyword replaces itself with reference 
        // variable of calling object,when constructor is called.
        // obj.rollNo = rollNo;
        this.rollNo = rollNo;   
        this.name = name;
        this.marks = marks;
    }

        // Object as parameter
    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
}
