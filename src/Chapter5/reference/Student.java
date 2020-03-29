package Chapter5.reference;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;


    // 오버로딩 생성자 사용
    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        // Subject 인스턴스 생성
        korea = new Subject();
        math = new Subject();
    }


    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }


    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }


    public void showStudentScore() {
        int total = korea.score + math.score;

        System.out.println(studentName + "의 총점은 " + total + "점 입니다.");
    }

}
