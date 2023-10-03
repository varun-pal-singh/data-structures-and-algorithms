
public class ClassA {
    private int num;
    String name;
    int[] arr;

    public ClassA(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}
