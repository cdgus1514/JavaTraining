package Chapter12.Lambda;


// 함수형 인터페이스는 메서드를 2개 이상 생성할 수 없음 → 익명함수로 처리되기 때문

@FunctionalInterface
public interface MyMaxNumber {

    int getMAxNumber(int x, int y);
}
