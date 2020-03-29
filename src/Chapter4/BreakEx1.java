package Chapter4;

public class BreakEx1 {
    public static void main(String[] args){
        int sum = 0;
        int i;

        for (i=1; ; i++){
            sum += i;

            if (sum > 100){
                break;
            }
        }

        System.out.println(sum);
        System.out.println(i);
    }
}
