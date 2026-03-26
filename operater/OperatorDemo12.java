package operater;
import java.util.Scanner;
public class OperatorDemo12 {
    static void main(String[] args) {
        /*
        键盘输入一个四位整数，判断这个数是否是回文数
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int number = sc.nextInt();
        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number % 100 / 10;
        int d = number % 10;
        boolean result = a == d && b == c;
        System.out.println(result);
    }
}
