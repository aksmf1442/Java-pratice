import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동" ,40, "010-4444-4444", "서울");
        //setter method - X

        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();
        m1.setName("나길동");
        m1.setAge(42);
        m1.setTel("010-2323-2323");
        m1.setAddr("광주");

        System.out.print(m1.getName()+"\t");
        System.out.print(m1.getAge()+"\t");
        System.out.print(m1.getTel()+"\t");
        System.out.println(m1.getAddr()+"\t");

        System.out.println(m1.toString());
        System.out.println(m1);
    }
}
