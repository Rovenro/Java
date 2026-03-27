package array;

import java.sql.SQLOutput;

public class ArrayDemo3 {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        //用循环遍历数组
        /*for (int i = 0; i <= 4; i++){
            System.out.println(arr[i]);
        }*/

        //获取数组长度
        /*System.out.println(arr.length);
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.println(arr[i]);
        }*/

        /*for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }*/

        //遍历数组的快速生成方式
        // 数组名.fori+回车
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
