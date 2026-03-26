package operater;

public class OperatorDemo1 {
    static void main(String[] args) {
        /*
        算数运算符：+ - * / %
        整数计算、小数计算
         */

        //1.整数计算
        //整数相除还是整数
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("-----------------------------");

        //2.小数计算

        //小数直接参与计算，结果可能不精确
        double c = 1.1;
        double d = 1.01;

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }
}
