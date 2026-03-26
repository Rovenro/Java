package looperfor;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class ForDemo5 {
    static void main(String[] args) {
        /*
        录入两个数字，表示一个范围
        统计这个范围中
        既能被3整除，又能被5整除的数字有多少个
         */

        Scanner sc = new Scanner (System.in);
        System.out.println("请输入两个数字：");
        int m = sc.nextInt();
        int n = sc.nextInt();

        //求两个数字最大值和最小值
        int max = m > n ? m : n;
        int min = m < n ? m : n;
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);

        int count = 0;
        for(int i = min; i <= max; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println("在" + min + "~" + max + "之间没有满足要求的数字");
        } else {
            System.out.println("能被3整除，也能被5整除的数字有" + count +"个");
        }


    }
}
