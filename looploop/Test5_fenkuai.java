package looploop;

public class Test5_fenkuai {
    static void main(String[] args) {
        /*
         ******
        ******
       ******
         */

        for (int i = 1; i <= 3; i++){
            for (int j = i;j <= 2;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 3; k++) {
                System.out.print("*");
            }

            for (int l = i; l < 3; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
