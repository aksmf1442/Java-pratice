import java.util.Random;
import java.util.Scanner;

public class OddorEven {
    public String getUserName(String player1, Scanner scanner){
        System.out.println("게임을 진행할 유저의 닉네임을 입력해주세요.");
        System.out.print("> ");
        player1 = scanner.nextLine();
        return player1;
    }



    public void playgame(OddorEven o){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String player1="";
        player1 = o.getUserName(player1, scanner);
        int p1money = 100, p2money = 120;
        String p1="";
        int p2 = 0, count = 0;
        while (p1money != 0){
            p2 = random.nextInt(19)+1;
            System.out.println("[홀, 짝] 둘 중 하나를 입력해주세요");
            System.out.print("> ");
            p1 = scanner.next();
            System.out.println("얼마를 배팅하실건지 입력해주세요.");
            System.out.print("> ");
            int bet = scanner.nextInt();
            if (p1money < bet || p2money < bet){
                System.out.printf("베팅 금액이 %s님이나 상대방의 소지금액보다 큽니다. 처음부터 다시 입력해주세요.%n", player1);
                System.out.printf("현재 %s님의 소지금액 %d, 상대방의 소지금액 %d%n", player1, p1money, p2money);
                continue;
            }
            if (p2 % 2 == 0){
                if (p1.equals("짝")){
                    System.out.printf("상대방이 배팅한 수인 %d는 짝수이므로 %s님이 승리하였습니다.%n", p2, player1);
                    p1money += bet;
                    p2money -= bet;
                }else{
                    System.out.printf("상대방이 배팅한 수인 %d는 짝수이므로 %s님이 패하였습니다.%n", p2, player1);
                    p1money -= bet;
                    p2money += bet;
                }
            }else{
                if (p1.equals("홀")){
                    System.out.printf("상대방이 배팅한 수인 %d는 홀수이므로 %s님이 승리하였습니다.%n", p2, player1);
                    p1money += bet;
                    p2money -= bet;
                }else{
                    System.out.printf("상대방이 배팅한 수인 %d는 홀수이므로 %s님이 패하였습니다.%n", p2, player1);
                    p1money -= bet;
                    p2money += bet;
                }
            }
            System.out.printf("현재 %s님의 소지금액 %d, 상대방의 소지금액 %d%n", player1, p1money, p2money);
            if (p2money == 0){
                System.out.printf("%d스테이지 클리어!%n", count+1);
                count +=1;
                p2money = p1money * (int)Math.pow(1.2, count+1);
            }
            if (count == 8) break;
        }
        if (p1money == 0){
            System.out.printf("[%d스테이지] %s님의 소지금액이 0원이기 때문에 게임을 종료합니다.", (count+1), player1);
        }else{
            System.out.printf("모든 스테이지를 클리어 하셨습니다!");
        }
    }

    public static void main(String[] args){
        OddorEven o = new OddorEven();
        o.playgame(o);
    }
}
