package method;

import java.util.Scanner;

public class Test2 {
    static void main (String []args){
        /*
        统计10名学生的数学成绩（0-100分）
        计算    及格率，平均分，
        并找出  最高分

        要求：
        1.键盘录入10名学生成绩，存入 数组 。
            超出 范围 ，提示“成绩无效，请重新输入”。
        2.定义方法：求及格人数，并根据及格人数求及格率
        3.定义方法：求总分，根据总分求平均分
        4.定义方法：求最大值
         */
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的数学成绩：");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();

            while(num < 0 || num >100){
                System.out.println("成绩无效，请重新输入");
                num = sc.nextInt();
            }
            arr[i] = num;
        }

        int count = getpasscount(arr);
        System.out.println("及格人数:" + count);
        System.out.println("及格率：" + GetPassRate(count, arr.length) + "%");

        double sum = Getsum(arr);
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + GetAver(count, sum));

        System.out.println(printmax(arr));
    }




    public static int getpasscount(int[] arr){
        //求及格人数
        int count = 0;
//        for (int i = 0; i < arr.length; i++)
        for (int score : arr) {
            if (score >= 60) {
                count++;
            }
        }
        return count;
    }
    public static double GetPassRate(int count, int total){
        return count * 100.0 / total;
    }

    public static double Getsum(int []arr){
        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
        for (int score : arr) {
            sum += score;
        }
        return sum;
    }

    public static double GetAver(int count, double sum){
        return sum / count;
    }

    public static int printmax(int []arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("最大值为："+max);
        return max;
    }

}
