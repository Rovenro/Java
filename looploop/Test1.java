package looploop;

public class Test1 {
    static void main(String[] args) {
        /*
        打印四行五列“*”
        *****
        *****
        *****
        *****
        限定，每次只能输出一个*
         */
        /*
        System.out.println();   换行
        System.out.print();   不换行
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
