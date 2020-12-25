package inheritance;

public class OverridingTest {
    public static void main(String[] args){
//        Customer customerLee = new Customer(100010, "Lee");
//        int price = customerLee.calcPrice(10000);
//        System.out.printf("지불 금액은 %d이고 %s\n",price,customerLee.showCustomerInfo());
//
//        VipCustomer customerKim = new VipCustomer(100011, "Kim", 100);
//        price = customerKim.calcPrice(10000);
//        System.out.printf("지불 금액은 %d이고 %s\n",price,customerKim.showCustomerInfo());


        Customer customerWho = new VipCustomer(100010, "Who", 100);
        int price = customerWho.calcPrice(10000);
        System.out.printf("지불 금액은 %d이고 %s\n",price,customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer(100011, "몰라");

    }
}
