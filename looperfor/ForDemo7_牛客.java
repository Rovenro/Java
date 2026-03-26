package looperfor;

import java.util.Scanner;

public class ForDemo7_牛客 {
    static void main(String[] args) {
        /*
        数列之和
        计算以下数列的和
        S(n)=1-2+3-4+···
        输入：4
        说明：S(4)=1-2+3-4=-2
        输出：-2
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                sum = sum - i;
            } else {
                sum = sum + i;
            }

        }
        System.out.println("前n项和为:" + sum);

    }
}
