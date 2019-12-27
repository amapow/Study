package chapter4.controlstatement;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        /* int num = 1;
        int sum = 0;

        do {
            sum+=num;
            num++;
        }while(num<=10);

        System.out.println(sum);
        System.out.println(num);*/

        int input, sum=0;
        Scanner scan = new Scanner(System.in);
        do {
            input = scan.nextInt();
            sum+=input;
            System.out.println("sum = " + sum);
        }while(input != 0);
        System.out.println("result = " + sum);

        int winput, wsum=0;
        winput = scan.nextInt();
        while(winput != 0) {
            wsum+=winput;
            System.out.println(wsum);
            winput = scan.nextInt();
        }
    }
}
