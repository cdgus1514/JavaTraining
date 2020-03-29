package Chapter7.test1;

import java.util.ArrayList;

public class CustomerRun {
    public static void main(String[] args) {

        int price = 10000;

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShine = new Customer(10020, "신사임당");
        Customer customerHong = new Goldcustomer(10030, "홍길동");
        Customer customerYul = new Goldcustomer(10040, "이육곡");
        Customer customerKim = new VIPcustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShine);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        for (Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("\n=======할인율과 보너스 포인트 계산=======");



        for (Customer customer : customerList){
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하였습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.\n");
        }
    }
}
