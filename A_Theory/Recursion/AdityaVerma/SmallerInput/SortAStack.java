package A_Theory.Recursion.AdityaVerma.SmallerInput;
import java.util.Stack;
public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        int[] inputArr = new int[]{2, 4, 1, 2, 8, 3, 5, 10, 6, 6};
        for(int el : inputArr)
            stk.push(el);
        System.out.println("Before sorting: "+stk);
        sort(stk);
        System.out.println("After sorting: "+stk);
    }
    public static void sort(Stack<Integer> stk){
        if(stk.size() == 1){
            return;
        }
        int temp =  stk.pop();
        sort(stk);
        insert(stk, temp);
        return;
    }
    public static void insert(Stack<Integer> stk, int temp){
        if(stk.size() == 0 || stk.peek() <= temp){
            stk.push(temp);
            return;
        }
        int val = stk.pop();
        insert(stk, temp);
        stk.push(val);
        return;
    }
}
