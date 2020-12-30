public class Player {
    private final int INIT_LOCATION = 5;
    private final int[] moveX = {-1,0,1,0};
    private final int[] moveY = {0,-1,0,1};
    private int[] playerXY = new int[2];

    public Player(){
        initPlayer();
    }

    public void initPlayer(){
        playerXY[0] = INIT_LOCATION;
        playerXY[1] = INIT_LOCATION;
    }

    public int[] getPlayerXY() {
        return playerXY;
    }

    public void moveW(){
        playerXY[0] += moveX[0];
        playerXY[1] += moveY[0];
    }
    public void moveA(){
        playerXY[0] += moveX[1];
        playerXY[1] += moveY[1];
    }
    public void moveS(){
        playerXY[0] += moveX[2];
        playerXY[1] += moveY[2];
    }
    public void moveD(){
        playerXY[0] += moveX[3];
        playerXY[1] += moveY[3];
    }
}
