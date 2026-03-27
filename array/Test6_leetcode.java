package array;

public class Test6_leetcode {
    static void main(String[] args) {
        //给定义一个递增有序数组，去除重复元素
        int arr[] = {1,1,2,2,2,2,3,3,3,3};

        int slow = 0;
        int fast = 1;

        while(fast < arr.length){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
