package object;

class Student{
    int studentId;
    String studentName;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(studentId == std.studentId) return true;
            else return false;
        }
        return false;
    }

    public int hashCode(){
        return studentId;
    }
}

public class EqualsTest {
    public static void main(String[] args){
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Student std1 = new Student(10001, "Tomas");
        Student std2 = new Student(10001, "Tomas");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        System.out.println(System.identityHashCode(std2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
