package Chapter5.reference;

public class TestRun {
    public static void main(String[] args){


        Student studentLee = new Student(2010181009, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 80);
        studentLee.showStudentScore();

        Student studentKim = new Student(2010191120, "Kim");
        studentKim.setKoreaSubject("국어", 88);
        studentKim.setMathSubject("수학", 50);
        studentKim.showStudentScore();
    }
}
