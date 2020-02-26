package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive
        /*
       Block comment, everything in between will be seen as comment

       whole numbers     : byte, short, int, double
       fractional number : float, double
       logical number    : boolean,
       character         : char

       usually by default for whole numbers   : just use int
       usually by default for fractioanla number

       IS String par of Primitive types ? : Nooo
       String is sequence of character
         */
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        System.out.println(" I was born in " + birthYear + ", and I am " + age + " years old. " );

        // Task 2 ; you are speeding today
        // speed limit is some number , and your current speed is this
        // generate this output of : you are driving 10mph more than speed limit.

        int speedLimit = 65;
        int currentSpeed = 95;
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println( " You are driving " + overTheLimit + " mph more than speed limit.");
        System.out.println( " i was driving" + currentSpeed + "MPH and speed limit was " + speedLimit + "mph," +
                "that means I was driving " + overTheLimit);







    }
}
