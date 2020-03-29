package Chapter5.Test1;

public class PersonRun {
    public static void main(String[] args) {

        Person personEd = new Person("Edward", 15000);
        Taxi taxi =  new Taxi();


        personEd.takeTaxi(taxi, 10000);


        personEd.showInfo();
        taxi.showInfo();
        System.out.println("\n\n");


        Person personKim = new Person("김졸려", 10000);
        Person personPi =  new Person("이피곤", 15000);
        Coffe coffeStar = new Coffe("별다방");
        Coffe coffeBean = new Coffe("콩다방");

        personKim.takeCoffe(coffeStar, 4000);
        personPi.takeCoffe(coffeBean, 4500);

        personKim.showInfo();
        personPi.showInfo();
        System.out.println("\n\n");
        coffeStar.showCoffe();
        coffeBean.showCoffe();
    }
}
