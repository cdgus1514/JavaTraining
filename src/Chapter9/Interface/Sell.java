package Chapter9.Interface;

public interface Sell {

    void Sell();

    default void order(){
        System.out.println("판매 주문");
    }
}
