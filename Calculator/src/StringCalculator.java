import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = n.split(" ");
        int result = Integer.parseInt(arr[0]);
        int i = 1;
        System.out.println("first:"+result);
        while (i < arr.length){
            System.out.println("Symbol:"+arr[i]);
            result = Calculator.calculate(result, arr[i], Integer.parseInt(arr[i+1]));
            System.out.println("second:"+result);
            i += 2;
        }
        System.out.println("결과값:"+result);
    }
}
