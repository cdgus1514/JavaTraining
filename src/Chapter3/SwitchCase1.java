package Chapter3;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rank = sc.nextInt();
        char medalColor;

        switch (rank){
            case 1:
                medalColor = 'G';
                System.out.println("금메달");
                break;
            case 2:
                medalColor = 'S';
                System.out.println("은메달");
                break;
            case 3:
                medalColor = 'B';
                System.out.println("동메달");
                break;
            default:
                medalColor = 'A';   // default를 않쓰는 경우 medalColor 변수에 초기값 줘야함
                break;
        }

        System.out.println(rank + "등은 " + medalColor + "메달 입니다.");
    }
}
