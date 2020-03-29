package Chapter12.InnerClass;


class Outer{

    int outNum = 10;
    static int sOutNum = 100;

    Runnable getRunnable(int i){ // Runnable 타입 반환 >> i, num 은 지역변수
        int num = 5;

        class MyRunnable implements Runnable{   // 지역 내부 클래스

            @Override
            public void run() {                 // Runnable 메서드 호출이 끝나도 run메서드는 계속 호출 가능
                // 내부 클래스에서 참조는 되지만, 변경은 불가능
                //num += 10;
                //i = 200;
                System.out.println(num + ", " + i);
                System.out.println(outNum);
                System.out.println(sOutNum);
            }
        }
        return new MyRunnable();
    }
}


public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);
        runnable.run();
    }
}
