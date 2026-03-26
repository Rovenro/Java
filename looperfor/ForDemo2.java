package looperfor;

public class ForDemo2 {
    static void main(String[] args) {
        /*
        需求：实际开发中，如果要获取范围中的每一个数据，就会用到循环。
        要求1：获取1-5的数字
        需求2：获取5-1的数字
         */
        for(int i = 1; i <= 5;i++){
            System.out.println(i);
        }

        for(int i = 5; i >= 1;i--){
            System.out.println(i);
        }
    }
}
