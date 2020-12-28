package kr.poly;

public interface RemoCon { // 객체생성 x
    // final static(상수)를 사용가능
    int MAXCH = 100;
    int MINCH = 1;
    // 추상 메서드
    public void chUp();
    public void chDown();
    public void internet();
}
