package office_hour;

import java.util.Scanner;

public class Repl_148 {
    public static void cube() {
        //your code here
        Scanner scan =new Scanner(System.in);
        int cube=0;
        int num=scan.nextInt();
        cube =num*num*num;
        System.out.println(cube);
    }//end cube

    public static void main(String[] args) {

        cube();

    }
}
//Given method called cube. Write all required code inside
// this method in order  to asks the user for a number and
// then prints the cubed value of that number:
//
//Example:
//
//input: 5
//output: 125
//
//hint: cube of a number n = n*n*n