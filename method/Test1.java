package method;

import java.util.Scanner;

public class Test1 {
    static void main (String []args){
        /*
        评委打分：
        五个评委，分数在0~100之间
        去掉 最高 和 最低 分
        要求：1.用键盘录入5个整数 存入数组 中，分数超出范围则需重新录入
             2.定义方法求最大最小值
             3.计算总分
             4.总分 - 最大值 - 最小值，求选手最终平均分
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评分，需为5个整数:");

        int arr[] = new int[5];
        int sum = 0;
        double aver = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();

            while(num < 0 || num > 100){
                System.out.println("分数超出范围，请重新输入");
                num = sc.nextInt();
            }

            arr[i] = num;
            sum += arr[i];
        }


        int max = printmax(arr);
        int min = printmin(arr);

        aver = (sum - max - min)/3.0;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + aver);


    }

    public static int printmax(int arr[]){
        int max = arr[0];
        for (int i = 0; i < 5; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为："+max);
        return max;
    }

    public static int printmin(int arr[]){
        int min = arr[0];
        for (int i = 0; i < 5; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为："+min);
        return min;
    }
}
