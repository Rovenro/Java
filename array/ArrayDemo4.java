package array;

import java.util.Scanner;

public class ArrayDemo4 {
    static void main(String[] args) {
        /*
        键盘录入5个整数，存入数组中，并遍历
         */
        int[]arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();

            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        }
    }
