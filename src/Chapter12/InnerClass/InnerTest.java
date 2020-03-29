package Chapter12.InnerClass;


class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;


    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        void inTest(){
            System.out.println(iNum);       // InClass
            System.out.println(num);        // OutClass
            System.out.println(sNum);       // OutClass (static)
        }
    }

    public void usingInner(){
        inClass.inTest();
    }


    static class InStaticClass{
        int inNum = 100;            // static 메서드에서 사용 못함
        static int sInNum = 200;

        void inTest(){
            System.out.println(inNum);      // InStaticClass
            System.out.println(sInNum);     // InStaticClass
            System.out.println(sNum);       // OutClass() (static)
        }

        static void sTest(){
            System.out.println(sNum);       // OutClass (static)

        }
    }

}


public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass(); // OutClass 호출
        outClass.usingInner();
        System.out.println();

        OutClass.InClass myInClass = outClass.new InClass();    // OutClass의 내부 클래스 호출
        myInClass.inTest();
        System.out.println();

        //OutClass.InStaticClass myInStaticClass = new OutClass.InStaticClass();
        OutClass.InStaticClass.sTest(); // 인스턴스 생성 없이도 사용 가능

    }
}
