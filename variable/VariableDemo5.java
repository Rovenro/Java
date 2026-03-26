package variable;

import java.util.Scanner;

public class VariableDemo5 {
    static void main(String[] args) {
        /*

               键盘录入：
                    1.找到scanner
                    2.用scanner运行
         */

//        1. 创建Scanner对象
        Scanner sc = new Scanner(System.in);

//        2.用scanner运行
//        接收键盘录入的整数、小数、字符
        int a = sc.nextInt();
        System.out.println(a);

        double b = sc.nextDouble();
        System.out.println(b);

        char c = sc.next().charAt(0);
        System.out.println(c);

        String d = sc.next();
        System.out.println(d);
    }
}
