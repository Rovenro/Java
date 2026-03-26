package ifdemo;

import java.util.Scanner;

public class ifDemo10_练习 {
    static void main(String[] args) {
        /*
        计算BMI
        公式：BMI = 体重/身高的平方
        <18.5 消瘦
        18.5-23.9 正常
        24.0-26.9 偏胖
        27.0-29.9 肥胖
        >=30 严重肥胖
         */
        double weight = 0;
        double height = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        weight = sc.nextDouble();
        System.out.println("请输入身高：");
        height = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("BMI="+bmi);
        if(bmi<18.5){
            System.out.println("消瘦");
        }else if(bmi <= 23.9){
            System.out.println("正常");
        }else if(bmi <= 26.9){
            System.out.println("偏胖");
        }else if(bmi <= 29.9){
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }
}
