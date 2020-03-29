package Chapter9.BookSelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;


    // ArrayList는 주로 생성자에서 만들어줌
    public Shelf(){
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
