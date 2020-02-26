package office_hour;

import java.util.Scanner;

public class Repl_155 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        System.out.println("next 3 are:" );
        next3(num);



    }

    public static void next3(int arg){
        String  result = (arg+1) + " " + (arg+2)+ " " + (arg+3);
        System.out.println(result);

    }
//    Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.
//
//enter number
//1
//next 3 are:
//2 3 4
//
//(put a space between numbers)
}