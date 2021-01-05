class Adde {

    public boolean[] halfadder(boolean bitA, boolean bitB) {
        boolean[] answer = {(bitA && bitB) ,!(bitA&&bitB)&&(bitA||bitB)};
        return answer;
    }

    public boolean[] fulladder(boolean bitA, boolean bitB, boolean carry) {
        boolean[] answer = halfadder(bitA, bitB);
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
