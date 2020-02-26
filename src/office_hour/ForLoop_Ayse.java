package office_hour;

public class ForLoop_Ayse {

    public static void main(String[] args) {

        for (int n = 1; n <= 5; ++n) {
            System.out.println("Hello Cybertek : " + n + " ");
        }
        for (int num = 1; num <= 5; num += 3) {
            // System.out.println(num);
            System.out.println(num);
        }
        System.out.println("----------");
        for (int num1 = 5; num1 >= 0; num1--) {
            System.out.print(num1 + " ");
        }
        System.out.println();
        for (int numO = 0; numO <= 5; numO++) {
            if (numO % 2 != 0) {
                System.out.print("\n" + numO + " is odd number, ");
            }
        }
        System.out.println();
        for (int numE = 0; numE <= 6; numE++) {
            if (numE % 2 == 0)System.out.println("No more apples :(");

                System.out.print("\n" + numE + " is even number, ");
        }

    }




}
