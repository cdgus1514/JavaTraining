package Chapter3;

public class Operator1 {
    public static void main(String args[]){

        // 단항 연산자 (++, --)

        int num = 10;

        System.out.println("선 증감 "+(++num));  // 먼저 num값이 1 증가 후 변수에 대입
        System.out.println("후 증감 "+num++);  // 먼저 num값을 변수에 대입 후 1 증가 (num 값이 그대로)
        System.out.println("후 증감 결과 "+num);    // 대입 후 증가
    }
}
