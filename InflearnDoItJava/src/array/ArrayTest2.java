package array;

public class ArrayTest2 {
    public static void main(String[] args){
        double[] num = new double[]{10,20,30};
        int size = 3;

        double total = 0;

        for(int i = 0; i < size; i++){
            total += num[i];
        }
        System.out.println(total);
    }
}
