package looperfor;

public class ForDemo3 {
    static void main(String[] args) {
        /*
        在实际开发中，如果要获取一个范围中的每一个数据，也用循环
        求1-5之间的和
         */
        int sum = 0;
        for (int i = 0;i<=5; i++){
            sum = sum + i;
        }
        System.out.println("1-5的数字和为：" +sum);
    }
}
