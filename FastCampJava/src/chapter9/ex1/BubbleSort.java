package chapter9.ex1;

public class BubbleSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println("Bubble Sort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("Bubble Sort descending");
    }

    @Override
    public void description() {
        System.out.println("Bubble Sort");
    }
}
