package array;

public class Test2 {
    static void main(String[] args) {
        /*
        求最值：
        已知元素为{33，5,22,44,55}
        找出数组中的最大值和最小值并打印

        max初始化不能为0，因为数组中可能存在负数
        其记录值一定要是里面的元素
         */

        int arr[] ={33,5,22,44,55};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //求最小值
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min){
                min = arr[j];
            }
        }

        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }
}
