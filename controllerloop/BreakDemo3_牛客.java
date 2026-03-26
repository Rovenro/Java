package controllerloop;

import java.util.Scanner;

public class BreakDemo3_牛客 {
    static void main(String[] args) {
        /*
        键盘录入一个大于等于2的整数，
        判断是否为质数
         */

        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true){
            System.out.println("请输入一个大于等于2的整数：");
            n = sc.nextInt();
            if(n >= 2){
                break;
            } else {
                System.out.println("输入的数字小于2，请重新输入");
            }
        }

        int count = 0;
        for (int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                count++;
                System.out.println("不是");
                break;
            }else{
                System.out.println("是");
            }
        }

        if(count == 0){
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }

    }
}
