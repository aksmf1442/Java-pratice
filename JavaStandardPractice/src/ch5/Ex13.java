package ch5;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phoen"};

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<words.length; i++){
            char[] question = words[i].toCharArray();
            Random random;
            for (int j = 0; j < question.length; j++){
                int idx = (int)Math.random()*question.length;
                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.<",
                    i+1, new String(question));
            String answer = scanner.nextLine();

            if(words[i].equals(answer.trim())){
                System.out.println("맞았습니다.%n%n");
            }else{
                System.out.println("틀렸습니다.%n%n");
            }
        }
    }
}
