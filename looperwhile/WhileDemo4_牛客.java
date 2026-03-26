package looperwhile;

import java.util.Scanner;

public class WhileDemo4_牛客 {
    static void main(String[] args) {
        /*
        给定一个整数n，计算其所有数位之和
        若n为负数，先取其绝对值

        输入：12
        说明：1+2=3
        输出：3
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int  n = sc.nextInt();

        if(n < 0){
            n = -n;
        }

        //用循环获取n上的每一位数字
        int sum = 0;
        while(n != 0){
            //获取n的个位
           //System.out.println(n % 10);
            sum = sum + n % 10;
            //去掉个位
            n = n / 10;
        }
        System.out.println("数字的和为:" + sum);
    }
}
