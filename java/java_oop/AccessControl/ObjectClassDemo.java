
public class ObjectClassDemo extends Object {

    int n1, n2;

    ObjectClassDemo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectClassDemo obj1 = new ObjectClassDemo(10, 20);
        System.out.println(obj1.hashCode());

        ObjectClassDemo obj2 = new ObjectClassDemo(5, 15);

        if(obj1 != obj2){   // checking if obj1 and obj2 are refering to same object
            System.out.println("Not equal");
        }

        if(!obj1.equals(obj2)){ // checking if obj1 and obj2 have same content
            System.out.println("Not equal");
        }
    }
}

class Child extends ObjectClassDemo{
    Child(int n1, int n2){
        super(n1, n2);
    }
    public static void main(String[] args) {
        Child childObj = new Child(1, 4);
        System.out.println(childObj.getClass());
    }
}