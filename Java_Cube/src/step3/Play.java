package step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        Cube cube = new Cube();
        Play play = new Play();
        cube.printCube();
        play.chooseRandomInput(cube, play);
        result(beforeTime, cube);
    }

    private static void result(long beforeTime, Cube cube) {
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        int minutes = (int)(secDiffTime/60);
        String minute = Integer.toString(minutes);
        int seconds = (int)(secDiffTime%60);
        String second = Integer.toString(seconds);
        String time = (minutes>=10?minute:"0"+minute) +":" + (seconds>=10?second:"0"+second);
        System.out.printf("경과시간: %s\n",time);
        System.out.printf("조작갯수: %d\n",cube.getCubeRotateCount());
        System.out.println("이용해주셔서 감사합니다. 뚜뚜뚜.");
    }

    private void chooseRandomInput(Cube cube, Play play){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 혹은 2를 입력해주세요 - 1:무작위 섞기, 2:사용자가 직접 방향넣고 섞기");
        int chose;
        try {
            chose = scanner.nextInt();
        }catch (Exception e){
            System.out.println("잘못된 입력입니다. 1 혹은 2를 입력해주세요");
            chooseRandomInput(cube, play);
            return;
        }
        if(chose == 1) randomInput();
        else if (chose == 2) userInput(cube, play, scanner);
        else{
            System.out.println("잘못된 입력입니다. 1 혹은 2를 입력해주세요");
            chooseRandomInput(cube, play);
        }
    }

    private void userInput(Cube cube, Play play, Scanner scanner) {
        Direction di;
        ArrayList<String> direction;
        while (true){
            System.out.println("움직일 방향을 입력해 주세요");
            System.out.print("> ");
            String d = scanner.next();
            if(d.equals("Q")) break;
            di = new Direction(d);
            direction = di.getDirection();
            for (String s : direction){
                cube.selectRotate(s);
                s = di.reverseReplaceDirection(s);
                System.out.println(s);
                cube.printCube();
            }
            if(cube.checkCube()) break;
        }
    }

    private void randomInput() {

    }
}
