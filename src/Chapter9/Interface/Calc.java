package Chapter9.Interface;

public interface Calc {

    double PI = 3.14;
    int ERROR = -9999999;


    int add(int n1,  int n2);
    int substract(int n1, int n2);
    int times(int n1, int n2);
    int divide(int n1, int n2);

    // 재정의 하지 않고 바로 사용가능 (재정의도 가능)
    default void description(){
        System.out.println("정수 계산기 구현");
        Mymethod();
    }


    // 정적 추상 메서드
    static int total(int[] arr){
        int total = 0;

        for (int i : arr){
            total += i;
        }
        Mymethod2();

        return total;
    }


    /* private로 선언된 메서드는 재정의 불가능 */
    private void Mymethod(){
        System.out.println("Private Method");   // default 메서드에서 사용 가능
    }


    static private void  Mymethod2(){
        System.out.println("Static Private Method");    // static 메서드에서 사용 가능
    }

}
