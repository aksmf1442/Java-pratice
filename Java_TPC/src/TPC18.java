import com.google.gson.Gson;
import kr.tpc.BookVo;
import kr.tpc.MyUtil;

public class TPC18 {
    public static void main(String[] args) {
        // 1. Java에서 제공해주는 class들... API
        // 문자열(String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, Utility .. API
        MyUtil my = new MyUtil();
        System.out.println(my.hap());

        // 3. 다른 회사에서 만들어 놓은 class들... API
        // Gson -> json
        Gson g = new Gson();
        BookVo vo = new BookVo("자바", 13000, "영진", 800);
        String json = g.toJson(vo);
        System.out.println(json);
    }
}
