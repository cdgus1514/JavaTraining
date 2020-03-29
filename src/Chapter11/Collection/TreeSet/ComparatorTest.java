package Chapter11.Collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompara implements Comparator<String>{
    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1) * -1;
    }
}


public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>(new MyCompara());
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String str : treeSet){
            System.out.println(str);
        }

    }
}
