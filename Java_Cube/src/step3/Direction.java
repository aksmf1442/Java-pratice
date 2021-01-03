package step3;

import java.util.ArrayList;

public class Direction {
    private String directionInit;
    private ArrayList<String> direction;

    public Direction(String directionInit){
        this.directionInit = directionInit;
        direction = new ArrayList<>();
        replaceDirection();
        classifyDirection();
    }

    private void classifyDirection() {
        for (String d : directionInit.split("")){
            if(Character.isDigit(d.charAt(0)) && Integer.parseInt(d) != 2){
                direction.add(String.format("%s는 없는 기호입니다.", d));
                continue;
            }
            if (d.contains("UuDdRrLlFfBb") || (!direction.isEmpty()&&Character.isDigit(d.charAt(0)))){
                direction.add(d);
            }
            else{
                direction.add(String.format("%s는 없는 기호입니다.", d));
            }
        }
    }

    private void replaceDirection(){
        directionInit = directionInit.replace("U'","u");
        directionInit = directionInit.replace("D'","d");
        directionInit = directionInit.replace("R'","r");
        directionInit = directionInit.replace("L'","l");
        directionInit = directionInit.replace("F'","f");
        directionInit = directionInit.replace("B'","b");
    }

    public ArrayList<String> getDirection() {
        return direction;
    }
}
