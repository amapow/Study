package chapter9.ex1;

public class QuickSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        System.out.println("QuickSort");
    }
}
