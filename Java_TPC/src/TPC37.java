import kr.tpc.A;
import kr.tpc.B;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
//        ObjectArray arr = new ObjectArray(5);
        ArrayList arr = new ArrayList(5);
        arr.add(new A());
        arr.add(new B());
        arr.add(new B());
        arr.add(new A());
        arr.add(new B());
        arr.add(new B());
        arr.add(new B());
        arr.add(new B());
        for(int i = 0; i<arr.size();i++){
            Object o = arr.get(i);
            if(o instanceof A){
                ((A)o).go();
            }else{
                ((B)o).go();
            }
        }
    }
}
