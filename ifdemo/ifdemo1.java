package ifdemo;

public class ifdemo1 {
    static void main(String[] args) {
        /*  if的细节
        1.if语句大括号的位置
        2.if语句大括号的省略（只有一行）
        如果多行没用大括号，只保留第一句
        3.小括号后面不能有分号
        4.判断布尔类型的变量（写在小括号里就行）
         */
        /*
        定义一个变量表示人的体温，
        对体温进行判断是否大于等于38度，
        如果超过打印语音警告
         */
        double bodyTemperature = 39;
        if (bodyTemperature >= 38)
            System.out.println("语音警告，当前体温已经超过38度");


    }
}
