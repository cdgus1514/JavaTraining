package Chapter7.Inheritance;


public class CustomerRun {
    public static void main(String[] args) {

//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

        VIPcustomer customerKim = new VIPcustomer(10020, "김유신");
        //Customer customerKim = new VIPcustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
