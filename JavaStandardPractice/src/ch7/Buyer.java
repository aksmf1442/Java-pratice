package ch7;

public class Buyer {
   int money = 1000;
   Product[] cart = new Product[3];
   int i = 0;

   public void buy(Product p){
       if(money < p.price){
           System.out.printf("잔액이 부족하여 %s을/를 살수 없습니다.\n", p);
       }else{
           money
       }
   }

   public void add(Product p){

   }

   public void summary(){

   }


}
