package ch7;

public class Buyer {
   int money = 1000;
   Product[] cart = new Product[3];
   int i = 0;

   public void buy(Product p){
       if(money < p.price){
           System.out.printf("잔액이 부족하여 %s을/를 살수 없습니다.\n", p);
       }else{
           money -= p.price;
           add(p);
       }
   }

   public void add(Product p){
        if (i >= cart.length){
            Product[] tmp = new Product[cart.length*2];
            for (int j = 0; j<cart.length; j++){
                tmp[j] = cart[j];
            }
            cart = tmp;
        }
        cart[i] = p;
        i++;
   }

   public void summary(){
       String s ="";
       for (int j=0; j<i; j++){
           s += cart[j].toString() + ", ";
       }
       System.out.printf("구입한 물건:%s\n", s);
       System.out.println("사용한 금액:"+(1000-money));
       System.out.println("남은 금액:"+money);
   }


}
