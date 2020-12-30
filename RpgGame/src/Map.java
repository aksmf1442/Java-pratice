public class Map {
    private String[][] gameMap = new String[11][11];
    private String[][] gameMineMap = new String[11][11];
    private final String background = "*";

    public Map(){
        for(int i = 0; i < gameMap.length; i++){
            for (int j = 0; j < gameMap[0].length; j++){
                gameMap[i][j] = background;
                gameMineMap[i][j] = background;
            }
        }
    }

    public String[][] getGameMap() {
        return gameMap;
    }

    public void setGameMap(String[][] gameMap) {
        this.gameMap = gameMap;
    }

    public String[][] getGameMineMap() {
        return gameMineMap;
    }

    public void setGameMineMap(String[][] gameMineMap) {
        this.gameMineMap = gameMineMap;
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
