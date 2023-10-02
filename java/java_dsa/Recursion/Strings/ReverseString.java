package A_Theory.Recursion.Strings;

public class ReverseString {
    public static void main(String[] args) {
        // reverseString("Varun Pal Singh");
        System.out.println(reverseString("Varun Pal Singh"));
    }
    public static String reverseString(String str){
        if(str.equals("")){
            return "";   
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
