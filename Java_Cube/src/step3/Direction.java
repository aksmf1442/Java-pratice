package step3;

import java.util.ArrayList;
import java.util.Random;

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
            if (("U u D d R r L l F f B b").contains(d)){
                direction.add(d);
            }else{
                direction.add(String.format("%s는 없는 기호입니다.", d));
            }
            if(!direction.isEmpty()&&Character.isDigit(d.charAt(0))){
                direction.add(direction.get(direction.toArray().length-1));
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

    public static String getRandomDirection(){
        Random random = new Random();
        String[] arr = new String[]{"U","u","D","d","F","f","B","b","R","r","L","l"};
        int idx = random.nextInt(12);
        return arr[idx];
    }

    public static String reverseReplaceDirection(String s) {
        s = s.replace("u","U'");
        s = s.replace("d","D'");
        s = s.replace("r","R'");
        s = s.replace("l","L'");
        s = s.replace("f","F'");
        s = s.replace("b","B'");
        return s;
    }
}
