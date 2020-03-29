package Chapter5.Test1;

public class MydateRun {
    public static void main(String[] args) {

        Mydate mydate1 = new Mydate(29, 2, 2000);
        System.out.println(mydate1.isValid());

        Mydate mydate2 = new Mydate(33, 10, 2006);
        System.out.println(mydate2.isValid());

        Mydate  mydate3 = new Mydate(10, 3, 2015);
        System.out.println(mydate3.isValid());

        Mydate mydate4 = new Mydate(12, 5, 2030);
        System.out.println(mydate4.isValid());
    }
}
