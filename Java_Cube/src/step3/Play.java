package step3;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        Cube cube = new Cube();
        Play play = new Play();
        cube.printCube();
        play.chooseRandomInput(cube, play);


        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println(secDiffTime);
    }

    private void chooseRandomInput(Cube cube, Play play){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 혹은 2를 입력해주세요 - 1:무작위 섞기, 2:사용자가 직접 방향넣고 섞기");
        int chose = scanner.nextInt();
        if(chose == 1) randomInput();
        else if (chose == 2) userInput();
        else{
            System.out.println("잘못된 입력입니다. 1 혹은 2를 입력해주세요");
            chooseRandomInput(cube, play);
        }
    }

    private void userInput() {

    }

    private void randomInput() {

    }
}
