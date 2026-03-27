package method;

public class MethodDemo4 {
    static void main (String []arg){
        printMulTable();
    }
public static void printMulTable() {
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + "*" + i + "=" + i * j + "\t");
        }
        System.out.println();
    }
}


}
