package looploop;

public class zhenbuhui {
        static void main(String[] args) {
            for (int i = 0; i < 3; i++) {

                for (int j = i; j < 2; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                if (i > 0) {
                    for (int k = 0; k < i * 2 - 1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = 1; i <= 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                if (i < 2) {
                    for (int k = 0; k < (2 - i) * 2 - 1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

