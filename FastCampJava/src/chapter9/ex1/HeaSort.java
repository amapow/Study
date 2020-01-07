package chapter9.ex1;

public class HeaSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println("HeaSort ascending");
    }

    @Override
    public void description() {
        System.out.println("HeaSort");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeaSort descending");
    }
}
