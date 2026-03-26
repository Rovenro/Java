package operater;
import java.util.Scanner;
public class OperatorDemo8 {
    static void main(String[] args) {
        /*
        练习1：键盘录入你和朋友的身高，比比谁高
        练习2：键盘录入一个三位数，判断是否能被3整除
         */

        //练习1：
//        1.用键盘录入两个数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double myHeight = sc.nextDouble();
        System.out.println("请输入朋友的身高：");
        double friendHeight = sc.nextDouble();

//        2.比较
        boolean result = myHeight > friendHeight;
        System.out.println(result);
    }
}
