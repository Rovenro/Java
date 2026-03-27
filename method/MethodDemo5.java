package method;

public class MethodDemo5 {
    static void main (String []arg){
        /*
    给定两个长方形，判断哪个长方形的面积更大?
    如何定义方法?
     */

        double len1 = 10.1;
        double width1 = 5.1;

        double len2 = 9.1;
        double width2 = 6.1;

        double area1 =Getarea(len1, width1);
        double area2 =Getarea(len2, width2);

        if (area1 > area2){
            System.out.println("第一个长方形面积更大");
        } else if (area2 > area1){
            System.out.println("第二个长方形面积更大");
        } else {
            System.out.println("两个长方形面积相等");
        }
    }

    public static double Getarea(double len, double width){
        return len * width;
    }
}
