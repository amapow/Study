package chapter9.ex1;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        Sort sort;
        int[] arr = {1,2,3,4,5};

        System.out.println("정렬 방식을 선택");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeaSort");
        System.out.println("Q : QuickSort");

        int ch = System.in.read();

        if(ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        }
        else if(ch == 'H' || ch == 'h') {
            sort = new HeaSort();
        }
        else if(ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        }
        else {
            System.out.println("Error");
            return;
        }

        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }

}
