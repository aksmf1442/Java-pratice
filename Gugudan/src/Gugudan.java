
public class Gugudan {
    public static int[] calculate(int times, int second){
        int[] result = new int[second];
        for (int i = 0; i < result.length; i++){
            result[i] = times * (i+1);
        }

        return result;
    }
    public static void print(int[] result){
        System.out.println(result[0]+"단");
        for (int i = 0; i < result.length; i++){
            System.out.printf("%d*%d=%d%n",result[0],i+1,result[i]);
        }
    }
}