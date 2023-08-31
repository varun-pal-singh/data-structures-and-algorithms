package A_Theory.Recursion.AdityaVerma.SmallerInput;

public class TowerOfHanoi {
    public static void main(String[] args) {
        solve(3, "source", "destination", "helper");
    }
    static void solve(int n, String s, String d, String h){
        if(n == 1){
            System.out.println("Moving plate "+n+" from "+s+" to "+d);
            return;
        }
        solve(n - 1, s, h, d);
        System.out.println("Moving plate "+n+" from "+s+" to "+d);
        solve(n - 1, h, d, s);
    }
}
 