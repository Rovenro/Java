package looperfor;

public class ForDemo6_牛客 {
    static void main(String[] args) {
        /*
        数字规律
        有一组特殊数字，从第三项开始
        每项都是前两项的数字和，请问第10项的数字是多少？
        0 1 1 2 3 5 8 13 21 34 55 89
         */

        //1.定义变量保存前两项数字
        int a = 0;
        int b = 1;

        //2.定义变量，表示a b后面那一项
        int c = 0;

        //3.用循环获取这些特殊数字每一项的值
        for (int i = 3; i <= 10; i++){
            //题目说明从第三项开始，所以i从3开始
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);

    }
}
