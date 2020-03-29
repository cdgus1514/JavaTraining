package Chapter6.test1;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Book> booklist;


    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        booklist = new ArrayList<Book>();
    }

    public void addBook(String title){
        Book book = new Book(title);

        booklist.add(book);
    }

    public void showBookInfo(){
        System.out.print(studentName + " 학생이 읽은 책은 : ");
        for (Book book : booklist){
            System.out.print(book.getTitle() + " ");
        }
        System.out.println(" 입니다.");
    }
}
