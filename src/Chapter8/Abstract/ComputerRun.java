package Chapter8.Abstract;

public class ComputerRun {
    public static void main(String[] args) {

        Computer computer1 = new Desktop();
        computer1.turnOn();
        computer1.display();
        computer1.turnOff();
        System.out.println("\n");

        Computer computer2 = new MyNoteBook();
        computer2.turnOn();
        computer2.display();
        computer2.typing();
        computer2.turnOff();
        System.out.println("\n");


        MyNoteBook computer3 = new MyNoteBook();
        computer3.turnOn();
        computer3.display();
        computer3.typing();
        computer3.turnOff();
    }
}
