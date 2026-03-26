package controllerloop;

public class ContinueDemo2 {
    static void main(String[] args) {
        /*
        循环打印1~100之间的数字，
        如果数字包含7或者是7的倍数，
        输出“过”
         */
        for (int i = 0; i < 100; i++) {
            if(i%7 == 0||i%10 == 7||i/10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
