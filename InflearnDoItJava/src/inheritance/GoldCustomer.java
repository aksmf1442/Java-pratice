package inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
