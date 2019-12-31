package chapter5.staticex;

public class Company {

    private static Company instance = new Company();
    private Company() { }

    public static Company getInstance() {

        if(instance == null) {
            instance = new Company();
        }

        return instance;
    }
    //싱글톤 패턴
}
