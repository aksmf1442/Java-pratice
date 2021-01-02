package step2;

import java.util.Scanner;

public class Cube {
    String[][] cube;
    String direction;
    String[][] candidate;
    int idx;
    int length;

    public Cube(){
        cube = new String[3][];
        cube[0] = new String[]{"R","R","W"};
        cube[1] = new String[]{"G","C","W"};
        cube[2] = new String[]{"G","B","B"};
        candidate = new String[3][3];
        length = cube.length;
    }

    public void play(){
        printCube();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("CUBE> ");
            direction = scanner.next();
            System.out.println();
            if (direction.equals("Q")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            replaceDirection();
            if (!checkDirection()){
                System.out.println("지정된 값 이외에 다른 값을 넣지 마세요! 다시 입력해주세요.");
                continue;
            }
            rotate();
        }
    }

    public void rotate(){
        for (String a: direction.split("")){
            switch (a) {
                case "U", "u" -> rotateU(a);
                case "R", "r" -> rotateR(a);
                case "L", "l" -> rotateL(a);
                case "B", "b" -> rotateB(a);
            }
            cube = deepCopy(candidate, cube);
            System.out.println(a);
            printCube();
        }
    }

    private String[][] deepCopy(String[][] cube, String[][] candidate) {
        System.arraycopy(cube[0], 0, candidate[0], 0, cube[0].length);
        System.arraycopy(cube[1], 0, candidate[1], 0, cube[1].length);
        System.arraycopy(cube[2], 0, candidate[2], 0, cube[2].length);
        return candidate;
    }

    private void rotateU(String d) {
        candidate = deepCopy(cube, candidate);
        if (d.equals("U")){
            for(int i = 0; i<length; i++){
                idx = (length-(1-i))%length;
                candidate[0][idx] = cube[0][i];
            }
        }else{
            for(int i = 0; i<length; i++){
                idx = (length+i+1)%length;
                candidate[0][idx] = cube[0][i];
            }
        }
    }

    private void rotateR(String d) {
        candidate = deepCopy(cube, candidate);
        if (d.equals("R")){
            for(int i = 0; i<length; i++){
                idx = (length-(1-i))%length;
                candidate[idx][2] = cube[i][2];
            }
        }else{
            for(int i = 0; i<length; i++){
                idx = (length+i+1)%length;
                candidate[idx][2] = cube[i][2];
            }
        }
    }

    private void rotateL(String d) {
        candidate = deepCopy(cube, candidate);
        if (d.equals("L")){
            for(int i = 0; i<length; i++){
                idx = (length+i+1)%length;
                candidate[idx][0] = cube[i][0];
            }
        }else{
            for(int i = 0; i<length; i++){
                idx = (length-(1-i))%length;
                candidate[idx][0] = cube[i][0];
            }
        }
    }

    private void rotateB(String d) {
        candidate = deepCopy(cube, candidate);
        if (d.equals("B")){
            for(int i = 0; i<length; i++){
                idx = (length+i+1)%length;
                candidate[2][idx] = cube[2][i];
            }
        }else{
            for(int i = 0; i<length; i++){
                idx = (length-(1-i))%length;
                candidate[2][idx] = cube[2][i];
            }
        }
    }


    public void printCube(){
        for(String[] arr:cube){
            System.out.printf("%s %s %s\n",arr[0], arr[1], arr[2]);
        }
        System.out.println();
    }

    public void replaceDirection(){
        direction = direction.replace("U'","u");
        direction = direction.replace("R'","r");
        direction = direction.replace("L'","l");
        direction = direction.replace("B'","b");
    }

    public boolean checkDirection(){

        for(int i = 0; i < direction.length(); i++){
            char a = direction.charAt(i);
            if(a != 'U' && a != 'u' && a != 'R' && a != 'r'
                    && a != 'L' &&  a != 'l' && a != 'B' && a != 'b'){
                return false;
            }
        }
        return true;
    }
}
