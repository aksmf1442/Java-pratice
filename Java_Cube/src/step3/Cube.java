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
        System.out.println();
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
        System.out.println();
    }

    public String[][] rotate270(String[][] cube){
        int n = cube[0].length;
        String[][] candidate = new String[3][3];
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                System.arraycopy(cube[x][y], 0, candidate[n-1-y][x], 0, n);
            }
        }
        return candidate;
    }

    public String[][] rotate90(String[][] cube){
        int n = cube[0].length;
        String[][] candidate = new String[3][3];
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                System.arraycopy(cube[x][y], 0, candidate[y][n-1-x], 0, n);
            }
        }
        return candidate;
    }

    public void rotateU(String d){
        String[][][] candidate = new String[6][3][3];
        int[] x = {2,3,4,1};
        int[] y = {4,1,2,3};
        if (d.equals("U")){
            for (int i = 0; i < 4; i++){
                System.arraycopy(cube[x[i]][0], 0, candidate[i+1][0], 0, 3);
            }
            candidate[0] = rotate90(cube[0]);
        }else{
            for (int i = 0; i < 4; i++){
                System.arraycopy(cube[y[i]][0], 0, candidate[i+1][0], 0, 3);
            }
            candidate[0] = rotate270(cube[0]);
        }
        cube = candidate;
    }

    public void rotateD(String d){
        String[][][] candidate = new String[6][3][3];
        int[] x = {2,3,4,1};
        int[] y = {4,1,2,3};
        if (d.equals("D")){
            for (int i = 0; i < 4; i++){
                System.arraycopy(cube[y[i]][2], 0, candidate[i+1][2], 0, 3);
            }
            candidate[5] = rotate90(cube[5]);
        }else{
            for (int i = 0; i < 4; i++){
                System.arraycopy(cube[x[i]][2], 0, candidate[i+1][2], 0, 3);
            }
            candidate[5] = rotate270(cube[5]);
        }
        cube = candidate;
    }

    public void rotateF(String d){
        String[][][] candidate = new String[6][3][3];
        if (d.equals("F")){
            for(int i = 0; i < 3; i++){
                candidate[0][2][3-i-1] = cube[1][i][2];
                candidate[3][i][0] = cube[0][2][i];
                candidate[5][0][3-i-1] = cube[3][i][0];
                candidate[1][i][2] = cube[5][0][i];
            }
            candidate[2] = rotate90(cube[2]);
        }else{
            for(int i = 0; i < 3; i++){
                candidate[0][2][i] = cube[3][i][0];
                candidate[3][3-i-1][0] = cube[5][0][i];
                candidate[5][0][i] = cube[1][i][2];
                candidate[1][3-i-1][2] = cube[0][2][i];
            }
            candidate[2] = rotate270(cube[2]);
        }
        cube = candidate;
    }

    public void rotateB(String d){
        String[][][] candidate = new String[6][3][3];
        if (d.equals("B")){
            for(int i = 0; i < 3; i++){
                candidate[0][0][i] = cube[3][i][2];
                candidate[3][3-i-1][2] = cube[5][2][i];
                candidate[5][2][i] = cube[1][i][0];
                candidate[1][3-i-1][0] = cube[0][0][i];
            }
            candidate[4] = rotate90(cube[4]);
        }else{
            for(int i = 0; i < 3; i++){
                candidate[0][0][3-i-1] = cube[1][i][0];
                candidate[3][i][2] = cube[0][0][i];
                candidate[5][2][3-i-1] = cube[3][i][2];
                candidate[1][i][0] = cube[5][2][i];
            }
            candidate[4] = rotate270(cube[4]);
        }
        cube = candidate;
    }

    public void rotateR(String d){
        String[][][] candidate = new String[6][3][3];
        if (d.equals("R")){
            for(int i = 0; i < 3; i++){
                candidate[0][i][2] = cube[2][i][2];
                candidate[4][3-i-1][0] = cube[0][i][2];
                candidate[5][3-i-1][2] = cube[4][i][0];
                candidate[2][i][2] = cube[5][i][2];
            }
            candidate[3] = rotate90(cube[3]);
        }else{
            for(int i = 0; i < 3; i++){
                candidate[0][3-i-1][2] = cube[4][i][0];
                candidate[4][3-i-1][0] = cube[5][i][2];
                candidate[5][i][2] = cube[2][i][2];
                candidate[2][i][2] = cube[0][i][2];
            }
            candidate[3] = rotate270(cube[3]);
        }
        cube = candidate;
    }

    public void rotateL(String d){
        String[][][] candidate = new String[6][3][3];
        if (d.equals("L")){
            for(int i = 0; i < 3; i++){
                candidate[0][3-i-1][0] = cube[4][i][2];
                candidate[2][i][0] = cube[0][i][0];
                candidate[5][i][0] = cube[2][i][0];
                candidate[4][3-i-1][2] = cube[5][i][0];
            }
            candidate[1] = rotate90(cube[1]);
        }else{
            for(int i = 0; i < 3; i++){
                candidate[0][i][0] = cube[2][i][0];
                candidate[2][i][0] = cube[5][i][0];
                candidate[5][3-i-1][0] = cube[4][i][2];
                candidate[4][3-i-1][2] = cube[0][i][0];
            }
            candidate[1] = rotate270(cube[1]);
        }
        cube = candidate;
    }

    public int getCubeRotateCount() {
        return cubeRotateCount;
    }
}
