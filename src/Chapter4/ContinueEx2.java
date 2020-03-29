package Chapter4;

public class ContinueEx2 {
    public static void main(String[] args){

        int dan;
        int cnt;

        for (dan=2; dan<10; dan++){
            if (dan%2 != 0){
                continue;
            }

            for (cnt=1; cnt<9; cnt++){

                if (cnt > dan){
                    break;
                }

                System.out.println(dan + " x " + cnt + " = " + (dan*cnt));
            }
            System.out.println();
        }
    }
}
