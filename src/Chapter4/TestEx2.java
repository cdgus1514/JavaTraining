package Chapter4;

import java.util.Scanner;

public class TestEx2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int std = (num-1)/2;

        for(int i=0; i<std; i++){
            for(int j=std-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<std+1; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=num; k>2*i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
