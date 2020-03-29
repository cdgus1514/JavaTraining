package Chapter9.TEST1;

import java.io.IOException;

public class SortRun {
    public static void main(String[] args) throws IOException {

        System.out.println("정렬방식 선택");
        System.out.println("B : 버블정렬");
        System.out.println("H : 힙정렬");
        System.out.println("Q : 퀵정렬\n");

        int ch = System.in.read();
        Sort sort = null;

        if (ch == 'B' || ch == 'b'){
            sort = new BubbleSort();
        }else if (ch == 'H' ||  ch == 'h'){
            sort = new HqapSort();
        }else if (ch == 'Q' || ch == 'q'){
            sort = new QuickSort();
        }else {
            System.out.println("잘못 입력");
            return;
        }

        int[] arr = {1,2,3,4,5};
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

    }
}
