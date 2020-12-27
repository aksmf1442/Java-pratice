import kr.tpc.BookVo;

public class TPC11 {
    public static void main(String[] args) {
        // 책1권을 저장하기 위해 객체를 생성하시오.
        BookVo b = new BookVo();
        b.title="파이썬";
        b.price = 16000;
        b.company = "에이콘";
        b.page = 400;

        System.out.print(b.title+"\t");
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t");
        System.out.println(b.page+"\t");

        BookVo b1 = new BookVo();
        b1.title="오라";
        b1.price = 16000;
        b1.company = "이지스퍼블리싱";
        b1.page = 500;

        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");
    }
}
