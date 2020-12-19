import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {

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

    public void printCalendar(){
        Scanner scanner = new Scanner(System.in);
        // 객체 생성
        Calendar cal = new Calendar();
        int year = 2020;
        int month = 1;
        int count = 0;
        System.out.println("년도를 입력하세요.");
        System.out.print("YEAR> ");
        year = scanner.nextInt();
        if (year < 1) {
            System.out.println(year+"년은 없습니다. 다시 입력해주세요.");
            printCalendar();
        }
        System.out.println("월을 입력하세요.");
        System.out.print("MONTH> ");
        month = scanner.nextInt();
        count = getDays(year, month);
        if (month < 13 && month > 0) {
            cal.printCalendar(year,month, count);
        }else{
            System.out.println(month+"월은 없습니다. 다시 입력해주세요.");
            printCalendar();
        }
    }

    public void printUI(){
        System.out.println("+---------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+---------------+");
    }

    public HashMap<String, ArrayList<String>>  enrollSchedule(HashMap<String, ArrayList<String>> dic){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[일정 등록] 날짜를 입력하세요.");
        System.out.print("> ");
        String date = scanner.nextLine();
        System.out.println("일정을 입력하세요.");
        System.out.print("> ");
        String value = scanner.nextLine();
        System.out.println("일정이 등록되었습니다.");
        ArrayList<String> list = new ArrayList<String>();
        if (dic.containsKey(date)){
            list = dic.get(date);
            list.add(value);
        }else{
            list.add(value);
        }
        dic.put(date, list);
        return dic;
    }

    public void searchSchedule(HashMap<String, ArrayList<String>> dic){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[일정 등록] 날짜를 입력하세요.");
        System.out.print("> ");
        String date = scanner.next();
        ArrayList<String> list = new ArrayList<String>();
        if (dic.containsKey(date)){
            list = dic.get(date);
            System.out.printf("%d개의 일정이 있습니다.%n", list.size());
            for (int i = 0; i < list.size(); i++){
                System.out.println((i+1) + ". " + list.get(i));
            }
        }else{
            System.out.println("일정이 없습니다.");
        }
    }


    public void runPrompt() {
        printUI();
        HashMap<String, ArrayList<String>> dic = new HashMap<String, ArrayList<String>>();
        while (true) {
            System.out.println("명령(1, 2, 3, h, q)");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String chose = scanner.next();
            if("1".equals(chose)){
                dic = enrollSchedule(dic);
            }else if ("2".equals(chose)){
                searchSchedule(dic);
            }else if ("3".equals(chose)){
                printCalendar();
            }else if ("h".equals(chose)){
                printUI();
            }else if ("q".equals(chose)){
                System.out.println("bye~");
                break;
            }else{
                System.out.println("화면에 출력된 단어만 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        // 셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
