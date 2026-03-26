package ifdemo;

import java.util.Scanner;

public class ifDemo6 {
    static void main(String[] args) {
//        问题2：如果价格不确定，数据由键盘输入而来呢？
        //如果数据由键盘输入
        System.out.println("请输入价格：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        //饱了么
        double bp = price * 0.9;
        //美单
        double mp = price >= 30 ? price - 10 : price;


        System.out.println("饱了么：" + bp);
        System.out.println("美单：" + mp);

        if(bp >= mp){
            System.out.println("饱了么更划算");
        } else {
            System.out.println("美单更划算");
        }

    }
}
