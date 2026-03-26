package looperdowhile;

public class DoWhileDemo1 {
    static void main(String[] args) {
        /*
        do{
            循环体;
            条件控制语句;
            } while(条件判断);
         */
        //用do while循环，输出5行"hello world"
        //特点：先执行后判断，至少会循环一次
        int i = 10;
        do{
            System.out.println("hello world");
            i++;
        }while(i <= 5);
    }
}
