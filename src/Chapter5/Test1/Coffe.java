package Chapter5.Test1;

public class Coffe {

    String coffeName;
    int money;
    int passengerCount;

    public Coffe(String coffeName) {
        this.coffeName = coffeName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }


    public void  showCoffe() {
        System.out.println(coffeName + "가계의 매출은 " + money + "원 입니다.");
    }
}
