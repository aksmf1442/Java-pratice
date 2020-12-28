package kr.poly;

public abstract class Animal { // 추상클래스(불완전한객체, 장애객체)-->
    // Dog, Cat --> eat()
    public abstract void eat(); // 추상 메서드->불완전메서드, 장애메서드
    public void move(){// 구현메서드
        System.out.println("무리를 지어서 이동한다.");
    }
}
