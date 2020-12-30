import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    private String[][] gameMap = new String[11][11];
    private String[][] gameMineMap = new String[11][11];
    private final String BACKGROUND = "*";
    private final String PLAYER_VALUE = "P";
    private final String MINE_VALUE = "X";
    private final String MONSTER_VALUE = "M";

    public Map(Player player, Monster monster, Mine mine){
        setMap(player, monster, mine);
    }

    public void setMap(Player player, Monster monster, Mine mine){
        int[] p = player.getPlayerXY();
        int[] m = monster.getMonsterXY();
        ArrayList<int[]> min = mine.getMineXY();
        gameMap[p[0]][p[1]] = PLAYER_VALUE;
        gameMineMap[p[0]][p[1]] = PLAYER_VALUE;
        gameMap[m[0]][m[1]] = MONSTER_VALUE;
        gameMineMap[m[0]][m[1]] = MONSTER_VALUE;
        for (int[] mi : min){
            gameMineMap[mi[0]][mi[1]] = MINE_VALUE;
        }
        for(int i = 0; i < gameMap.length; i++){
            for (int j = 0; j < gameMap[0].length; j++){
                int[] xy = {i,j};
                if ((!Arrays.equals(p, xy)) && (!Arrays.equals(m, xy))){
                    gameMap[i][j] = BACKGROUND;
                }
                if ((!Arrays.equals(p, xy)) && (!Arrays.equals(m, xy))) {
                    boolean is_true = true;
                    for (int[] mm : min){
                        if (Arrays.equals(mm,xy)){
                            is_true = false;
                        }
                    }
                    if (is_true) gameMineMap[i][j] = BACKGROUND;
                }
            }
        }
    }

    public void printMap(){
        for (String[] i : gameMap) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void printMineMap(){
        for (String[] i : gameMineMap) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
