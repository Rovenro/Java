package ifdemo;

import java.util.Scanner;

public class ifDemo5 {
    static void main(String[] args) {
        /*
        需求：小明每次订外卖都会在多家平台对比
        看哪家优惠力度大
        已知：饱了么App：全场九折
             美单App：满30减10
        问题1：一顿烧烤50元，哪家更划算
        问题2：如果价格不确定，数据由键盘输入而来呢？
         */
    //先写价格
        double price = 50;
        //饱了么
        double bp = price * 0.9;
        //美单
        double mp = price >= 30 ? price - 10 : price;

        if(bp >= mp){
            System.out.println("饱了么更划算");
        } else {
            System.out.println("美单更划算");
        }


        
    }
}
