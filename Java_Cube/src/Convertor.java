public class Convertor {
    public static void main(String[] args) {
        // 10진수->2진수 변환해서 2진수끼리 덧셈한 결과를 10진수로 변환해서 출력
        Convertor c = new Convertor();
        Adder add = new Adder();
        boolean[] bin1 = c.dec2bin(2);
        boolean[] bin2 = c.dec2bin(4);
        boolean[] binResult = add.byteadder(bin1, bin2);
        int decResult = c.bin2dec(binResult);
        System.out.println(decResult);
    }

    // 10진수->2진수
    public boolean[] dec2bin(int decimal) {
        boolean[] answer = new boolean[8];
        int maxLength = 0;
        while (decimal>1){
            int n = 2;
            int count = 0;
            while (n<=decimal){
                count +=1;
                n *= 2;
            }
            if (maxLength < count) maxLength = count;
            answer[count] = true;
            decimal -= (n/2);
        }
        if (decimal != 0) answer[0] = true;

//        boolean[] candidate = new boolean[maxLength+1];
//        for(int i = 0; i < candidate.length; i++){
//            candidate[i] = answer[i];
//        }
//        answer = candidate;
        return answer;
    }

    // 2진수->10진수
    public int bin2dec(boolean[] bin) {
        int answer = 0;
        for (int i = 0; i < bin.length; i++){
            if (bin[i]){
                int n = 1;
                for(int j = 0; j < i; j++){
                    n *= 2;
                }
                answer += n;
            }
        }
        return answer;
    }
}

class Adder {

    public boolean[] halfadder(boolean bitA, boolean bitB) {
        boolean[] answer = {(bitA && bitB) ,!(bitA&&bitB)&&(bitA||bitB)};
        return answer;
    }

    public boolean[] fulladder(boolean bitA, boolean bitB, boolean carry) {
        boolean[] answer = halfadder(bitA, bitB);
        boolean[] candidate = halfadder(answer[1], carry);
        if (carry && answer[0]) answer[1] = true;
        else if (carry && answer[1]) {
            answer[0] = true;
            answer[1] = false;
        }else if (carry) answer[1] = true;
        return answer;
    }

    public boolean[] byteadder(boolean[] byteA, boolean[] byteB) {
        boolean[] answer = new boolean[9];
        boolean[] candidate;
        boolean isTrue = false;
        for (int i = 0; i < byteA.length; i++){
            candidate = fulladder(byteA[i],byteB[i], isTrue);
            isTrue = candidate[0];
            answer[i] = candidate[1];
        }
        answer[8] = isTrue;
        return answer;
    }
}
