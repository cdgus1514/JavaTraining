package Chapter5.staticEx;

public class Company {

    // 유일한 Company 인스턴스
    private static Company instance = new Company();

    private Company() {}    // 외부에서는 Company 생성자 사용불가


    public static Company getInstance() {

        if (instance == null) {
            instance =  new Company();
        }

        return instance;
    }


}
