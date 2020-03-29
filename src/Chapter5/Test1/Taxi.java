package Chapter5.Test1;

public class Taxi {

    int money;


    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println("오늘 수입은 " + money + "원 입니다.");
    }
}
