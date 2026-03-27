package array;

public class ArrayDemo2 {
    static void main(String[] args) {
        /*
        数组中元素的访问：
        1. 获取数据
        2. 修改数据
         */

        int[] arr = {10,20,30,40,50};
        //索引：从0开始，连续+1
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[0]);

        System.out.println(arr[1]);

        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
