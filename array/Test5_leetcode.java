package array;

import java.util.Random;

public class Test5_leetcode {
    static void main(String[] args) {
        /*
        获取10个0—100之间的随机数
        存入数组，要求保证数据是唯一的
         */

        int arr[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(101);//表示1-100
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(num == arr[j]){
                    count++;
                    break;
                }
            }
            if (count == 0){
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


