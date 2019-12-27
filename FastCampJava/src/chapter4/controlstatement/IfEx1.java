package chapter4.controlstatement;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while(true) {
            int score = s.nextInt();
            if(score < 60) {
                System.out.println("F");
            }
            else if(score < 70) {
                System.out.println("D");
            }
            else if(score < 80) {
                System.out.println("C");
            }
            else if(score < 90) {
                System.out.println("B");
            }
            else {
                System.out.println("A");
            }

            if(score > 100) {
                break;
            }
        }

    }
}
