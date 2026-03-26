package ifdemo;

import java.util.Scanner;

public class ifDemo9_练习 {
    static void main(String[] args) {
        /*
        需求：储值卡充值
        充1000送200
        充2000送500
        充3000送700
        充5000送1300
        充10000送2500
        充20000送6000
        充50000送15000
        计算充值不同额度，卡里的余额是多少
         */

        int yu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额");
        int chong = sc.nextInt();
        if(chong > 0){
            if(chong < 1000){
                yu = chong;
            } else if(chong >= 50000){
                yu = chong + 15000;
            } else if(chong >= 20000){
                yu = chong + 6000;
            } else if(chong >= 10000){
                yu = chong + 2500;
            } else if(chong >= 5000){
                yu = chong + 1300;
            } else if(chong >= 3000){
                yu = chong + 700;
            } else if(chong >= 2000){
                yu = chong + 500;
            } else if(chong >= 1000){
                yu = chong + 200;
            }
        } else {
            System.out.println("充值金额不能小于0");
        }
        System.out.println("充值后的余额为:"+yu);

    }
}
