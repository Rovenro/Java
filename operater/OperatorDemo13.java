package operater;

public class OperatorDemo13 {
    public static void main(String[] args) {
        /*
        寻找7的有缘数，定义一个两位整数，
        只要含有7或者是7的倍数，则是7的有缘数
         */
//        1.定义一个两位数
        int a = 10;

        //包含7：个位或十位是7
        //7的倍数：a%7==0
//        2.获取个位、十位
        int ge = a % 10;
        int shi = a / 10;

//        3.判断
        //ge == 7 || shi == 7 || a%7==0
        boolean result = ge == 7 || shi == 7 || a % 7 == 0;
        System.out.println(result);

    }
}
