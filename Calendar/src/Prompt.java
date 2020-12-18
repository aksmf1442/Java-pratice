import java.util.Scanner;

public class Prompt {
    public int parseDay(String day){
        String[] days = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
        int count = 0;
        for (int i = 0; i < days.length; i++){
            if (day.equals(days[i])){
                count = i;
                break;
            }
        }
        return count;
    }

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        // 객체 생성
        Calendar cal = new Calendar();
        int year = 2020;
        int month = 1;
        int count = 0;
        String day;
        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            System.out.println("월을 입력하세요.(-1을 입력하면 루프가 멈춥니다.)");
            System.out.print("MONTH> ");
            month = scanner.nextInt();
            System.out.println("첫 번째 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("WEEKDAY> ");
            day = scanner.next();
            count = parseDay(day);
            if (month == -1){
                break;
            }
            if (month < 13 && month > 0) {
                cal.printCalendar(year,month, count);
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
