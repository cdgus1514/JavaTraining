package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2262 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diff = 0;
//        System.out.println(n);

        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }

        int max = n;

        for(int i=0; i<n-1; i++){
            int idx = list.indexOf(max);
            System.out.println("idx >> "+idx);
            System.out.println("list.size()-1 >> " + (list.size()-1)+"\n");

            if(idx == 0){   // 첫번째 인덱스인 경우
                diff += list.get(idx) - list.get(idx+1);
            }
            else if(idx == list.size()-1){  // 마지막 인덱스인 경우
                diff += list.get(idx) - list.get(idx-1);
            }
            else{
                diff += Math.min(list.get(idx) - list.get(idx+1), list.get(idx) - list.get(idx-1));
            }
            list.remove(idx);
            max --;
        }
        System.out.println(diff);

        System.out.println(list.indexOf(2));   // 해당 값의 인덱스 출력
        System.out.println(list.get(1));            // 해당 인덱스의 값 출력
    }
}
