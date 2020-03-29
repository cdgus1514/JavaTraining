package Chapter11.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");

        System.out.println(set);    // 중복허용 X, 순서 X


        Iterator<String> ir = set.iterator();

        while (ir.hasNext()){
            String s = ir.next();
            System.out.println(s);
        }
    }
}
