package Chapter12.InnerClass;


class Outer2{

    int outNum = 10;
    static int sOutNum = 100;

    Runnable getRunnable(int i){ // 익명 내부 클래스
        int num = 5;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num + ", " + i);
                System.out.println(outNum);
                System.out.println(sOutNum);
            }
        };
    }
}


public class AnonymousInnerTest {
    public static void main(String[] args) {

        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(50);
        runnable.run();
    }
}
