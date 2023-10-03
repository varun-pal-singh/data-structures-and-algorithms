package java.java_oop.PrinciplesOfOOP.Inheritance;

// whenever you declear a class as final all the methods of this class will also be final

public /* final */ class Box {  
    double length, width, height;
    private boolean isEmpty;
    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
        this.isEmpty = true;
    }

    // cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // cuboid with isEmpty
    Box(double length, double width, double height, boolean isEmpty){
        this.length = length;
        this.width = width;
        this.height = height;     
        this.isEmpty = isEmpty;
    }

    // cuboid with isEmpty
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // from another box object, lol
    Box(Box argObj){
        this.length = argObj.length;
        this.width = argObj.width;
        this.height = argObj.height;
        this.isEmpty = argObj.isEmpty;
    }

    public void information(){
        System.out.println("Running the box");
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    // one way
    // public BoxWeight(double length, double width, double height, double weight){
    //     this.length = length;
    //     this.width = width;
    //     this.height = height;
    //     this.weight = weight;
    // }

    // better way

    public BoxWeight(double length, double width, double height, double weight){
        // used to initialise properties which are in parent class.
        // here super() takes properties which belong to parent class and call the constructor which takes 3 arguments, as constructors can be many.
        super(length, width, height); 

        this.weight = weight;
    }

    // with private property
    public BoxWeight(double length, double width, double height, double weight, boolean isEmpty){
        // used to initialise properties which are in parent class.
        // here super() takes properties which belong to parent class and call the constructor which takes 3 arguments, as constructors can be many.
        super(length, width, height, isEmpty); 

        this.weight = weight;
        // this.isEmpty = false;    // can't access isEmpty because it is private
    }

    public BoxWeight(BoxWeight obj){
        super(obj);
        this.weight = obj.weight;
    }
}

class BoxPrice extends BoxWeight{
    int price;
    BoxPrice(){
        this.price = 0;
    }
    BoxPrice(double length, double width, double height, double weight, int price){
        super(length, width, height, weight);
        this.price = price;
    }
    BoxPrice(BoxWeight b1){
        super(b1);
    }
}
