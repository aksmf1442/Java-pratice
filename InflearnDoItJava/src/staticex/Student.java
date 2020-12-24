package staticex;

public class Student {
    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student(){
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        // 인스턴스 변수는 new 될 때 생성되기 때문에 프로그래밍이 로드 될 때
        // 메모리에 저장되는 static 메서드에서 사용될 수 없다.
        // studentName = "홍길동";
        return serialNum;
    }
}
