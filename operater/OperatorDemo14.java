package operater;

public class OperatorDemo14 {
    static void main(String[] args) {
        /*
        利用三元运算符，求两个数中的最大值
         */

//        1. 定义变量
        int a = 10;
        int b = 20;

//        2。运算
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a > b ? a : b);
    }

}
