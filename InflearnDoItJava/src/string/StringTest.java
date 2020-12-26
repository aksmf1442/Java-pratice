package string;

public class StringTest {
    public static void main(String[] args){
//        // 인스턴스를 생성하여  힙 메모리에 주소를 만들어서 다른 주소값을 가리킴
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1 == str2);
//
//        // 상수 풀에 있는 주소를 가리킴 그래서 같은 주소를 가리킨다.
//        String str3 = "abc";
//        String str4 = "abc";
//
//        System.out.println(str3 == str4);
//

        String str1 = new String("java");
        String str2 = new String("android");

        System.out.println(System.identityHashCode(str1));

        str1 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
    }
}
