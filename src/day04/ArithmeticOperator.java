package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        System.out.println( 5 + 3 ); //8
        System.out.println( 5 - 3);  //2
        System.out.println( 5 * 3 );  //15
        System.out.println( 5 / 3 );  // 1


        // arithmetical operator between two int -->. another int

        System.out.println( 5 + 3.0d );
        System.out.println( 5 - 3.0d );
        System.out.println( 5 * 3.0d );
        System.out.println( 5 / 3.0f );
        System.out.println( 5 / 3.0d );

        // store above numbers in variables
        // and replace above statements with variables instead
        // dataType result +1 = the calculation here
        // System.out.println ( result+1)

        int num1 = 5;
        double num2 = 3.0d ;
        float num3 = 3.0f;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;

        System.out.println( result1);
        System.out.println( result2);
        System.out.println( result3);
        System.out.println( result4);
        System.out.println( result5);



        //System.out.println ( (c1(5/9))* ((f1-32)));









    }
}
