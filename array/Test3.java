package array;

import java.util.Random;

public class Test3 {
    static void main(String[] args) {
        /*
        打乱数组中的数据
        已知数组元素为{1,2,3,4,5,6,7,8,9,10}
         */

        //交换数据
       /* int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);*/

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
