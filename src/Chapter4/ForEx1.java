package Chapter4;

public class ForEx1 {
    public static void main(String[] args){

        int cnt;
        int sum = 0;

        for (cnt=0; cnt<11; cnt++){
            sum += cnt;
            System.out.println(cnt);
        }

        System.out.println(sum);
    }
}
