package ifdemo;

import java.util.Scanner;

public class ifDemo11_练习 {
    static void main(String[] args) {
        /*
        电量计算采取阶梯计费
        0-100度 0.5元/ 度
        100-200度 0.8元/度
        超过200度 1.2元/度
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用电量：");
        int usage = sc.nextInt();
        double cost = 0;
        if(usage >= 0){
            if(usage <= 100){
                cost = usage * 0.5;
            } else if(usage <= 200){
                cost = 100 * 0.5 + (usage - 100) * 0.8;
            } else {
                cost = 100 * 0.5 + 100 * 0.8 + (usage - 200) * 1.2;
            }
        } else {
            System.out.println("输入的电量有误");
        }
        System.out.println("电费是："+cost);
    }
}
