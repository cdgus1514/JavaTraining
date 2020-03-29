package Chapter7.Inheritance;

public class OverridingTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPcustomer customerKim = new VIPcustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;


        int priceLee = customerLee.clacPrice(10000);
        int priceKim = customerKim.clacPrice(10000);


        System.out.println(customerLee.showCustomerInfo() + ", 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + ", 지불금액은 " + priceKim + "원 입니다.");

        System.out.println("================================================");

        // 가상 메소드 호출 >> Customer 클래스 타입으로 선언했어도 VIPcustomer 메소드(재정의 된 메소드)를 사용
        Customer customerNo = new VIPcustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        System.out.println(customerNo.showCustomerInfo() + ", 지불금액은 " + customerNo.clacPrice(10000) + "원 입니다.");

    }
}
