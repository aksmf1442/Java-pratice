import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Mine {
    private final String mine = "X";
    private int MINE_COUNT = 1;
    private ArrayList<int[]> mineXY = new ArrayList<>();

    public Mine(int[] player, int[] monster){
        randomMine(player, monster);
    }

    public void initMineXY(){
        mineXY = new ArrayList<>();
    }

    public ArrayList<int[]> getMineXY() {
        return mineXY;
    }

    public void setMineXY(ArrayList<int[]> mineXY) {
        this.mineXY = mineXY;
    }

    public int getMINE_COUNT() {
        return MINE_COUNT;
    }

    public void setMINE_COUNT(int MINE_COUNT) {
        this.MINE_COUNT = MINE_COUNT;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "mine='" + mine + '\'' +
                ", MINE_COUNT=" + MINE_COUNT +
                ", mineXY=" + mineXY +
                '}';
    }

    public void randomMine(int[] player, int[] monster){
        Random random = new Random();
        for (int i = 0; i < MINE_COUNT; i++){
            while (true){
                int x = random.nextInt(11);
                int y = random.nextInt(11);
                int[] xy = {x,y};
                if (!Arrays.equals(player,xy) && (!Arrays.equals(monster,xy)) && (!mineXY.contains(xy))){
                    mineXY.add(xy);
                    break;
                }
            }
        }

    }


}
