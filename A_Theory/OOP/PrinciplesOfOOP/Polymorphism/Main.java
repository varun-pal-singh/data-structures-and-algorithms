package A_Theory.OOP.PrinciplesOfOOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes   shapes = new Shapes();
        Circle   circle = new Circle();
        Square   square = new Square();
        Triangle triangle = new Triangle();

        shapes.area();
        circle.area();
        square.area();
        triangle.area();

        System.out.println();

        // reference class define methods which are available to object and,
        // type of object define which method one to call (if type of doesn't have that method then it will call the ref class type method)
        // this is called dynamic method dispatch, it is mechanism by which a call to overridden method resolve in runtime.

        Shapes sq1 = new Square();
        sq1.area(); // it will call the method which is present in Shapes but overrided in Square class
    }
}
