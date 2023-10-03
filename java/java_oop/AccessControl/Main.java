
public class Main {
    public static void main(String[] args) {
        ClassA obj = new ClassA(10, "Varun");

        // need to do a few things
        // 1) access and 2) modify data members

        // System.out.println(obj.num);    // num is private
        String str1 = obj.name;
        System.out.println(str1);
    }
}
