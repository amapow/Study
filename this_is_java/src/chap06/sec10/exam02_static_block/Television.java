package chap06.sec10.exam02_static_block;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;
    static int From1To10Sum;

    static {
        info = company + "-" + model;

        int sum = 0;
        for(int i = 1; i < 11 ; i++) {
            sum+=i;
        }
        From1To10Sum = sum;
    }
}
