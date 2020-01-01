package chapter6.array;

public class ObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("little print1", "kim");
        library[1] = new Book("little print2", "kim");
        library[2] = new Book("little print3", "kim");
        library[3] = new Book("little print4", "kim");
        library[4] = new Book("little print5", "kim");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for(Book book : copyLibrary) {
            System.out.println(book);
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        for(Book book : library) {
            book.showBookInfo();
        }
        System.out.println("=================");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

    }
}
