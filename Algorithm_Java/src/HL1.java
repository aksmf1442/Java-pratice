import java.util.List;

public class HL1 {

  public static int diagonalDifference(List<List<Integer>> data) {
    int n = data.size();
    int a = 0;
    int b = 0;
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        if (i==j){
          a += data.get(i).get(j);
        }
        if (i+j == n-1){
          b += data.get(i).get(j);
        }
      }
    }

    return Math.abs(a-b);
  }

}
