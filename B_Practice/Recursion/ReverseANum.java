package B_Practice.Recursion;

public class ReverseANum {
    public static void main(String[] args) {
        int num = 1563054;
        System.out.println(reverse(num));
    }
    static int reverse(int num){
        int ans = 0;
        return solve(num, ans);
    }
    static int solve(int n, int temp){
        if(n <= 0){
            return temp;
        }
        int digit = n % 10;
        return solve(n/10, temp*10+digit);
    }
}
