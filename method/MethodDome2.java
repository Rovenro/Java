package method;

import java.util.Random;

public class MethodDome2 {
    static void main(String[] args) {
        /*
        获取10个1-100之间的随机数并存入到数组中
        保证数据是唯一的
         */
        int arr[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;//表示1-100

            if (!contains(num, arr)){
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //定义一个方法，判断num在数组arr中是否存在
    public static boolean contains(int num, int []arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
