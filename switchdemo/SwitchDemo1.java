package switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        /*
        键盘输入星期，显示活动
        周一：看电影
        周二：跑步
        周三：爬山
        周四：拳击
        周五：追剧
        周六：出去吃饭
        周日：游泳
         */
        /*
        case和default可以在任意位置
        break没写，会从 case开始，找到break结束
         */
        Scanner sc = new Scanner(System.in);
        System .out.println("请输入星期：");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("看电影");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("爬山");
                break;
            case 4:
                System.out.println("拳击");
                break;
            case 5:
                System.out.println("追剧");
                break;
            case 6:
                System.out.println("出去吃饭");
                break;
            case 7:
                System.out.println("游泳");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
