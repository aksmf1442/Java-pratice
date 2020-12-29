public class TPC35 {
    public static void main(String[] args) {
        String str1 = new String("APPLE");
        String str2 = new String("APPLE");

        // 번지를 비교
        if(str1 == str2){
            System.out.println("Yes");
        }else{
            System.out.println("No"); // V
        }

        // 값을 비교
        if(str1.equals(str2)){
            System.out.println("Yes"); // V
        }else{
            System.out.println("No");
        }

        String str3 = "APPLE";
        String str4 = "APPLE";

        // 상수풀에 저장되서 번지수가 같음
        if(str3 == str4){
            System.out.println("Yes"); // V
        }else{
            System.out.println("No");
        }

        if(str3.equals(str4)){
            System.out.println("Yes"); // V
        }else{
            System.out.println("No");
        }
    }
}
