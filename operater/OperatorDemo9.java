package operater;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorDemo9 {
    static void main(String[] args) {
        /*
        练习2：键盘录入一个三位数，判断是否能被3整除
         */

//        1.键盘录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个3位数：");
        int number = sc.nextInt();

//        2.判断
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;

//        3.求和
        int sum = ge + shi + bai;

//        4.判断是否能被3整除
        boolean result = sum % 3 == 0;
        System.out.println(result);

    }
}
