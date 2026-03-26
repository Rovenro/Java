package variable;

public class VariableDemo1 {
    public static void main(String[] args) {
         /*微信余额：0元
    支付宝余额：10元
    银行卡余额：20元
    问题一：一共多少钱？
    问题二：微信收了10元红包，又发了2元红包，余额多少？*/

//    定义一个变量记录微信余额
        double a = 0;
//    定义一个变量记录支付宝余额
        double b = 10;
//    定义一个变量记录银行卡余额
        double c = 20;
//    计算总金额
        System.out.println(a+b+c);
//        微信收了10元红包
//        原来的余额+10元=新的余额
//        让变量a记录新的余额
        a = a+10;
//        微信发了2元红包
        a = a-2;
        System.out.println(a);
    }
}
