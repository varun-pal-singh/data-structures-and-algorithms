package A_Theory.Recursion.AdityaVerma.InputOutput;
import java.util.ArrayList;

public class PerWithCaseChange {
    public static void main(String[] args) {
        String ip = "abcd", op = "";
        // printPerWithCaseChange(ip, op);
        System.out.println(printPerWithCaseChange2(ip, op));
    }
    public static void printPerWithCaseChange(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+", ");
            return;
        }
        char caseChange = ip.toUpperCase().charAt(0);
        printPerWithCaseChange(ip.substring(1), op+ip.charAt(0));
        printPerWithCaseChange(ip.substring(1), op+caseChange);
    }

    static ArrayList<String> printPerWithCaseChange2(String ip, String op){
        ArrayList<String> list = new ArrayList<>();
        if(ip.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(op);
            return temp;
        }
        char caseChange = ip.toUpperCase().charAt(0);

        list.addAll(printPerWithCaseChange2(ip.substring(1), op+ip.charAt(0)));

        list.addAll(printPerWithCaseChange2(ip.substring(1), op+caseChange));

        return list;
    }
}
