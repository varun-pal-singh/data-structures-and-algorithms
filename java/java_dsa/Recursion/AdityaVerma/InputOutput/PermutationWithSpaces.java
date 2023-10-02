package A_Theory.Recursion.AdityaVerma.InputOutput;
import java.util.ArrayList;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        String ip = "abcd", op = "";
        printPermutationWithSpaces(ip, op);

        System.out.println();
        
        System.out.println(printPermutationWithSpaces2(ip, op));
    }
    static void printPermutationWithSpaces(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+", ");
            return;
        }
        if(ip.length() == 1){
            printPermutationWithSpaces(ip.substring(1), op+ip.charAt(0));
            return;
        }
        printPermutationWithSpaces(ip.substring(1), op+ip.charAt(0)+" ");
        printPermutationWithSpaces(ip.substring(1), op+ip.charAt(0));
    }

    static ArrayList<String> printPermutationWithSpaces2(String ip, String op){
        ArrayList<String> list = new ArrayList<>();

        if(ip.length() == 1){
            list.addAll(printPermutationWithSpaces2(ip.substring(1), op+ip.charAt(0)));
            return list;
        }
        if(ip.isEmpty()){
            list.add(op);
            return list;
        }
        list.addAll(printPermutationWithSpaces2(ip.substring(1), op+ip.charAt(0)+" "));
        list.addAll(printPermutationWithSpaces2(ip.substring(1), op+ip.charAt(0)));
        return list;
    }
}
