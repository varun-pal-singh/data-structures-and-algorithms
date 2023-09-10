package A_Theory.Recursion.SubSet_SubSeq;

public class Permutation {
    public static void main(String[] args) {
        String ip = "abc", op = "";
        solve(ip, op);
    }
    static void solve(String ip, String op){
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return;
        }

        char ch = ip.charAt(0);
        for(int i = 0; i <= op.length(); i++){
            String first = op.substring(0, i);
            String second = op.substring(i, op.length());
            // op = first + ch + second;
            solve(ip.substring(1), first + ch + second);
        }
    }
}
