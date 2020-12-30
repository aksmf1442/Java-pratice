import java.util.Random;

public class Monster {
    private int[] monsterXY = new int[2];

    public Monster(){
        setRandom();
    }

    public void setRandom(){
        Random random = new Random();
        int x, y;
        while (true){
            x = random.nextInt(11);
            y = random.nextInt(11);
            if (x != 5 || y != 5){
                break;
            }
        }
        monsterXY[0] = x;
        monsterXY[1] = y;
    }

    public int[] getMonsterXY() {
        return monsterXY;
    }
}
