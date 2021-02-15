import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {


    public void runPrompt() {
        PlanItem p = new PlanItem();
        p.printUI();
        HashMap<String, ArrayList<String>> dic = new HashMap<>();
        while (true) {
            System.out.println("명령(1, 2, 3, h, q)");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String chose = scanner.next();
            if("1".equals(chose)){
                dic = p.enrollSchedule(dic);
            }else if ("2".equals(chose)){
                p.searchSchedule(dic);
            }else if ("3".equals(chose)){
                p.printCalendar();
            }else if ("h".equals(chose)){
                p.printUI();
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
