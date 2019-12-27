package chapter4.controlstatement;


import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int i, count, star = 1, n;
        Scanner s = new Scanner(System.in);
        System.out.println("insert n");
        System.out.println(7/2+1);
        n = s.nextInt();
        count = n;
        for(i = 1 ; i <= count/2+1 ; i++) {
            for(int j = 1 ; j <= n/2 ; j++) {
                System.out.print(" ");
            }
            for(int j = n/2 ; j < count - n/2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
            n-=2;
        }
        n = count - 2;
        int line = count - 1;
        for(i = 0 ; i <= count / 2 - 1 ; i++) {
            for(int j = 0 ; j < count - line ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n ; j++) {
                System.out.print("*");
            }
            line--;
            n-=2;
            System.out.println();
        }
    }
}
