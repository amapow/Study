package chapter6.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;
        for(int i = 0 , num = 1; i < 10; i++, num++) {
            arr[i] = num;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);

        double[] darr = new double[5];
        double mTotal = 1;
        int count=0;

        darr[0] = 1.1; count++;
        darr[1] = 2.1; count++;
        darr[2] = 3.1; count++;

        for(int i = 0; i < count; i++) {
            mTotal *= darr[i];
        }

        System.out.println(mTotal);

    }
}
