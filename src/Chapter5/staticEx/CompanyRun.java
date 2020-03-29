package Chapter5.staticEx;

import java.util.Calendar;

public class CompanyRun {
    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // 같은 메모리(유일한 인스턴스) 참조
        System.out.println(company1);
        System.out.println(company2);


        // 달력 불러오기 >> singletone paatern
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);

    }
}
