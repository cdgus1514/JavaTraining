package Chapter3;

public class Operator3 {
    public static void main(String args[]){

        // 비트 연산자 >> 비트 단위
        // ~ : 비트반전(1의 보수)
        // & : 비트단위 AND (1&1 = 1 그외 0)
        // | : 비트단위 OR  (0|0 = 0 그외 1)
        // ^ : 비트단위 XOR (서로 다를경우만 1)


        int num1 = 0B00001010;  // 10
        int num2 = 0B00000101;  // 5

        int num3 = 0B00001001;  // 9

        System.out.println(num1 & num2);
        System.out.println(num1 & num3);

        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);

        System.out.println(num2 << 1);
        System.out.println(num2 << 3);
        System.out.println(num2);
        System.out.println(num2 <<= 3);
        System.out.println(num2);
    }
}
