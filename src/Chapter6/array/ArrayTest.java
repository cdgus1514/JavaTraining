package Chapter6.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i=0, num=1; i<arr.length; i++, num++){
            arr[i] = num;
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println(total);
    }
}
