package Chapter9.TEST1;

public class HqapSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort acending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        System.out.println("HeapSort 정렬 입니다.");
    }
}
