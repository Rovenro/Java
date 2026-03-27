package method;

import java.util.Scanner;

public class Test3 {
    static void main(String[] args) {
        /*
        计算快递费用：(首重1kg，超出部分按kg算，不足1kg按1kg算)
        首重1kg：10元；
        超出1-5kg：每kg加2元；
        超出5kg以上：每kg加1.5元。
        键盘录入小数，表示用户快递的重量，计算最终的结果
        要求：
        1.快递重量必须大于0，否则重新输入
        2.不同价位的计算，单独定义一个方法
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入快递的重量：");
        double weight = sc.nextDouble();

        while(weight < 0) {
            System.out.println("重量不得小于0，请重新输入：");
            weight = sc.nextDouble();
        }

        System.out.println(Getprice(weight) + "元");

    }

    public static double Getprice(double weight){
        double price;
        if (weight <= 1){
            price = 10;
        } else if (weight <= 5) {
            price = (weight - 1) * 2 + 10;
        } else {
            price = (weight - 1) * 1.5 + 10;
        }
        return price;
    }


}
