package chapter6.array;

public class ObjectCopy2 {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("little print1", "kim");
        library[1] = new Book("little print2", "kim");
        library[2] = new Book("little print3", "kim");
        library[3] = new Book("little print4", "kim");
        library[4] = new Book("little print5", "kim");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i<library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
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
