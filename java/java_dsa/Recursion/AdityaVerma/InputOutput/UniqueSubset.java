package A_Theory.Recursion.AdityaVerma.InputOutput;
import java.util.HashSet;
import java.util.ArrayList;

public class UniqueSubset {
    public static void main(String[] args) {
        String ip = "cba", op = "";
        System.out.println(printUnique(ip, op));
    }
    static ArrayList<String> printUnique(String ip, String op){
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        if(ip.isEmpty()){
            set.add(op);
            list.addAll(set);
            return list;
        }
        set.addAll(printUnique(ip.substring(1), op));
        set.addAll(printUnique(ip.substring(1), op+(ip.charAt(0))));
        list.addAll(set);
        return list;
    }
}