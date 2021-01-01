package ch7.ex1_2;

public class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(){
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}
