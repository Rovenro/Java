package looploop;

public class Test2 {
    static void main(String[] args) {
        /*
        打印正三角形
         *
         **
         ***
         ****
         *****
         打印倒三角形
         *****
         ****
         ***
         **
         *
         假定每次只输出一个*
         */
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
    }
