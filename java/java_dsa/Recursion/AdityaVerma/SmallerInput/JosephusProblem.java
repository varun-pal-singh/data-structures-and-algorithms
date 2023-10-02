package A_Theory.Recursion.AdityaVerma.SmallerInput;
import java.util.ArrayList;
public class JosephusProblem {
    public static void main(String[] args) {
        int n = 40, k = 7;
        ArrayList<Integer> persons = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            persons.add(i);
        }
        System.out.println(givePosition(persons, k-1, 0));
    }

    static int givePosition(ArrayList<Integer> persons, int k, int idx){
        if(persons.size() <= 1){
            return persons.get(0);
        }
        idx = (idx + k) % persons.size();
        persons.remove(idx);
        return givePosition(persons, k, idx);
    }
}
