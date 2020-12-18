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

    public int getDays(int year, int month){
        int days = 1;
        Calendar cal = new Calendar();
        for (int i = 1; i < year; i++){
            int delta = cal.isLeapYear(i) ? 366 : 365;
            days += delta;
        }
        for (int i = 1; i < month; i++){
            days = cal.getMaxDaysOfMonth(year, i);
        }
        return days % 7;
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
            System.out.println("년도를 입력하세요.(-1을 입력하면 루프가 멈춥니다.)");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            if (year == -1){
                break;
            }
            if (year < 1) {
                System.out.println(year+"년은 없습니다.");
                continue;
            }
            System.out.println("월을 입력하세요.(-1을 입력하면 루프가 멈춥니다.)");
            System.out.print("MONTH> ");
            month = scanner.nextInt();
            count = getDays(year, month);
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
