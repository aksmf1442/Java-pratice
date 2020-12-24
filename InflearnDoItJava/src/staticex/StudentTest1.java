package staticex;

public class StudentTest1 {
    public static void main(String[] args){
        // 인스턴스의 생성과 관계없이 사용 가능 (static변수 사용했기 때문에)
        System.out.println(Student.getSerialNum());

        Student studentJ = new Student();
        System.out.println(studentJ.studentID);

        Student studentT = new Student();
        System.out.println(studentT.studentID);

        System.out.println(Student.getSerialNum());

    }
}
