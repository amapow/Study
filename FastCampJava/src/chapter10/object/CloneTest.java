package chapter10.object;


public class CloneTest {
        public static void main(String[] args) throws CloneNotSupportedException {


        Book2 book = new Book2("이", 100);
        Book2 book2 = (Book2)book.clone();

            System.out.println(book);
            System.out.println(book2);

    }
}
           // clone()을 사용하는경우 Cloneable interface의 명시가 필요
class Book2 implements Cloneable {
    String name;
    int ID;

    public Book2(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + ", " + ID;
    }
}