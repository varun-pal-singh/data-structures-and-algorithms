package A_Theory.OOP.AbstractInterfacesAnnotations.Interfaces.NestedInterface;

public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num){
        return (num % 2) == 1;
    }
}


