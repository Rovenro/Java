package variable;

import java.util.Scanner;

public class VariableDemo6 {
    static void main(String[] args) {
       /*
       定义两个整数类型的变量num1和num2，键盘录入数据分别为两个变量赋值。
       求两个数的和并进行打印
        */

//        1.找scanner
        Scanner sc = new Scanner(System.in);

//        2.用scanner运行
        System.out.println("请输入两个整数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}
