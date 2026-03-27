package method;

public class MethodDemo6_重载 {
    static void main (String []arg){
        /*
        同一个类中，定义了多个 同名 方法，它们功能相似，构成重载
        参数 个数、类型、顺序 不同， 无需看返回值

        一般不写顺序不同的方法，程序会因不知道哪个是最优解而报错
         */
        int a = 10;
        int b = 20;
        System.out.println(Getsum(a,b));
        //优先使用形参、实参一一对应的方法，没有会使用隐式转换
        //void没有返回值，return可以省略不写
    }
    /*public static double Getsum(int a, int b){
        return a + b;
    }

    public static double Getsum(double a, int b){
        return a + b;
    }*/

    public static double Getsum(int a, double b){
        return a + b;
    }

    public static double Getsum(double a, double b){
        return a + b;
    }
}
