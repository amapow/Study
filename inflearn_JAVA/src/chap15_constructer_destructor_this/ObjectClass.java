package chap15_constructer_destructor_this;

/* public class ObjectClass {
    //생성자가 없어도 컴파일 시점에 자동으로 기본 생성자가 생성
}
*/



public class ObjectClass {
    public int x;
    public int y;

    public ObjectClass(String n, int[] iArr) {
        System.out.println(" -- Object Class ");
        System.out.println("n ---> " + n);
        System.out.println("iArr ---> " + iArr[1]);
    }

    public ObjectClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getInfo() {
        System.out.println(" x --> " + x);
        System.out.println(" y --> " + y);
    }
}