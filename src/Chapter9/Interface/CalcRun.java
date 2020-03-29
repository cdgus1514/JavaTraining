package Chapter9.Interface;

public class CalcRun {
    public static void main(String[] args) {

        CompleteCalc calc = new CompleteCalc();
        //Calc calc = new CompleteCalc();

        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));

        calc.showInfo();
        calc.description();

        // 인스턴스 생성 없이 바로 사용가능
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}
