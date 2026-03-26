package variable;

import java.util.Scanner;

public class VariableDemo7 {
    static void main(String[] args) {
        /*
        用键盘输入计算BMI
        BMI = 体重/身高的平方
         */

//        1.找到scanner
        Scanner sc = new Scanner(System.in);

//        2.用scanner运行
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.println(bmi);

    }
}
