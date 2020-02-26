package office_hour;

import java.util.Scanner;

public class Repl_12 {
    public static void main(String[] args) {
//In this assignment you will create a Scanner object and ask user to enter 3 number inputs.
//
//-Declare integer variables num1, num2, num3, sum.
//
//-Create a Scanner object named scan.
//
//-Display prompt "Enter 3 numbers:"
//
//-Using scanner object let user input 3 numbers
//
//-Add 3 numbers and assign to sum variable
//
//-Print "Sum of numbers: ValueOfSum"

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        if(a>b){
            System.out.println(a+" is greater");
        } else if (b > a) {
            System.out.println(b + "is greater");
        }







        }
}
