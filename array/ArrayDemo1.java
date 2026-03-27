package array;

public class ArrayDemo1 {
    static void main(String[] args) {
        /*
        数组的静态初始化：
        1.定义数组存储3位同学的年龄
        2.定义数组存储5位同学的身高
        3.定义数组存储3位同学的名字
         */

       /* 静态初始化：
        [] 数组名 = new 数据类型[]{元素1,元素2,元素3};
        简写：
         数据类型[] 数组名 = {元素1,元素2,元素3};*/

        int[] ageArr1 =new int[]{18,19,20};
        int[] ageArr2 = {18,19,20};

        double[] heightArr1 = new double[]{1.78,1.68,1.88,1.68,1.99};
        double[] heightArr2 = {1.78,1.68,1.88,1.68,1.99};

        String[] nameArr1= new String[]{"张三","李四","王五"};
        String[] nameArr2 = {"张三","李四","王五"};
    }
}
