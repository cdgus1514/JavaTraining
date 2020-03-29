package Chapter5.hiding;

public class MyDate {

//    int day;
//    int month;
//    int year;

//    // 같은 패키지가 아닌경우, public 접근제어자가 필요함
//    public int day;
//    public int month;
//    public int year;

    // 같은 패키지에 있어도 private 접근제어자로 설정된 경우, 사용 불가능 → public 메소드를 만듬
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month) {
        if (month<1 || month>12){
            isValid = false;
        }
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void showDate(){
        if (isValid){
            System.out.println(year + "년 " + month +"월 " + day + "일");
        }
        else {
            System.out.println("유효하지 않은 날짜  입니다.");
        }
    }
}
