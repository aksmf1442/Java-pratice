package inheritance;

public class VipCustomer extends Customer{
    private int agentID;
    private  double saleRatio;

    public VipCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VipCusomer(int, String) 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }
}
