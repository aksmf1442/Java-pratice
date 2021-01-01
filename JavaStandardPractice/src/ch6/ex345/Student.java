package ch6.ex345;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return kor+eng+math;
    }

    public float getAverage(){
        float result = (int)(getTotal() / 3f * 10 + 0.5f)/ 10f;
        return result;
    }

    public String info() {
        return name + ","
                + ban + ","
                + no + ","
                + kor + ","
                + eng + ","
                + math + ","
                + getTotal() + ","
                + getAverage();
    }
}
