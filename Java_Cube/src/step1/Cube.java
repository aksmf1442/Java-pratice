package step1;

import java.util.Scanner;

public class Cube {
    String word;
    int n;
    String direction;
    char[] temp;

    public void play(){
        inputValue();
        rotate();
        System.out.println(word);
    }

    public void inputValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어 하나, 정수 숫자 하나( -100 <= N < 100) , L 또는 R을 입력해주세요(소문자도 가능).");
        System.out.print(">");
        word = scanner.next();
        try {
            n = scanner.nextInt();
        }catch (Exception e){
            System.out.println("잘못된 입력입니다. 처음부터 다시 입력해주세요.");
            inputValue();
            return;
        }
        direction = scanner.next().toUpperCase();
        if (!direction.equals("L") && !direction.equals("R")){
            System.out.println("잘못된 입력입니다. 처음부터 다시 입력해주세요.");
            inputValue();
        }
        scanner.close();
    }

    public void rotate() {
        if (n < 0) {
            if (direction.equals("L")) direction = "R";
            else direction = "L";
            n *= -1;
        }
        n %= word.length();
        if (direction.equals("L")) rotateL();
        else rotateR();
    }

    public void rotateR(){
        temp = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            int idx = (n+i) % word.length();
            temp[idx] = word.charAt(i);
        }
        word = String.valueOf(temp);
    }

    public void rotateL(){
        temp = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            int idx = (word.length()-(n-i)) % word.length();
            temp[idx] = word.charAt(i);
        }
        word = String.valueOf(temp);
    }

}
