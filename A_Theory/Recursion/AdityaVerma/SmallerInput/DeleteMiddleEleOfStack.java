package A_Theory.Recursion.AdityaVerma.SmallerInput;
import java.util.Stack;

public class DeleteMiddleEleOfStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = {1, 3, 4, 7, 10, 5, 3, 5};
        for(int el : arr){
            stk.push(el);
        }
        if(stk.size() > 1){
            int k = stk.size()/2 ;
            System.out.println("Before deletion: "+stk);
            System.out.println("Target is: "+stk.get(k ));
            deleteMiddleEl(stk, stk.get(k));    // passing target element;
            // deleteMiddleEl2(stk, k);    // passing target's index;
            System.out.println("After deletion: "+stk);
        }
    }

    // k is middle element which is to be deleted
    public static void deleteMiddleEl(Stack<Integer> stk, int k){
        if(stk.size() == 1){
            return;
        }
        int temp = stk.pop();
        deleteMiddleEl(stk, k);
        if(temp != k)
            stk.push(temp);
        return;
    }

    public static void deleteMiddleEl2(Stack<Integer> stk,int k){
        if(k == 1){
            stk.pop();
            return;
        }
        int temp = stk.pop();
        deleteMiddleEl2(stk, k - 1);
        stk.push(temp);
        return;
    }
}
