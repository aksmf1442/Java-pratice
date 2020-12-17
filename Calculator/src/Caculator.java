import java.util.Scanner;

public class Caculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int result = 0;
        String tmp = "";
        String[] arr = n.split(" ");
        System.out.println("입력 값:"+n);
        for (int i = 0; i < arr.length; i++){
            if (i%2 == 0) {
                if (tmp.equals("+")){
                    result += Integer.parseInt(arr[i]);
                    System.out.println("덧셈:"+result);
                }else if (tmp.equals("-")){
                    result -= Integer.parseInt(arr[i]);
                    System.out.println("뺄셈:"+result);
                }else if (tmp.equals("*")){
                    result *= Integer.parseInt(arr[i]);
                    System.out.println("곱셈:"+result);
                }else if (tmp.equals("/")){
                    result /= Integer.parseInt(arr[i]);
                    System.out.println("나눗:"+result);
                }else{
                    result += Integer.parseInt(arr[i]);
                }
            }else{
                tmp = arr[i];
                System.out.println("Symbol:"+tmp);
            }
        }
        System.out.println("최종결과값:"+result);
    }
}
