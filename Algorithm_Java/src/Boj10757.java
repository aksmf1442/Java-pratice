import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj10757 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    String b = scanner.next();
    Convertor convertor = new Convertor();
    ArrayList<Integer> A = convertor.dec10bin(a);
    ArrayList<Integer> B = convertor.dec10bin(b);
    Adder adder = new Adder();
    ArrayList ans = adder.byteadder(A, B);
    String result = convertor.bin10dec(ans);
    System.out.println(result);
  }
}

class Convertor {

  // 10진수를 배열로 쪼개기.
  public ArrayList<Integer> dec10bin(String decimal) {
    ArrayList<Integer> answer = new ArrayList<>();
    for(String s : decimal.split("")){
      answer.add(Integer.parseInt(s));
    }
    Collections.reverse(answer);
    return answer;
  }

  // 10진수를 String으로 변환
  public String bin10dec(ArrayList<Integer> bin) {
    String result = "";
    int idx = 0;
    for(int s : bin){
      if(idx == 0 && s==0){
        continue;
      }
      result += Integer.toString(s);
      idx++;
    }
    return result;
  }
}

class Adder {

  public int[] halfadder(int A, int B) {
    int[] answer = {(A+B>=10?1:0), (A+B)%10};
    return answer;
  }

  public int[] fulladder(int A, int B, int carry) {
    int[] answer = halfadder(A, B);
    int[] candidate = halfadder(answer[1], carry);
    answer[1] = candidate[1]; // sum
    answer[0] = (answer[0] + candidate[0]); // carry
    return answer;
  }

  public ArrayList<Integer> byteadder(ArrayList<Integer> byteA, ArrayList<Integer> byteB) {
    int size = Math.max(byteA.size(),byteB.size());
    if (byteA.size()< byteB.size()) {
      for (int i = byteA.size(); i < size; i++) {
        byteA.add(0);
      }
    }else{
      for (int i = byteB.size(); i < size; i++) {
        byteB.add(0);
      }
    }
    ArrayList<Integer> answer = new ArrayList<>();
    int[] candidate;
    int carry = 0;
    for (int i = 0; i < size; i++) {
      candidate = fulladder(byteA.get(i), byteB.get(i), carry);
      carry = candidate[0];
      answer.add(candidate[1]);
    }
    answer.add(carry);
    Collections.reverse(answer);
    return answer;
  }
}
