import java.util.Scanner;

public class Prompt {

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        // 객체 생성
        Calendar cal = new Calendar();
        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR> ");
            int year = scanner.nextInt();
            System.out.println("월을 입력하세요.(-1을 입력하면 루프가 멈춥니다.)");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();
            if (month == -1){
                break;
            }
            if (month < 13 && month > 0) {
                cal.printCalendar(year,month);
            }else{
                System.out.println(month+"월은 없습니다.");
            }
        }
        System.out.println("Bye~");
    }

    public static void main(String[] args) {
        // 셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
