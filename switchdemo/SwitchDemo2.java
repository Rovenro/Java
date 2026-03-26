package switchdemo;

public class SwitchDemo2 {
    static void
    main(String[] args) {
        /*
        括号内的表达式：字符/整数/枚举/字符串
        case只能是真实的数据(不能是变量），不能重复
        break表示中断
        所有情况不匹配，默认执行default
         */
        /*
        switch的三种形式
         */
        int number = 2;
        switch(number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这个数字");
                break;
        }


        switch(number){
            case 1,2->System.out.println("一");
        }



        String name = switch(number){
            case 1 -> "一";
            case 2 -> "二";
            case 3 -> {
                yield "三";
            }
            default -> "没有这个数字";
        };
        System.out.println(name);
    }
}
