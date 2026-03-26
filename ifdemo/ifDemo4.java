package ifdemo;

public class ifDemo4 {
    static void main(String[] args) {
        /*
        定义一个小数表示考试成绩
        判断学生考试成绩
        大于60分输出通过，否则不通过
         */
        //1.定义一个变量表示考试成绩
        double score = 48.5;
        //2.先对成绩进行判断
        if(score >= 0 && score <= 100){
            if(score >= 60){
                System.out.println("通过");
            } else {
                System.out.println("未通过");
            }
        } else {
            System.out.println("成绩无效");
        }



    }
}
