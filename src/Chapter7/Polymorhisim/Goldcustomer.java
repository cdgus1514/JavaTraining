package Chapter7.Polymorhisim;

public class Goldcustomer extends Customer{

    double salesRratio;

    public Goldcustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRratio = 0.1;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;

        return price - (int)(price *  salesRratio);
    }
}
