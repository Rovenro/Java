package looperwhile;

public class WhileDemo2 {
    static void main(String[] args) {
        /*
        区别：
        for 循环:知道循环次数或范围
        while 循环:只知道结束条件，不知道循环次数或范围

        练习题
        假设投资100000，银行复利1.7%，
        问多少年后能实现本金翻倍
         */
        double money = 100000;
        double expect = 200000;
        int year = 0;

        while(money < expect){
            money = money * 1.017;
            year++;
        }
        System.out.println("第" + year + "年后，本金翻倍");

        //计算单利
        money = 100000;
        System.out.println(100000 / (money * 0.017));
    }
}
