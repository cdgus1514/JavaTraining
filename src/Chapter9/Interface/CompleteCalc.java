package Chapter9.Interface;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n1, int n2) {
        if (n2 == 0)
            return ERROR;
        else
            return n1 / n2;
    }

    public void showInfo(){
        System.out.println("구현 완료");
    }

//    @Override
//    public void description() {
//        System.out.println("재정의한 메서드");
//    }

}
