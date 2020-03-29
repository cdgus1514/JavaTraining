package Chapter9.TEST1;

public interface Sort {

    public void ascending(int[] arr);
    public void descending(int[] arr);

    default void description(){
        System.out.println("정렬 알고리즘");
    }
}
