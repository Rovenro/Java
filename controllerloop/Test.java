package controllerloop;

import java.util.Random;

public class Test {
    static void main(String[] args) {
        /*
        生成一个1~100之间的随机数，
        用键盘录入模拟猜的动作，
        一直猜，直到猜中为止
         */
//找到Random的类
        /*
        生成随机数的方法
        1.int r = new Random(); 默认在int的范围内生成
        2.在括号内填数字范围，但不包含这个数字
        3.在括号内填a，b两个数字，表示两数之间的范围，包含a，不包含b
         */
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(10);
            System.out.println(n);
        }

    }
}
