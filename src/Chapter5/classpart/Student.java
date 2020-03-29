package Chapter5.classpart;

public class Student {

    // 맴버변수
    public int studentID;
    public String studentName;
    public String address;

    // 기본생성자 >> 작성안해도 자동으로 생성해줌
    public Student(){}

    public Student(int id, String name){
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

    public void showStudnetInfo(){
        System.out.println(studentID + ", " + studentName + ", " + address);
    }

    public String getStudentName(){
        return studentName;
    }
}
