package Chapter5.staticEx;

public class StudentRun {
    public static void main(String[] args) {

        Student studentLee = new Student("Lee");
        System.out.println(Student.getSerialNum() + "\n");

        Student studentKim = new Student("kim");
        System.out.println(Student.getSerialNum());
        System.out.println(Student.getSerialNum() + "\n");
        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());
    }
}
