import kr.tpc.BookVo;

public class TPC12 {
    public static void main(String[] args) {
        //생성자 -> 생성+초기화 -> 중복정의가능
        BookVo b1 = new BookVo();
        System.out.print(b1.title+"\t");
        System.out.print(b1.price+"\t");
        System.out.print(b1.company+"\t");
        System.out.println(b1.page+"\t");

        BookVo b2 = new BookVo("Python", 18000, "대림", 920);
        System.out.print(b2.title+"\t");
        System.out.print(b2.price+"\t");
        System.out.print(b2.company+"\t");
        System.out.println(b2.page+"\t");
    }
}
