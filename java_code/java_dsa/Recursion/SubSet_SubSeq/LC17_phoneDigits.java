package java_code.java_dsa.Recursion.SubSet_SubSeq;

public class LC17_phoneDigits {
    public static void main(String[] args) {
        pad("", "12");
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2.
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
}
