package Chapter6.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("ccc");
        list.add("ddd");
        list.add("fff");

        for (int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
