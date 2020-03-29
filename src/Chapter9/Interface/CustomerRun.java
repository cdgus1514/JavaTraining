package Chapter9.Interface;

public class CustomerRun {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.Buy();
        customer.Sell();
        customer.order();
        customer.Hello();
        System.out.println();


        Buy buyer = customer;
        buyer.Buy();
        buyer.order();
        System.out.println();


        Sell seller = customer;
        seller.Sell();
        seller.order();

    }
}
