package switchdemo;

import java.util.Scanner;

public class SwitchDemo3 {
    static void main(String[] args) {
        /*
        利用case的穿透
         */
        /*
        case的选项是有限个的，优先使用switch语句
        判断是一个较大的范围，用if语句
         */
        /*
        根据用户输入的月份，输出季节
        春季：3-5月
        夏季：6-8月
        秋季：9-11月
        冬季：12-2月
         */
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();

        switch(month){
            case 1:
            case 2:
            case 12:
            System.out.println("冬季");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("春季");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("夏季");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("秋季");
            break;
            default:
                System.out.println("输入错误");

        }
    }
}
