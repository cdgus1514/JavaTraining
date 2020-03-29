package Chapter4;

public class WhileEx1 {
    public static void main(String[] args){

        int num = 1;
        int sum = 0;

        while (num < 11){
            sum += num;
            num ++;
        }

        System.out.println("sum : " + sum);
        System.out.println("num : " + num);

    }
}
