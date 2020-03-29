package Chapter3;

public class Operator2 {
    public static void main(String args[]){

        // 삼항 연산자 >> 조건식 ? 결과1 : 결과2;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int result = (num1 > num2) ? num2:num3;

        System.out.println(result);

    }
}
