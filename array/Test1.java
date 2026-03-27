package array;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        /*
        查找数据：
        已知数组元素为{33，5,22,44,55,33}
        键盘录入任意一个数据，查找这个数据在数组中是否存在
        如果数组中要查找的数据出现多次，
        显示第一次的索引即可：
        输出要求：
            如果索引存在即打印
            如果不存在，提示：“该数据不存在"
         */

        int arr[] ={33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int num = sc.nextInt();

        //记录数组中是否存在num  true/false
//        boolean flag = false;

        //法2：统计数组中num出现的次数
        int count = 0;

        //查找是否存在
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(i);
//                flag = true;
                break;
            }
        }

        /*if (!flag){
            System.out.println("该数据不存在");
        }*/

        if (count == 0){
            System.out.println("该数据不存在");
        }

}

}