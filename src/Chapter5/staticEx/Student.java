package Chapter5.staticEx;

public class Student {

    // 맴버변수
    private static int serialNum = 1000;

    private int studentID;
    public String studentName;
    public String address;

    // 기본생성자 >> 작성안해도 자동으로 생성해줌
    public Student(String name){
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name){
        studentID = id;
        studentName = name;
        address = "주소 없음";
        serialNum++;
        studentID = serialNum;
    }

    public void showStudnetInfo(){
        System.out.println(studentID + ", " + studentName + ", " + address);
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}
