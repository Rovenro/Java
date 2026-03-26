package operater;

public class OperatorDemo6 {
    static void main(String[] args) {
        /*
        实现字母大小写转换，
        将大写字母转换为小写字母
         */
        //A-->a

        //1.定义变量记录大写字母
        char c = 'A';

        //2.转成小写
        //      65 + 32
        char cc =(char) (c + 32);
        System.out.println(cc);
    }
}
