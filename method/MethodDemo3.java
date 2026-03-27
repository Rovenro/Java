package method;

import jdk.dynalink.beans.StaticClass;
import looperfor.ForDemo3;

import java.io.ObjectInputStream;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
        定义一个方法遍历数组
        格式如下：
        [1, 2, 3, 4, 5]
                 */
        int arr[] = {1, 2, 3, 4, 5};
        printArr(arr);
    }
    // 没有返回值的，不需要把结果返回给上面的调用处，
//        此时返回值类型void
    public static void printArr(int []arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
    }
}
