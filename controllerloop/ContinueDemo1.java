package controllerloop;

public class ContinueDemo1 {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
