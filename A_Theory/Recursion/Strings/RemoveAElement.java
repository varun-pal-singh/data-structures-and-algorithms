package A_Theory.Recursion.Strings;

public class RemoveAElement {
    public static void main(String[] args) {
        String str1 = "Varun Pal Singh";
        char el = 'a';
        System.out.println("Before : "+str1);
        System.out.println("After : "+removeEl(str1, el));

        // or
        System.out.println("After1 : "+skip(str1, el));
    }
    static String removeEl(String ip, char target){
        return solve(ip, "", target);
    }
    static String solve(String ip, String op, char target){
        if(ip.isEmpty()){
            return op;
        }
        char currChar = ip.charAt(0);
        if(currChar == target){
            return solve(ip.substring(1), op, target);
        }else{
            return solve(ip.substring(1), op+currChar, target);
        }
    }

    static String skip(String ip, char el){
        if(ip.isEmpty()){
            return "";
        }
        char currChar = ip.charAt(0);
        if(currChar == el){
            return skip(ip.substring(1), el);
        }else{
            return currChar + skip(ip.substring(1), el);
        }
    }
}
