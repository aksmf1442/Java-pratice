public class StringTDD {
    public static void main(String[] args) {
        Test test = new Test();
        test.split();
        test.substring();
    }


}

class Test{
    public void split(){
        String[] result = "1,2".split(",");
        if (result[0].equals("1") && result[1].equals("2")) System.out.println("equals : pass");
        if (result[0].contains("1")) System.out.println("contains : pass");
    }

    public void substring(){
        // (1,2)" 값이 주어졌을 때 String 의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현
        String result = "(1,2)";
        if (result.substring(1,4).equals("1,2")) System.out.println("substring : pass");
    }

    
}
