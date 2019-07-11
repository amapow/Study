public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Developer tom = new Developer("Tom", Integer.parseInt(args[0]));
        Developer john = new Developer("John", Integer.parseInt(args[1]));
        Developer sally = new Developer("Sally", Integer.parseInt(args[2]));
        // 연봉 출력
        System.out.println(tom.salary());
        System.out.println(john.salary());
        System.out.println(sally.salary());
    }
}
class Developer {
    /* 1. 필드를 구현 하시오. */
    String name;
    int year;
    /* 2. 생성자를 구현하시오. */
    public Developer(String n, int y) {
        name = n;
        year = y;
    }
    /* 3. 메소드를 구현하시오. */
    public int salary () {
        int salary = 0;
        if(year < 3) {
            salary =  2800 + (100 * year);
        }
        if(year > 3 && year < 7) {
            salary =  3500 + (100 * year);
        }
        if(year > 7) {
            salary =  4500 + (100 * year);
        }
        return salary;
    }
}