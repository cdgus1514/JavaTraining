package Chapter9.Interface;

public interface Buy {

    void Buy();

    default void order(){
        System.out.println("구매 주문");
    }
}
