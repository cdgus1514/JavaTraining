package Chapter5.Test1;

public class Person {

    String name;
    int money;


    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int money) {
        taxi.take(money);
        this.money -= money;
    }

    public void takeCoffe(Coffe coffe, int money) {
        coffe.take(money);
        this.money -= money;
    }

    public void showInfo() {
        System.out.println(name + "의 남은 잔액은 " + money + "원 입니다.");
    }
}
