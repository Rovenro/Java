package variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        /*
        定义8种数据类型的变量：

        整数类型：byte，short，int，long
        浮点类型：float，double
        字符类型：char
        布尔类型：boolean

        变量的定义格式：
            数据类型 变量名 = 值;
         */

//        1.定义byte数据类型的变量：
        byte a = 127;
        System.out.println(a);

//        2.定义short数据类型的变量：
        short b = 32767;
        System.out.println(b);

        // 3.定义int数据类型的变量：
        int c = 2147483647;
        System.out.println(c);

        // 4.定义long数据类型的变量：
//        定义long类型变量时有后缀L（大小写都可以）
        long d = 9223372036854775807L;
        System.out.println(d);

        // 5.定义float数据类型的变量：
//        定义float类型变量时有后缀F（大小写都可以）
        float e = 3.14F;
        System.out.println(e);

        // 6.定义double数据类型的变量：
        double f = 3.14;
        System.out.println(f);

        // 7.定义char数据类型的变量：
        char g = '好';
        System.out.println(g);

        // 8.定义boolean数据类型的变量：
        boolean h = true;
        System.out.println(h);
    }
}
