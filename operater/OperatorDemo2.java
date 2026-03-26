package operater;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorDemo2 {
    /*
    键盘录入一个三位数，
    将其拆分为个位、十位、百位后，
    打印在控制台
     */
    static void main(String[] args) {
        //1.键盘录入一个三位数
        //如果是AI自动生成下面代码，需要点击Scanner.alt+回车（修改错误），选择第一个import即可
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        //alt+p：强制AI自动生成代码
        int number = sc.nextInt();
        System.out.println(number);

        //2.拆分
        //个位
        int ge = number % 10;
        System.out.println("个位是：" + ge);

        //十位
        int shi = number / 10 % 10;
        System.out.println("十位是：" + shi);

        //百位
        int bai = number / 100 % 10;
        System.out.println("百位是：" + bai);
    }
}
