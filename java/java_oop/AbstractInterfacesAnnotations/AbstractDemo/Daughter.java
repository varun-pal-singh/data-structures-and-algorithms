package java.java_oop.AbstractInterfacesAnnotations.AbstractDemo;

    public class Daughter extends AbstractDemo{
        public Daughter(int age){
            super(age);
        }

        @Override
        void carrer(String carrerName){
            System.out.println("I am going to be "+carrerName);
        }

        @Override
        void partner(String name, String age){
            System.out.println("I love "+name+"and he is "+age+" years old");
        }
}
