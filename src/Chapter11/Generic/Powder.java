package Chapter11.Generic;

public class Powder extends Metterial {

    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder로 프린팅 시작");
    }
}
