package ifdemo;

import java.util.Scanner;

public class ifDemo13 {
    static void main(String[] args) {
        /*
        输入变量x,y,判断点所在区域：
        情况1：原点
        情况2：第1.2.3.4象限
        情况3：在y轴上
        情况4：在x轴上
         */
        System.out.println("输入变量x,y:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("原点");
        }else if(x==0){
            System.out.println("在y轴上");
        }else if(y==0){
            System.out.println("在x轴上");
        }else{
            if(x>0 && y>0){
                System.out.println("第1象限");
            }else if(x<0 && y>0){
                System.out.println("第2象限");
            }else if(x<0 && y<0){
                System.out.println("第3象限");
            }else{
                System.out.println("第4象限");
            }
        }

    }
}
