package Chapter10.String;

public class StringTest {
    public static void main(String[] args) {

        // Heap 메모리에 저장
        String str1 = new String("ABC");
        String str2 = new String("ABC");

        System.out.println(str1 == str2);   // 다른 메모리

        // 상수풀에 저장
        String str3 = "ABC";
        String str4 = "ABC";

        System.out.println(str3 == str4);   // 같은 메모리

    }
}
