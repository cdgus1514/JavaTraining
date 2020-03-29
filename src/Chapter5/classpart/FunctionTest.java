package Chapter5.classpart;

public class FunctionTest {

    public static int addNum(int num1, int num2){
        int result;
        result = num1 + num2;

        return result;
    }

    public static void Test(String text){
        System.out.println(text);
    }

    public static int calcSum(){
        int sum = 0;
        int i;

        for(i=0; i<11; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 110;

        int result = addNum(num1, num2);
        System.out.println(result);

        Test("fuck");

        int sum = calcSum();
        System.out.println(sum);
        System.out.println();



//        Test1 test1 = new Test1();
//
//        test1.age = 40;
//        test1.name = "James";
//        test1.isMarrid = "True";
//        test1.numberOfChildren = 3;
//
//        System.out.println("나이 : " + test1.age);
//        System.out.println("이름 : " + test1.name);
//        System.out.println("결혼여부 : " + test1.isMarrid);
//        System.out.println("자녀 수 : " + test1.numberOfChildren);


        Test1 shopping = new Test1();

        shopping.orderNumber = "201907210001";
        shopping.userId = "abc123";
        shopping.orderDate = "2019년 7월 21일";
        shopping.userName = "홍길순";
        shopping.productNumber = "PD0345-12";
        shopping.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 : " + shopping.orderNumber);
        System.out.println("주문자 아이디 : " + shopping.userId);
        System.out.println("주문 날짜 : " + shopping.orderDate);
        System.out.println("주문자 이름 : " + shopping.userName);
        System.out.println("주문 상품 번호 : " + shopping.productNumber);
        System.out.println("배송 주소 : " + shopping.address);
    }
}
