package Chapter12.Lambda;

public class TestMyNumber {
    public static void main(String[] args) {

        MyMaxNumber  max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMAxNumber(10, 20));
    }
}
