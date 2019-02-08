package chap06.sec08.exam01_method_declaration;

public class CalculatorExample {
    public static void main(String[] args){
        Calculator myCal = new Calculator();
        myCal.powerOn();
        int result1 = myCal.plus(10, 20);

        byte x = 10;
        byte y = 4;
        double result2 = myCal.divide(x, y);

        System.out.println("result 1 : " + result1);
        System.out.println("result 2 : " + result2);
    }
}
