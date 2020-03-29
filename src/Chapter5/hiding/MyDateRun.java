package Chapter5.hiding;

import Chapter5.hiding.MyDate;

public class MyDateRun {
    public static void main(String[] args){

        MyDate mydate = new MyDate();

        // 같은 패키지가 아닌 경우, public 접근제어자가 필요함
        // 같은 패키지에 있어도 private 접근제어자로 설정된 경우, 사용할 수 없음 → setter/getter 메소드 사용
//        mydate.day = 10;
//        mydate.month = 7;
//        mydate.year = 2020;

        mydate.setDay(10);
        mydate.setMonth(7);
//        mydate.setMonth(77);
        mydate.setYear(2020);

        mydate.showDate();
    }
}
