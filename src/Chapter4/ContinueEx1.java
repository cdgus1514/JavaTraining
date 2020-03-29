package Chapter4;

public class ContinueEx1 {
    public static void main(String[] args){

        int num;

        for (num=1; num<101; num++){
            if ((num%3) != 0){
                continue;
            }

            System.out.println(num);
        }
    }
}
