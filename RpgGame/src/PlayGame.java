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

public class PlayGame {
    private static final String[][] gameMap = new String[11][11];
    private int INIT_LOCATION = 5;
    private int[] moveX = {-1,1,0,0};
    private int[] moveY = {0,0,-1,1};
    private String background = "*";
    private String player = "P";
    private String mine = "M";
    private String monster = "O";

    public static void main(String[] args){
        PlayGame p = new PlayGame();
        Random random = new Random();
        p.initPlayer();
        p.initMine(random);
        p.initMonster(random);
        p.initBackground();
        p.printMap();
    }

    private void printMap(){
        for (String[] i : gameMap) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private void initPlayer(){
        gameMap[INIT_LOCATION][INIT_LOCATION] = player;
    }

    private void initMine(Random random){
        int x = random.nextInt(11);
        int y = random.nextInt(11);
        gameMap[x][y] = mine;
    }

    private void initMonster(Random random){
        int x = random.nextInt(11);
        int y = random.nextInt(11);
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