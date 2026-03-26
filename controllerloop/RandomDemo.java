package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    static void main(String[] args) {
        /*
        生成一个1~100之间的随机数，
        用键盘录入模拟猜的动作，
        一直猜，直到猜中为止
         */
        /*
        保底机制：
        小保底：只要3次没猜中，提示用户猜测范围
        大保底：只要10次没猜中，都说猜对了
         */
        Random r = new Random();
        int n = r.nextInt(1, 101);
//        System.out.println(n);
        Scanner sc = new Scanner(System.in);

        int counta = 0;
        int countb = 0;

        while(true){
            System.out.println("请输入一个1~100的数字：");
            int cai = sc.nextInt();

            counta++;
            countb++;

            if(countb == 10){
                System.out.println("恭喜你，猜对了！");
                break;
            }

            if(cai > n ){
                System.out.println("太大了，请重新输入");
            }else if(cai < n){
                System.out.println("太小了，请重新输入");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }

            if(counta%3 == 0){
                System.out.println("随机数范围"+(n-5)+"~"+(n+5));
            }
        }
    }
}
