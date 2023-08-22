package A_Theory.OOP.AbstractInterfacesAnnotations.AbstractDemo;

public class Son extends AbstractDemo {
    public Son(int age){
        super(age);
    }
    @Override
    public void normal(){
        System.out.println("I am inside son's normal");
    }
    @Override
    void carrer(String carrerName){
        System.out.println("I am going to be "+carrerName);
    }

    @Override
    void partner(String name, String age){
        System.out.println("I love "+name+" and she is "+age+" years old");
    }
}
