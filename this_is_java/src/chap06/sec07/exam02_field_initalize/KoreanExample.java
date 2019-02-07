package chap06.sec07.exam02_field_initalize;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("박자바", "0109937-9937390");
        Korean k2 = new Korean("박자보", "0109394-4432790");
        System.out.println(k1.nation + k1.name + k1.ssn);
        System.out.println(k2.nation + k2.name + k2.ssn);
    }
}
