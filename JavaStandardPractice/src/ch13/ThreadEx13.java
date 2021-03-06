package ch13;

import javax.swing.JOptionPane;

public class ThreadEx13 {

    public static void main(String[] args) {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요/");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
        System.out.println("isInterrupted():" + th1.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    public void run(){
        int i = 10;

        while (i != 0 && !isInterrupted()){
            System.out.println(i--);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("카운트가 종료되었습니다.");
        System.out.println("커밋 테스트");
    }
}
