package ifdemo;

import java.util.Scanner;

public class ifDemo12 {
    static void main(String[] args) {
        /*
        键盘录入任意3个大于0的小数，判断构成什么类型的三角形
        类型：等边、等腰、普通、直角、无效
        条件：两边之和大于第三边
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三个边长：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //判断是否构成三角形
        if (a+b>c && a+c>b && b+c>a){
            //判断类型
            if (a==b && b==c ){
                System.out.println("等边三角形");
            } else if (a==b || b==c || a==c){
                System.out.println("等腰三角形");
            } else if (a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
                System.out.println("直角三角形");
            } else {
                System.out.println("普通三角形");
            }
        } else {
            System.out.println("无效三角形");
        }
    }
}
