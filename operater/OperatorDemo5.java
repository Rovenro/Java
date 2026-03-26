package operater;

public class OperatorDemo5 {
    static void main(String[] args) {
        /*
        练习二：
        检查下面代码，程序运行时是否会报错，
        如果会，请说明错误原因
         */
        short s1 = 100;
        short s2 = 200;
//        byte result2 = s1 + s2;
//        System.out.println(result2);
        //int + int = int
        //修改方案1：
        //      强制转换，这里数据错乱了，一般不要使用
        byte result1 =(byte)(s1 + s2);
        System.out.println(result1);

        //修改方案2：
        int result2 = s1 + s2;
        System.out.println(result2);
    }
}
