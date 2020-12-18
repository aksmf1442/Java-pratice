public class Calculator {
    public static int calculate(int a, String b, int c) {
        if ("+".equals(b)) {
            a += c;
        }else if ("-".equals(b)){
            a -= c;
        }else if ("*".equals(b)){
            a *= c;
        }else if ("/".equals(b)){
            a /= c;
        }else{
            System.out.println("Symbol값이 잘못 되었습니다.");
        }
        return a;
    }
}
