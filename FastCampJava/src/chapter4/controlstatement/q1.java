package chapter4.controlstatement;

import java.util.Scanner;

public class q1 {
    public void ifelse(int x, int y, char operator) {
        if(operator == '+') {
            System.out.println(x + " + " + y + " = " + (x+y));
        }
        else if(operator == '-') {
            System.out.println(x + " - " + y + " = " + (x-y));
        }
        else if(operator == '*') {
            System.out.println(x + " * " + y + " = " + (x*y));
        }
        else if(operator == '/') {
            System.out.println(x + " / " + y + " = " + (x/y));
        }
        else System.out.println("e1rror");
    }
    public void switchcase(int x, int y, char operator) {
        switch(operator) {
            case '+' :
                System.out.println(x + " + " + y + " = " + (x+y));
                break;
            case '-' :
                System.out.println(x + " - " + y + " = " + (x-y));
                break;
            case '*' :
                System.out.println(x + " * " + y + " = " + (x*y));
                break;
            case '/' :
                System.out.println(x + " / " + y + " = " + (x/y));
                break;
            default:
                System.out.println("error");
                break;
        }
    }
    public static void main(String[] args) {
        int x, y;
        String insert;
        Scanner scan = new Scanner(System.in);
        q1 ifelse = new q1();
        q1 switchcase = new q1();
        System.out.println("input x");
        x = scan.nextInt();
        System.out.println("input y");
        y = scan.nextInt();
        System.out.println("input operator");
        insert = scan.next();
        char operator = insert.charAt(0);
        ifelse.ifelse(x,y,operator);
        ifelse.switchcase(x,y,operator);


    }
}
