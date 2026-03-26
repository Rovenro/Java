package looperfor;

public class ForDemo4 {
    static void main(String[] args) {
        /*要获取符合要求的数据
        要和其他语句结合使用
        求1-100之间的偶数和
         */
        int sum = 0;
        for (int i = 1; i <=100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);

        int sum2 = 0;
        for(int n = 2; n <= 100; n += 2){
            sum2 = sum2 + n;
        }
        System.out.println(sum2);
    }
}
