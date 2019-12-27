package chapter4.controlstatement;

public class BreakContinue {
    public static void main(String[] args) {
        int x,y;

        for(x = 2 ; x <= 9 ; x++) {
            if((x % 2) != 0) continue;
            for(y = 1 ; y <= 9 ; y++) {
                if(y > x) break;
                System.out.println(x + " * " + y + " = " + x*y);
            }
        }
    }
}
