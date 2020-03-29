package Chapter6.array;

public class ObjectCopy2 {
    public static void main(String[] args) {

        Book [] library = new Book[5];
        Book [] copylibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        //System.arraycopy(library, 0, copylibrary, 0, 5);

        copylibrary[0] = new Book();
        copylibrary[1] = new Book();
        copylibrary[2] = new Book();
        copylibrary[3] = new Book();
        copylibrary[4] = new Book();

        for (int i=0; i<library.length; i++) {
            copylibrary[i].setTitle(library[i].getTitle());
            copylibrary[i].setAuthor(library[i].getAuthor());
        }


//        for (Book book : copylibrary) {
//            book.showbookInfo();
//        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        for (Book book : library){
            book.showbookInfo();
        }

        System.out.println("===========================");

        // copy 후 값을 변경해도 copy한 배열도 같이 반영됨 (얕은복사 >> 주소를 복사)
        // 깊은복사 >> 일일이 값을 반영해야함
        for (Book book : copylibrary){
            book.showbookInfo();
        }
    }
}
