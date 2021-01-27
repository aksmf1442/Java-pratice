public class HL3 {
  static String kangaroo(int x1, int v1, int x2, int v2) {
    if (x1==x2){
      return "YES";
    }

    if ((x1>x2 && v1>v2) || x1<x2 && v1<v2){
      return "NO";
    }else{
      if (x1<x2){
        while (x1<x2){
          x1 += v1;
          x2 += v2;
          if (x1 == x2){
            return "YES";
          }
        }
      }else{
        while (x1>x2){
          x1 += v1;
          x2 += v2;
          if (x1 == x2){
            return "YES";
          }
        }
      }
    }

    return "NO";
  }


  public static void main(String[] args) {
    System.out.println(kangaroo(0, 2, 5, 3));
  }
}
