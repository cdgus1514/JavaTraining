package Chapter10.Object;

class Student{

    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student)obj;
            if (this.studentNum == std.studentNum)
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}


public class EqqualsTest {
    public static void main(String[] args) {

        //String str1 = new String("ABC");
        //String str2 = new String("ABC");

        //System.out.println(str1 == str2);         // str1과 str2 값 비교
        //System.out.println(str1.equals(str2));    // str1과 str2 메모리 주소 값 비교

        Student studentLee = new Student(100, "이순신");
        Student Lee1 = studentLee;
        Student studentLee2 = new Student(100, "이순신");

        System.out.println(studentLee == studentLee2);
        System.out.println(studentLee == Lee1);
        System.out.println(studentLee.equals(studentLee2));

        System.out.println(studentLee.hashCode());
        System.out.println(studentLee2.hashCode());

    }
}
