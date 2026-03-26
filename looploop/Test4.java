package looploop;

public class Test4 {
    static void main(String[] args) {
         /*
        打印梯形
              ***
             *****
            *******
         */

        for (int i = 1; i <= 3; i++) {

            for (int k = i; k <= 2; k++) {
                System.out.print(" ");
            }
//            若j=i，图形为直角梯形 ？
            for (int j = 1; j <= 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
