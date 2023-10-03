package java.java_dsa.Recursion.AdityaVerma.InputOutput;

public class Subset {
    public static void main(String[] args) {
        printSubSet("abc", "");
    }
    static void printSubSet(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return;
        }
        // Not choose
        printSubSet(ip.substring(1), op);
        // choose
        printSubSet(ip.substring(1), op+ip.charAt(0));
    }
}
