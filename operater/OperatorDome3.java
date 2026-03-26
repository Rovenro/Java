package operater;

public class OperatorDome3 {
    static void main(String[] args) {
        /*
        时间转换
         */

//        1.定义变量记录秒数
        int seconds = 3661;

//        2.计算小时数
        int hours = seconds /3600;
        System.out.println(hours);

//        3.获取分钟数
        int minutes = seconds % 3600 / 60;
        System.out.println(minutes);

//        4.获取秒数
        int second = seconds % 60;
        System.out.println(second);
        System.out.println(hours + ":" + minutes + ":" + second);

    }

    public static class OperatorDemo4 {
        static void main(String[] args) {
            //练习1：
            byte b = 100;
            short s = 200;
            double d = 20.3;

            //请说出下面代码在计算的时候，类型转换的情况
            /*
            *   1.b+s
            * 先把byte，short类型转为int类型
            * 结果：300（int）
            *
            *   2.结果+d
            * int类型会提升为double类型
            * 结果：320.3（double)
            *
             */
            double result = b + s + d;
            System.out.println(result);
        }
    }
}
