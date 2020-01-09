package chapter10.string;

public class StringTest {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

    }
}
