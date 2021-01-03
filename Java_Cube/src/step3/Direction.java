package step3;

import java.util.ArrayList;

public class Direction {
    String directionInit;
    ArrayList<String> direction;

    public Direction(String directionInit){
        this.directionInit = directionInit;
        replaceDirection();
        direction = new ArrayList<>();
    }

    private void replaceDirection(){
        directionInit = directionInit.replace("U'","u");
        directionInit = directionInit.replace("D'","d");
        directionInit = directionInit.replace("R'","r");
        directionInit = directionInit.replace("L'","l");
        directionInit = directionInit.replace("F'","f");
        directionInit = directionInit.replace("B'","b");
    }

    


}
