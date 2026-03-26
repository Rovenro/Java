package variable;

public class VariableDemo4 {
    static void main(String[] args) {
        //BMI = 体重/身高的平方

        //1.定义变量记录体重
        double weight = 80.5;

//        2.定义变量记录身高
        double height = 1.7;

//        3.定义变量记录BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
}
