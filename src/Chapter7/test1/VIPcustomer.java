package Chapter7.test1;

public class VIPcustomer extends Customer {

    private int agenID;
    double saleRation;


    public VIPcustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRation = 0.1;
        this.agenID = agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agenID + "입니다.";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return  price - (int)(price * saleRation);
    }
}
