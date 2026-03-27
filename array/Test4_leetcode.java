package array;

import java.util.Random;

public class Test4_leetcode {
    static void main(String[] args) {
        /*
        获取10个1—100之间的随机数
        存入数组，要求保证数据是唯一的
         */

        Random r = new Random();

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;//        int random = r.nextInt(1,101);

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[i] = num;
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}
