package Chapter3;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day;

        switch (month){
            case 2:
                day = 28;
                break;
            case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            default:
                day = 30;
                break;
        }

        System.out.println(month + "월은 " + day +"일 입니다.");
    }
}
