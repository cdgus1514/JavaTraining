package Chapter10.Object;


class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title =title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }
}

public class ToStringTest {
    public static void main(String[] args) {

        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("테스트");
        System.out.println(str);
        System.out.println(str.toString()); // Object 클래스의 메서드 (어떤 객체의 정보를 String으로 표현해야 할때 사용)
        System.out.println(book.toString());

    }
}
