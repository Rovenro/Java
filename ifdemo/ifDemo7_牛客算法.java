package ifdemo;

import java.util.Scanner;

public class ifDemo7_牛客算法 {
    static void main(String[] args) {
       /*
       卡拉兹函数
       给定正整数n,
       若n为奇数，则n=3n+1
       若n为偶数，则n=n/2

       示例
       输入：1
       说明：奇数，n=3*1+1=4
        输出：4
        */
        int n;
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2!=0){
            n = 3*n+1;
        } else {
            n = n/2;
        }
        System.out.println("输出:"+n);
    }

}
