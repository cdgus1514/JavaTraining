package Chapter5.coperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }


    // 승차 메서드
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }


    public void showInfo() {
        System.out.println(busNumber + "번 버스 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
