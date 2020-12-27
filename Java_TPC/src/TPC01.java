import kr.bit.Book;
import kr.bit.PersonVO;

// 자료형 공부
public class TPC01 {
    public static void main(String[] args) {
        // 관계를 이해하라 PDT(기본 자료형) VS UDDT(사용자 정의 자료형)
        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a;
        a = 10;

        // 책 1권을 저장하기 위한 변수를 선언하시오.
        Book b;
        b = new Book();
        b.title = "자바";
        b.price = 15000;
        b.company = "한빛미디어";
        b.page = 700;
        System.out.print(b.title+"\t");
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t");
        System.out.println(b.page);

        PersonVO p;
        p = new PersonVO();

        p.name = "박매일";
        p.age = 40;
        p.weight = 69.3f;
        p.height = 192.3f;
        System.out.print(p.name+"\t");
        System.out.print(p.age+"\t");
        System.out.print(p.weight+"\t");
        System.out.println(p.height);
    }
}
