package Chapter9.TEST1;

public class BubbleSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort acending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 정렬 입니다.");
    }
}
