package Chapter2;

// 명시적 형변환 >> 변환되는 자료형을 명시. 자료의 손실을 발생할 수 있음

public class ExplicitConversion {
    public static void main(String args[]){

        // int 타입은 4byte이므로 데이터 유실이 발생할 수 있음
        int i = 1000;
        byte bNum = (byte)i;

        System.out.println(bNum);


        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1 + (int)fNum;
        int iNum2 = (int)(dNum1 + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
