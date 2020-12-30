// 11 * 11 배열 초기화
// 화면 중앙에는 캐릭터 위치
// 임의의 장소에 몬스터 위치
// 임의의 장소에 1개의 지뢰를 배치한다. 단 지뢰는 플레이어가 밟기 전까지 화면에 표시하지 않는다.
// 콘솔 입력으로 WASD 중 하나의 키를 입력받고 엔터를 누르면 캐릭터가 상좌하우로 이동함
// 캐릭터가 지뢰를 밟으면 사망
// 캐릭터가 몬스터의 위치까지 이동하면 몬스터가 사라지고 정해진 점수 획득
// 점수 획득시 새로운 몬스터와 지뢰를 배치한다. 단 지뢰의 갯수는 2배 증가시킨다.
// 매 턴마다 현재 배열의 상태를 화면에 출력. 단 밟지 않은 지뢰는 표시하지 않는다.
// 똑같이 구현하지 않아도 되니 재미있는 게임을 만들어 보자.

// 캐릭터, 몬스터, 지뢰 맵 못 벗어나게 하기
// 캐릭터, 몬스터, 지뢰 위치 안겹치게 하
// 지뢰 숨기기
// 점수 획득하고 지뢰 증가시켜서 재시작

import java.util.Arrays;
import java.util.Scanner;

public class Play {
    Player player = new Player();
    Monster monster = new Monster();
    Mine mine = new Mine(player.getPlayerXY(), monster.getMonsterXY());
    Map map = new Map(player, monster, mine);
    int monsterCount = 0;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            map.printMap();
            System.out.println("WASD중 하나를 입력해주세요.(몬스터를 잡아주세요. 중간에 지뢰가 숨어있고, 밟으면 게임이 종료됩니다.)");
            System.out.print("> ");
            String direction = scanner.next();
            if (direction.equals("W")) {
                if (errorCheck("W")){
                    continue;
                }
                player.moveW();
                map.setMap(player, monster, mine);
                if (mineCheck()) break;
                if (monsterCheck()) continue;
            } else if (direction.equals("A")) {
                if (errorCheck("A")){
                    continue;
                }
                player.moveA();
                map.setMap(player, monster, mine);
                if (mineCheck()) break;
                if (monsterCheck()) continue;
            } else if (direction.equals("S")) {
                if (errorCheck("S")){
                    continue;
                }
                player.moveS();
                map.setMap(player, monster, mine);
                if (mineCheck()) break;
                if (monsterCheck()) continue;
            } else if (direction.equals("D")) {
                if (errorCheck("D")){
                    continue;
                }
                player.moveD();
                map.setMap(player, monster, mine);
                if (mineCheck()) break;
                if (monsterCheck()) continue;
            } else System.out.println("WASD중에 하나를 입력해주세요.");
        }
    }

    private boolean monsterCheck() {
        if (Arrays.equals(monster.getMonsterXY(),player.getPlayerXY())) {
            mine.setMINE_COUNT(mine.getMINE_COUNT()*2);
            map.printMineMap();
            player.initPlayer();
            monster.setRandom();
            mine.initMineXY();
            mine.randomMine(player.getPlayerXY(), monster.getMonsterXY());
            System.out.println(mine);
            map.setMap(player, monster, mine);
            monsterCount +=1;
            System.out.println("몬스터를 잡았습니다. 다음 스테이지로 이동합니다.(다음 스테이지:" + (monsterCount+1) + ")");
            return true;
        }
        return false;
    }

    private boolean mineCheck() {
        for (int[] arr : mine.getMineXY()){
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(player.getPlayerXY()[0]);
            System.out.println(player.getPlayerXY()[1]);
            if (Arrays.equals(player.getPlayerXY(), arr)){
                map.printMineMap();
                System.out.println("지뢰를 밟아서 게임이 종료됩니다.(잡은 몬스터 수:" + monsterCount + ")");
                return true;
            }
        }
        return false;
    }

    private boolean errorCheck(String check){
        if (check.equals("W") && player.getPlayerXY()[0] == 0){
            System.out.println("경로를 이탈했습니다. 다시 입력해주세요");
            return true;
        }else if (check.equals("A") && player.getPlayerXY()[1] == 0) {
            System.out.println("경로를 이탈했습니다. 다시 입력해주세요");
            return true;
        }else if (check.equals("S") && player.getPlayerXY()[0] == 10) {
            System.out.println("경로를 이탈했습니다. 다시 입력해주세요");
            return true;
        }else if (check.equals("D") && player.getPlayerXY()[1] == 10) {
            System.out.println("경로를 이탈했습니다. 다시 입력해주세요");
            return true;
        }
        return false;
    }


}