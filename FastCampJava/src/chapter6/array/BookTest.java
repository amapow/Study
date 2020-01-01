package chapter6.array;

public class BookTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];

        for(int i = 0; i<library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("little print1", "kim");
        library[1] = new Book("little print2", "kim");
        library[2] = new Book("little print3", "kim");
        library[3] = new Book("little print4", "kim");
        library[4] = new Book("little print5", "kim");

        for(int i = 0; i<library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
