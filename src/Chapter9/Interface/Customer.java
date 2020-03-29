package Chapter9.Interface;

public class Customer implements Buy, Sell {

    @Override
    public void Buy() {
        System.out.println("customer buy");
    }

    @Override
    public void Sell() {
        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void Hello(){
        System.out.println("hello");
    }
}
