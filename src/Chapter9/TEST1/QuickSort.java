package Chapter9.TEST1;

public class QuickSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort acending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        System.out.println("QuickSort 정렬 입니다.");
    }
}
