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

import java.util.Random;
import java.util.Scanner;

public class PlayGame {
    private final String[][] gameMap = new String[11][11];
    private final int INIT_LOCATION = 5;
    private final int[] moveX = {-1,0,1,0};
    private final int[] moveY = {0,-1,0,1};
    private final String background = "*";
    private final String player = "P";
    private final String mine = "M";
    private final String monster = "O";
    private int[] playerXY = new int[2];
    private int[] mineXY = new int[2];
    private int[] monsterXY = new int[2];

    public static void main(String[] args){
        PlayGame p = new PlayGame();
        Random random = new Random();
        p.initPlayer();
        p.initMine(random);
        p.initMonster(random);
        p.initBackground();
        p.printMap();
        p.play();
    }

    private void printMap(){
        for (String[] i : gameMap) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private void MoveW(){
        gameMap[playerXY[0]][playerXY[1]] = background;
        playerXY[0] += moveX[0];
        playerXY[1] += moveY[0];
        gameMap[playerXY[0]][playerXY[1]] = player;
    }
    private void MoveA(){
        gameMap[playerXY[0]][playerXY[1]] = background;
        playerXY[0] += moveX[1];
        playerXY[1] += moveY[1];
        gameMap[playerXY[0]][playerXY[1]] = player;
    }
    private void MoveS(){
        gameMap[playerXY[0]][playerXY[1]] = background;
        playerXY[0] += moveX[2];
        playerXY[1] += moveY[2];
        gameMap[playerXY[0]][playerXY[1]] = player;
    }
    private void MoveD(){
        gameMap[playerXY[0]][playerXY[1]] = background;
        playerXY[0] += moveX[3];
        playerXY[1] += moveY[3];
        gameMap[playerXY[0]][playerXY[1]] = player;
    }

    private void play(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("WASD중 하나를 입력해주세요.(몬스터를 잡아주세요. 중간에 지뢰가 숨어있고, 밟으면 게임이 종료됩니다.)");
            System.out.print("> ");
            String direction = scanner.next();
            if (direction.equals("W")) MoveW();
            else if(direction.equals("A")) MoveA();
            else if(direction.equals("S")) MoveS();
            else if(direction.equals("D")) MoveD();
            else System.out.println("WASD중에 하나를 입력해주세요.");
            if (playerXY.equals(mineXY)) break;
            printMap();
        }
    }

    private void initPlayer(){
        playerXY[0] = INIT_LOCATION;
        playerXY[1] = INIT_LOCATION;
        gameMap[INIT_LOCATION][INIT_LOCATION] = player;
    }

    private void initMine(Random random){
        int x = random.nextInt(11);
        int y = random.nextInt(11);
        mineXY[0] = x;
        mineXY[1] = y;
        gameMap[x][y] = mine;
    }

    private void initMonster(Random random){
        int x = random.nextInt(11);
        int y = random.nextInt(11);
        monsterXY[0] = x;
        monsterXY[1] = y;
        gameMap[x][y] = monster;
    }

    private void initBackground(){
        for (int i = 0; i < gameMap.length; i++){
            for (int j = 0; j < gameMap.length; j++){
                if (gameMap[i][j] == null){
                    gameMap[i][j] = background;
                }
            }
        }
    }

}