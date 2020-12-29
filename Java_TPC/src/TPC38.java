import kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {
        List<BookDTO> list = new ArrayList<>(); // Object[]-->BookDTO[]
        list.add(new BookDTO("자바",12000,"이지스",600));
        list.add(new BookDTO("C언어",17000,"에이콘",700));
        list.add(new BookDTO("파이썬",14000,"제이펍",400));

        for(int i = 0; i < list.size(); i++){
//            Object o = list.get(i);
//            BookDTO vo = (BookDTO)o;
            System.out.println(list.get(i));
        }
    }
}
