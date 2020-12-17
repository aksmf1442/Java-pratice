import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        System.out.println("쉼표를 사이에 두고 숫자를 적어주세요.ex)7,8 ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        if (first >= 2) {
            for (int j = 2; j <= first; j++) {
                Gugudan.print(Gugudan.calculate(j, second));
            }
        }else{
            System.out.println("첫번째 문자를 2이상 적어주세요.");
        }
    }
}
