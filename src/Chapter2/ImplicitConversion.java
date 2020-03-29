package Chapter2;

// 묵시적 형변환 >> 덜 정밀한 수(작은 수)에서 더 정밀한 수(큰 수)로 대입되는 경우


public class ImplicitConversion {
    public static void main(String args[]) {

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);


        // 정수타입을 실수타입에 대입하여도 무시적 형변환으로 정상변환
        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum2);
        System.out.println(fNum);

        // float 타임 변수와 int 타입의 변수를 더하는 경우 int → float 형변환 후 계산
        // 계산 후 dobule 형으로 형변환
        // 총 2회 형변환
        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }
}
