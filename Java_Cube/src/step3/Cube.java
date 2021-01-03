package step3;

public class Cube {
    String[][][] cube;
    int cubeRotateCount;

    public Cube(){
        cube = new String[6][3][];
        for(int i = 0; i < 3; i++){
            cube[0][i] = new String[]{"B","B","B"};
            cube[1][i] = new String[]{"W","W","W"};
            cube[2][i] = new String[]{"O","O","O"};
            cube[3][i] = new String[]{"G","G","G"};
            cube[4][i] = new String[]{"Y","Y","Y"};
            cube[5][i] = new String[]{"R","R","R"};
        }
        cubeRotateCount = 0;
    }

    public void printCube(){
        for(int i = 0; i < cube[0].length; i++){
            System.out.printf("\t\t%s %s %s\n", cube[0][i]);
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for (int idx = 1; idx < 5; idx++){
                System.out.printf("%s %s %s\t", cube[idx][i]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < cube[5].length; i++){
            System.out.printf("\t\t%s %s %s\n", cube[5][i]);
        }


    }

}
