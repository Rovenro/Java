package operater;
import java.util.Scanner;
public class OperatorDemo10 {
    public static void main(String[] args) {
        /*
        练习1：键盘录入一个数字，判断该数字是否在1-10之间
        练习2：键盘录入一个数字，判断该数字是否不在1-10之间
         */

//        练习1：
//        1.用键盘录入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();

//        2.判断
        boolean result = number >= 1 && number <= 10;
        System.out.println(result);
    }
}
