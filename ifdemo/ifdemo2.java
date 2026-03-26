package ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    static void main(String[] args) {
        /*
        需求：初始最大生命200，收到x点伤害，技能恢复y点血，x和y由键盘录入而来
        假设，游戏人物不会死亡，最少1点血
        问：最终游戏人物血量是多少？
         */
        //1.定义变量
        int hp = 200;
        System.out.println("请输入当前人物受到的伤害：");

        //2.键盘输入数据
        Scanner sc = new Scanner (System.in);
        int hurt = sc.nextInt();

        //3.计算当前血量
        hp -= hurt;

        //4.不会死亡，最少一点血
        if(hp <= 0){
            hp = 1;
        }

        System.out.println("当前人物的血量："+hp);

        //5.键盘输入技能恢复的血量
        System.out.println("请输入技能恢复的血量：");
        int add = sc.nextInt();

        //6.计算当前血量
        hp += add;

        if(hp > 200){
            hp = 200;
        }
        System.out.println("当前人物的血量："+hp);
    }
}
