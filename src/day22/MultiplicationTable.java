package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("1 x 1 = " + 1 * 1);
        System.out.println("1 x 2 = " + 1 * 2);
        System.out.println("1 x 3 = " + 1 * 3);

//        for (int base = 1; base <=3 ; base++) {
//
//
//   //         System.out.println("1 x 1 = " + 1 * 1);
//            System.out.println("1 x " + base + " = " + 1 * base);

        for (int base = 1; base <= 12; base++) {
            System.out.println("1 x " + base + " = " + 1 * base);

        }


        System.out.println(" ======================================");
//        System.out.println( "2 x 1 = " + 2 * 1 );
//        System.out.println( "2 x 2 = " + 2 * 2 );
//        System.out.println( "2 x 3 = " + 2 * 3 );

        for (int c = 1; c <=12 ; c++) {
            System.out.println("2 x " + c + " = " + 2 * c);

        }
        System.out.println("===================================");
        for (int y = 1; y <=5 ; y++) {
            System.out.println("3 x " + y + " = " + 3 * y);

        }
        System.out.println("=========================================");
        for (int d = 1; d <=4 ; d++) {
            System.out.println("4 x " + d + " = " + 4 * d);
        }

        /*
         * Plain english logic
         * write a code to generate multiplication table of 1 number
         * then repeat it 10 times to generate multiplication table from 1 - 10
         * */

        for (int timesTable = 1; timesTable <= 10 ; timesTable++) {
            System.out.println("Multiplication Table of " + timesTable);


            for (int d = 1; d <= 12; d++) {
                System.out.println(timesTable + " x " + d + " = " + timesTable * d);


            }


        }
    }
}
