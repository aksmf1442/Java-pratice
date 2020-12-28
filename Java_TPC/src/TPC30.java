import kr.tpc.*;
public class TPC30 {
    // A, B 클래스를 저장할 배열
    public static void main(String[] args) {
        Object[] o = new Object[2];
        o[0] = new A();
        o[1] = new B();

        for(int i = 0; i < o.length; i++){
            if(o[i] instanceof A){
                ((A)o[i]).go();
            }else{
                ((B)o[i]).go();
            }
        }
        printGO(o);
    }

    private static void printGO(Object[] o) {
        for(int i = 0; i < o.length; i++){
            if(o[i] instanceof A){
                ((A)o[i]).go();
            }else{
                ((B)o[i]).go();
            }
        }
    }
}
