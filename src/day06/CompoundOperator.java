package day06;

public class CompoundOperator {

    public static void main(String[] args) {
// assignment operator =
        // -->> will save the result of whatever operation on the right side
        // and assign the result to the  left side variable

        int studentOnline = 263;

        studentOnline = studentOnline + 5 ;

        System.out.println(" 5 people joined " + studentOnline);
        studentOnline = studentOnline-3;
        System.out.println(" 3 people left" + studentOnline);

        studentOnline = studentOnline *2;
        System.out.println("The student doubled " + studentOnline);

        studentOnline = studentOnline/3;
        System.out.println("The student 1/3 " + studentOnline);

        int customer = 8;
        customer = customer + 8 ;
        customer= customer -3;
        customer= customer * 2;
        customer = customer /4;
        customer= customer % 4;
        System.out.println( " finally the store has " + customer);



    }
}
