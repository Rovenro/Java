package looperwhile;

public class WhileDemo2_经典算法小题 {
    static void main(String[] args) {
        /*
        厚度为0.1毫米的纸
        折叠多少次可以折成
        8848.86米=8848860毫米
         */

        double h = 0.1;
        int count = 0;
        while (h < 8848860){
            h = h * 2;
            count++;
        }
        System.out.println("需要折叠" + count + "次");
    }
}
