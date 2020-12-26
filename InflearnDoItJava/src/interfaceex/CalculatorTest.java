package interfaceex;

public class CalculatorTest {
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        // 밑에 두 개는 인스턴스화가 될 수 없다.
//        Calc calc1 = new Calc();
//        Calc calc2 = new Calculator();

        System.out.println(calc.add(num1, num2));

        calc.description();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
