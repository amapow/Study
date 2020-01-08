package chapter10.object;

public class EqualsTest {


    public static void main(String[] args) {

        Student lee1 = new Student("lee", 100);
        Student lee2 = new Student("lee", 100);

        System.out.println(lee1 == lee2);
        System.out.println(lee1.equals(lee2));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1);
        System.out.println(i2);


        // 같은 값과 같은 주소를 갖더라도 해쉬코드는 다름
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
    }
}

class Student {
    String name;
    int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //중요, 메모리는 다르지만 논리적으로 같은 값을 갖는 경우 아래와 같이 equals()와 hashCode()의 재정의 필요
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.ID == std.ID) {
                return true;
            }
            else
                return false;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}
