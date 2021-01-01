package ch7.ex1_2;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck(){
        for (int i = 0; i<cards.length; i++){
            int num = (i%10) + 1;
            boolean isKwang = (i<10) && (num==1 || num==3 || num==8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle(){
        for (int i = 0; i < cards.length; i++){
            int tmp = (int)(Math.random()*cards.length);
            cards[tmp] = cards[i];
            cards[i] = cards[tmp];
        }
    }

    public SutdaCard pick(int index){
        return cards[index];
    }

    public SutdaCard pick(){
        int index = (int)(Math.random()*cards.length);
        return pick(index);
    }
}
