package ifdemo;

import java.util.Scanner;

public class ifDemo8 {
    static void main(String[] args) {
        /*
        需求：很多App有不同的优惠券
        假设有以下优惠券
        满10减8
        满50减30
        满100减50
        满200减90

        会员卡：全场8折
        问：优惠券和会员卡不能同时使用，最优惠的价格是多少？
         */
        double price;
        System.out.println("请输入购物金额：");
        Scanner sc = new Scanner(System.in);
        price = sc.nextDouble();
        double dprice = 0;
        if(price > 0){
            if(price >= 200){
                dprice = price - 90;
            } else if(price >= 100){
                dprice = price -50;
            } else if(price >= 50) {
                dprice = price - 30;
            } else if(price >= 10) {
                dprice = price - 8;
            }

            double huiyuan = price * 0.8;
            if(huiyuan < dprice){
                System.out.println("用会员卡更优惠");
                System.out.println("最终价格是："+huiyuan);
            } else {
                System.out.println("用优惠券更优惠");
                System.out.println("最终价格是："+dprice);
            }

        } else {
            System.out.println("输入金额有误");
        }


    }
}
