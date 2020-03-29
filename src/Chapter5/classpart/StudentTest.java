package Chapter5.classpart;

public class StudentTest {
    public static void main(String[] args){

        // defualt 생성자가 없을 시 사용  불가
        Student studentLee = new Student(); // new 키워드(생성자)를 사용하여 인스턴스 생성
        studentLee.studentName = "최동현";
        studentLee.address = "인천";

        studentLee.showStudnetInfo();


        Student studentKim = new Student(123, "김동현");
//        studentKim.studentName = "김동현";
//        studentKim.address = "서울";

        studentKim.showStudnetInfo();


        // 클래스풀네임.Heap메모리주소값 (참조변수)
//        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
