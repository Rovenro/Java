package operater;
import java.util.Scanner;
public class OperatorDemo11 {
    public static void main(String[] args) {
        /*
        练习2：键盘录入一个数字，判断该数字是否不在1-10之间
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        boolean result = number <= 1 || number >= 10;
        System.out.println(result);

    }
}
