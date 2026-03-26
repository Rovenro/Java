package looploop;

public class Test3 {
    static void main(String[] args) {
        /*
        打印平行四边形
              ******
             ******
            ******
         */

//外循环：控制行数
        for (int i = 1; i <= 3; i++) {

//            内循环：控制#个数
            for (int j = i; j < 3; j++){
                System.out.print(" ");
            }

//            内循环：控制*个数（平行四边形）
            for (int k = 1; k <= 6; k++){
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
