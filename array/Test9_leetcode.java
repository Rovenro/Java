package array;

public class Test9_leetcode {
    static void main(String[] args) {
       /*
       查找元素：
       给定一个有序数组和目标值，在数组中找到目标值，打印索引。
       如果目标不存在于数组中，打印应插入的位置
        */
        int arr[] = {1, 2, 3, 4, 5};
        int target = 0;
        int cha = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                cha = i;
                break;
            }else if(arr[i] > target){
                cha = i;
                break;
            }
        }

        if(cha == -1){
            cha = arr.length;
        }
        System.out.println(cha);
    }
}
