package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {
 // += , -=, *=, /= , %= are called shorthand operator, compound operator
 // it can simplify the operation if you have same variable
        // there is no space between +=, -=, *=, /=, %=


        int studentOnline = 263;
        studentOnline += 5;
        System.out.println( " 5 people joined the class" + studentOnline);

        studentOnline -= 3;
        System.out.println( " 3 people left the class " + studentOnline);

        studentOnline *= 2;
        System.out.println( " the student count doubled " + studentOnline);

        studentOnline /= 3;
        System.out.println(" the student dropped to 1/3 :" + studentOnline);

        studentOnline %= 3;
        System.out.println( " the reminder is " + studentOnline);














    }
}
