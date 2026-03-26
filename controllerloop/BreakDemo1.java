package controllerloop;

public class BreakDemo1 {
    static void main(String[] args) {
        /*
        break关键字：
        不能单独出现，只能写在switch循环
         */

//        循环的快捷生成方式：次数.fori+回车
        for (int i = 0; i < 66; i++) {
            if (i == 33){
                break;
            }
            System.out.println(i);
        }
    }
}
