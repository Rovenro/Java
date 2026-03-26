package variable;

public class VariableDemo2 {
    /*
        我方：叉子           对方：长手
        攻击：220            攻击：210
        防御：85              防御：80
        血量：1012.5          血量：1223.3
        技能加成：1.2          技能加成：1.3

        技能造成伤害的公式：攻击 * 技能加成 - 对方防御
        普攻伤害的公式：攻击 - 对方防御

        计算：
            我方第一次进行普通攻击，造成多少伤害，对方剩多少血量?
            我方第二次进行技能攻击，造成多少伤害，对方剩多少血量?

            规则：经常发生改变的数据，用变量记录
     */

    public static void main(String[] args) {
//     1.   定义变量记录我方攻击力
        int attake = 220;
//        2.  定义变量记录我方防御力
        int defense = 85;
//      3.  定义变量记录我方血量
        double blood = 1012.5;
//        4.  定义变量记录技能加成
        double skillAdd = 1.2;

//      5。  定义变量记录对方攻击力
        int attake2 = 210;
//        6.  定义变量记录对方防御力
        int defense2 = 80;
//        7.  定义变量记录对方血量
        double blood2 = 1223.3;
//        8.  定义变量记录对方技能加成
        double skillAdd2 = 1.3;
//        9.  计算我方第一次普通攻击，造成多少伤害，对方剩多少血量?
//        普攻伤害的公式：攻击 - 对方防御
        double damage1 = attake - defense2;
        blood2 = blood2 - damage1;
//        输出对方剩余血量
        System.out.println("对方剩余血量：" + blood2);
//      10.  我方第二次进行技能攻击，造成多少伤害，对方剩多少血量?
//        技能造成伤害的公式：攻击 * 技能加成 - 对方防御
        double damage2 = attake * skillAdd - defense2;
        blood2 = blood2 - damage2;
        System.out.println("对方剩余血量：" + blood2);
    }
}
