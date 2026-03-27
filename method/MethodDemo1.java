package method;

public class MethodDemo1 {
    static void main(String[] args) {
        /*
        定义一个方法，求两个数的和
         */

        /*定义格式：public static 返回值类型 方法名（参数1, 参数2...）{
                   方法体;
                   return 返回值;
                }*/
        /*
        注意：1.方法与方法之间是平级关系，不能互相嵌套
             2.方法不会主动运行，需要被调用
             3.小括号中参数要一一对应（个数，类型）

         调用格式：方法名（参数1，参数2...）;
         */
        int add = getSum(10,20);
        System.out.println(add);

        System.out.println(getSum(10,20));
    }
    public static int getSum(int a, int b){
            int sum = a + b;
            return sum;
    }
}
