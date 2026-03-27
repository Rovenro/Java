package array;

public class Test8_leetcode {
    static void main(String[] args) {
        /*
        给两个有序数组arr1和arr2
        将两个数组合并到一个大数组中
        要求：合并后的大数组也是有序的
         */

        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for (int m = 0; m < arr3.length; m++) {
            System.out.print(arr3[m] + " ");
        }
    }
}
