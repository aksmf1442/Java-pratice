package ch9;

import java.util.Objects;

public class Ex26 {

  public static void main(String[] args) {
    String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
    String[][] str2D_2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

    String[][][] str1 = new String[][][]{{{"a"},{"b"},{"c"}}};
    String[][][] str2 = new String[][][]{{{"a"},{"b"},{"c"}}};

    System.out.println("equals(std2D, str2D_2)="+ Objects.equals(str2D, str2D_2));
    System.out.println("equals(std2D, str2D_2)="+ Objects.deepEquals(str2D, str2D_2));
    System.out.println("equals(std1, str2)="+ Objects.equals(str1, str2));
    System.out.println("equals(std1, str2)="+ Objects.deepEquals(str1, str2));
  }

}
