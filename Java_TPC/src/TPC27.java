import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
    public static void main(String[] args) {
        // RemoCon으로 TV 클래스를 구동하시오.

        RemoCon r = new TV();
        for(int i=0; i<40; i ++){
            r.chUp();
        }
        r.chUp();
        r.internet();
    }
}
