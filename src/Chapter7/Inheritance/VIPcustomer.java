package Chapter7.Inheritance;

public class VIPcustomer extends Customer{

    private String agenID;
    double saleRation;

//    public VIPcustomer(){
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRation = 0.1;
//
//        System.out.println("VIPcustomer() 생성자 호출");
//    }

    // 상위 클래스에 Default 생성자가 없으면 하위 클래스에서 명시적으로 호출해야 함
    public VIPcustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRation = 0.1;

        //System.out.println("VIPcustomer() 생성자 호출");
    }


    @Override
    public int clacPrice(int price) {
        bonusPoint += price * bonusRatio;
        return  price - (int)(price * saleRation);
    }
}
