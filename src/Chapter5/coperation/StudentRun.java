package Chapter5.coperation;

public class StudentRun {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5500);
        Student studentT = new Student("Tomas", 3000);

        Bus bus36 = new Bus(36);
        Bus bus514 = new Bus(500);
        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(1);

        studentJ.takeBus(bus36);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();
        System.out.println();

        bus36.showInfo();
        bus514.showInfo();
        System.out.println();
        subwayGreen.showInfo();
        subwayBlue.showInfo();
    }
}
