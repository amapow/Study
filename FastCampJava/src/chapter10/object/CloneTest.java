package chapter10.object;


public class CloneTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Book2 book = new Book2("이", 100);
//        Book2 book2 = (Book2)book.clone();

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
}