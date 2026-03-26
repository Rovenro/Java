package looploop;

import looperfor.ForDemo1;

public class Test6_kongxin {
    static void main(String[] args) {
        /*
        打印空心菱形
           *
          * *
         *   *
          * *
           *
         */

        for (int i = 0; i < 3; i++) {

            for (int j = i; j < 2; j++) {
                System.out.print("#");
            }
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < i; l++){
                System.out.print("#");
            }



            System.out.println();
        }
    }
}
