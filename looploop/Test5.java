package looploop;

public class Test5 {
    static void main(String[] args) {
        /*
        打印菱形
            *
           ***
          *****
         *******
          *****
           ***
            *
         */
        for (int i = 1; i <= 4; i++) {

            for (int k = i; k <= 3; k++) {
                System.out.print(" ");
                }
            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int a = 1; a <= 3; a++){
            for (int m = 1; m <= a; m++){
                System.out.print(" ");
            }

            for (int b = 1; b <= 7-2*a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}