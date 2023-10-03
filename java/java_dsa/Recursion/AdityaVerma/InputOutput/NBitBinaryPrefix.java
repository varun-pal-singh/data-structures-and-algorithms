package java.java_dsa.Recursion.AdityaVerma.InputOutput;
import java.util.ArrayList;
/*num = 11010
 * prefix = 11010, 1101, 110, 11, 1 in all cases 1 should be 
 * greater than or equal to 0.
 */

public class NBitBinaryPrefix {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
    static void print(int n){
        int ones = n/2 + n%2, zeros = n - ones;
        // System.out.println(ones+" "+zeros); // ones will always be greater than or equal to zeros

        System.out.println(solve(ones, zeros, ""));

        System.out.println(solve2(n, 0, 0, ""));
    }

    static ArrayList<String> solve(int ones, int zeros, String op){
        ArrayList<String> list = new ArrayList<>();
        if(ones == 0 && zeros == 0){
            list.add(op);
            return list;
        }
        if(ones > 0 || op.isEmpty()){
            list.addAll(solve(ones - 1, zeros, op+"1"));
        }
        if(zeros > 0){
            list.addAll(solve(ones, zeros-1, op+"0"));
        }
        return list;
    }
    
    static ArrayList<String> solve2(int num, int ones, int zeros, String op){
        ArrayList<String> list = new ArrayList<>();
        if(num <= 0){
            list.add(op);
            return list;
        }
        if(num > 0){
            list.addAll(solve2(num - 1, ones + 1, zeros, op+"1"));
        }
        if(ones > zeros){
            list.addAll(solve2(num - 1, ones, zeros + 1, op+"0"));
        }
        return list;
    }
}
