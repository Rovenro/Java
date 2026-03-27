package array;

import java.util.Scanner;

public class Test7_leetcode {
    static void main(String[] args) {
        /*
           两数之和：
           给定一个整数数组 nums 和一个整数目标值 target，
           请你在该数组中找出 和为目标值 target  的那 两个 整数，
           并返回它们的数组下标。

           你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
           你可以按任意顺序返回答案。
           找到全部符合题意的条件
           输入：nums = [2,7,11,15], target = 9
           输出：[0,1]
           解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length = sc.nextInt();

        int nums[] = new int[length];
        System.out.println("请输入数组元素：");
        for(int i = 0;i < nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("请输入目标值：");
        int target = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println("["+ i +"," + j +"]");
                    continue;
                }
            }
        }
    }
}
