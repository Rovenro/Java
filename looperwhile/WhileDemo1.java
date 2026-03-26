package looperwhile;

public class WhileDemo1 {
    static void main(String[] args) {
        /*
        用while循环
        实现连续跳跃10次，用输出语句模拟跳跃的逻辑

        格式：
        初始化语句
        while(条件判断){
            循环体
            条件控制语句
        }
         */
        int i = 1;
        while (i <= 10){
            System.out.println("第" + i + "次跳跃" );
            i++;
        }
    }
}
