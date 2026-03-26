package controllerloop;

public class ContinueDemo3_牛客 {
    static void main(String[] args) {
        /*
        从1开始数数，遇到含有数字4或数字是4的倍数
        则跳过这个数字报下一个
        请列出1到n之间所有既不包含4又不是4的倍数的数字
        满足：1<=n<=100000
         */
        for (int i = 0; i < 100000; i++) {
            if(i%4 == 0 || i%10 == 4 || i/10 == 4 || i/100 == 4 || i/1000 == 4 || i/10000 == 4 || i/100000 == 4){
                continue;
            }
            System.out.println(i);
        }

    }
}
